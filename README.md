# Blogging Application Backend

A Spring Boot based backend application for a blogging platform. The application provides REST APIs for managing users, posts, categories, and comments with secure authentication and role-based authorization.

## Features

* User registration and login
* JWT-based authentication and authorization
* Role-based access control (Admin and Normal User roles)
* Create, update, delete, and retrieve blog posts
* Category management
* Comment management
* User profile management
* RESTful API architecture
* Database integration using Spring Data JPA and Hibernate

## Technologies Used

* Java
* Spring Boot
* Spring MVC
* Spring Security
* JWT Authentication
* Spring Data JPA / Hibernate
* MySQL
* Maven
* Swagger API Documentation

## Project Structure

```
com.jasmine.blogapplication
│
├── config
├── controllers
├── entities
├── exceptions
├── payloads
├── repositories
├── security
└── services
```

## API Modules

### Authentication

* User registration
* User login
* JWT token generation

### Users

* Manage user details
* User-related operations

### Posts

* Create and manage blog posts
* Retrieve posts with API endpoints

### Categories

* Create and manage post categories

### Comments

* Add and manage comments on posts

## Setup Instructions

### Prerequisites

Make sure you have:

* Java 17 or above
* Maven
* MySQL

### Clone Repository

```bash
git clone https://github.com/jasmine-4/springboot-blog-application.git
```

### Configure Database

Update `application.properties` with your MySQL credentials:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/blog_app
spring.datasource.username=root
spring.datasource.password=your_password
```

### Run Application

Using Maven:

```bash
./mvnw spring-boot:run
```

The application will start on:

```
http://localhost:8080
```

## API Documentation

Swagger UI is available at:

```
http://localhost:8080/swagger-ui/
```

## Future Improvements

* Deploy application using cloud services
* Add automated testing
* Add advanced search functionality
* Add frontend client integration

## Author

Jasmine

GitHub:
https://github.com/jasmine-4

```
```
