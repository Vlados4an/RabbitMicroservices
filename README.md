# Mirosic Application

Mirosic is a robust microservices-based application developed using Java, Maven, and Spring Boot. The application is architected into several independent services, each responsible for a specific functionality, providing a highly scalable and maintainable system.

## Services

The application is composed of the following services:

1. **Customer Service**: Manages customer-related operations, including registration and profile management.
2. **Fraud Service**: Responsible for performing checks to identify fraudulent activities.
3. **Notification Service**: Handles the dispatch of notifications to customers.
4. **API Gateway**: Serves as the single entry point for all client requests, routing them to the appropriate services.
5. **Eureka Server**: Acts as the service discovery server, managing and routing requests to the available services.

## Technologies

The application leverages a range of modern technologies:

- **Java**: The primary programming language used for development.
- **Maven**: Used for dependency management.
- **Spring Boot**: Facilitates rapid application development.
- **Spring Cloud**: Provides tools for building cloud-native applications.
- **RabbitMQ**: Used for asynchronous messaging between services.
- **PostgreSQL**: The primary database used for persisting data.
- **Docker**: Used for containerization of services.
- **Zipkin**: A distributed tracing system for gathering timing data.

## Setup

Follow these steps to get the application up and running:

1. Ensure Java 21, Maven, Docker, and Docker Compose are installed on your machine.
2. Clone the repository: `git clone https://github.com/Vlados4an/RabbitMicroservices`.
3. Navigate to the project directory: `cd RabbitMicroservices`.
4. Build the project: `mvn clean install`.
5. Start the application: `docker-compose up`.

## Usage

The application exposes a variety of REST APIs for interacting with the services. For instance, to register a new customer, a POST request can be sent to `http://localhost:8080/api/v1/customers`.

## Contributing

Contributions are welcome! For major changes, please open an issue first to discuss the proposed change.

## Contact me:
- ssvetlaa235@gmail.com
- telegram: @evlad03
