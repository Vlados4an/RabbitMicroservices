package ru.erma.notification;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;



@SpringBootApplication(
        scanBasePackages = {
                "ru.erma.notification",
                "ru.erma.amqp"
        }
)
@EnableFeignClients(
        basePackages = "ru.erma.clients"
)

public class NotificationApplication {
    public static void main(String[] args) {
        SpringApplication.run(NotificationApplication.class, args);
    }
}
