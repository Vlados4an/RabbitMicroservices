package com.amigoscode.customer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;


@SpringBootApplication(
        scanBasePackages = {
                "com.amigoscode.customer",
                "ru.erma.amqp"
        }
)
@EnableFeignClients(
        basePackages = "ru.erma.clients"
)

public class CustomerApplication {
    public static void main(String[] args) {
        SpringApplication.run(CustomerApplication.class, args);
    }
}
