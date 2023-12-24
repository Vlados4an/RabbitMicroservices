package ru.erma.fraud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;


@SpringBootApplication
@EnableFeignClients(
        basePackages = "ru.erma.clients"
)
public class FraudApplication {
    public static void main(String[] args) {
        SpringApplication.run(FraudApplication.class, args);
    }

}
