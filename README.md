# Spring Boot API with MySQL Integration

## Overview
This project is a Spring Boot application that integrates with MySQL to provide API functionalities. It includes RESTful endpoints for managing data and uses Spring Data JPA for database operations.

## Features
- Spring Boot framework
- RESTful API endpoints
- MySQL database integration
- Spring Data JPA for CRUD operations
- Exception handling
- Logging and monitoring

## Requirements
- Java 17 or later
- Maven 3.x
- MySQL Server
- Postman or any API testing tool

## Setup Instructions
### 1. Clone the Repository
```sh
git clone git@github.com:osachdev80/RestAPI.git
cd <project-folder>
```

### 2. Configure Database
Update `application.properties` or `application.yml` with your MySQL database credentials:
```
spring.datasource.url=jdbc:mysql://localhost:3306/your_database
spring.datasource.username=your_username
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
```

### 3. Build and Run the Application
```sh
mvn clean install
mvn spring-boot:run
```

### 4. API Endpoints
| Method | Endpoint | Description |
|--------|---------|-------------|
| GET | `/api/items` | Fetch all items |
| GET | `/api/items/{id}` | Fetch item by ID |
| POST | `/api/items` | Create a new item |
| PUT | `/api/items/{id}` | Update an existing item |
| DELETE | `/api/items/{id}` | Delete an item |

### 5. Testing API
Use Postman or curl to test API endpoints.

