package com.amigoscode.customer.services;

import com.amigoscode.customer.dto.CustomerRegistrationRequest;
import com.amigoscode.customer.models.Customer;
import com.amigoscode.customer.repositories.CustomerRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.erma.amqp.RabbitMQMessageProducer;
import ru.erma.clients.fraud.FraudCheckResponse;
import ru.erma.clients.fraud.FraudClient;
import ru.erma.clients.notification.NotificationRequest;

@Service
@AllArgsConstructor
public class CustomerService {
    private final CustomerRepository customerRepository;
    private final FraudClient fraudClient;
    private final RabbitMQMessageProducer rabbitMQMessageProducer;

    public void registerCustomer(CustomerRegistrationRequest request) {
        Customer customer = Customer.builder()
                .firstName(request.firstName())
                .lastName(request.lastName())
                .email(request.email())
                .build();

        customerRepository.saveAndFlush(customer);

        FraudCheckResponse fraudCheckResponse =
                fraudClient.isFraudster(customer.getId());

        if(fraudCheckResponse.isFraudster()){
            throw new IllegalStateException("fraudster");
        }
        NotificationRequest notificationRequest = new NotificationRequest(
                customer.getId(),
                customer.getEmail(),
                String.format("Hi %s, welcome to Amigoscode...",
                        customer.getFirstName())
        );
        rabbitMQMessageProducer.publish(
                notificationRequest,
                "internal.exchange",
                "internal.notification.routing-key"

        );
    }
}
