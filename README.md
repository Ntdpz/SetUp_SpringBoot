# Spring Boot Backend Setup

## Overview

This repository contains a Spring Boot backend application with Docker and MySQL setup. It includes a basic configuration for handling user data with CRUD operations.

## Project Structure

- **`src/main/java/com/example/springboot_backend`**: Contains the main application code.
  - **`SpringbootBackendApplication.java`**: The entry point of the Spring Boot application.
  - **`controller/UserController.java`**: REST controller for handling HTTP requests related to users.
  - **`entity/User.java`**: Entity class representing the `User` table in the database.
  - **`repository/UserRepository.java`**: Repository interface for interacting with the `User` table.
  - **`service/UserService.java`**: Service interface defining methods for user operations.
  - **`service/UserServiceImpl.java`**: Implementation of the `UserService` interface.
- **`src/main/resources`**: Contains configuration and other resources.
  - **`application.properties`**: Configuration file for Spring Boot.
- **`src/test/java/com/example/springboot_backend`**: Contains test classes.
  - **`SpringbootBackendApplicationTests.java`**: Contains basic test cases.

## Setup and Configuration

### Prerequisites

- [Java 17+](https://adoptium.net/)
- [Docker](https://www.docker.com/products/docker-desktop)
- [Docker Compose](https://docs.docker.com/compose/)

### Clone the Repository

```bash
git clone https://github.com/Ntdpz/SetUp_SpringBoot.git
cd SetUp_SpringBoot
