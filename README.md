# User API - Spring Boot + MongoDB

This project is a simple user management REST API using Java 17, Spring Boot, and MongoDB.

## Features

- Create user (`POST /api/create-user`)
- Update user (`POST /api/update-user`)
- Get all users (`GET /api/users`)
- Toggle user active status (`POST /api/toggle-user?id=<userId>`)

## Tech Stack

- Java 17
- Spring Boot
- MongoDB
- Swagger for API testing

## How to Run

1. Make sure MongoDB is running locally on port 27017.
2. Open this project in IntelliJ IDEA.
3. Run the `UserApiApplication` class.
4. Access Swagger UI at `http://localhost:8080/swagger-ui.html`

## Author

Srijeeta (Intern)
