# Flight Management System

## Overview
The Flight Management System is a RESTful Web Service built using Spring Boot. It provides APIs to manage various aspects of air travel, such as flight schedules, airport information, passenger records, and bookings.

## Features
- **Flights Module**: Manage flight details (create, retrieve, update, delete).
- **Airports Module**: Manage airport information (create, retrieve, update, delete).
- **Passengers Module**: Manage passenger details (create, retrieve, update, delete).
- **Booking Module**: Handle flight bookings for passengers.
- **API documentation** using Swagger/OpenAPI.

## Technologies Used
- Java 17
- Spring Boot 3.3.2
- Spring Data JPA
- MySQL (or your preferred database)
- Swagger/OpenAPI
- Maven

## Prerequisites
- Java 17 or higher
- Maven 3.6 or higher
- MySQL Database (if using MySQL)
- IDE (e.g., IntelliJ IDEA, Eclipse)

## Installation

1. **Clone the Repository**
   ```bash
   git clone https://github.com/yourusername/fms-new.git
   cd fms-new
Configure Database

Update the application.properties or application.yml file with your database connection details.
properties
Copy code
spring.datasource.url=jdbc:mysql://localhost:3306/your_database_name
spring.datasource.username=your_username
spring.datasource.password=your_password


**Build the Project**
mvn clean install

**Run the Application**
mvn spring-boot:run
