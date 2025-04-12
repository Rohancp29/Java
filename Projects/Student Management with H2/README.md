# Student Management System

A Spring Boot application to manage student records using RESTful APIs and H2 in memory database .
Supports CRUD operations — Create, Read, Update, Delete.

Add docker container 
---

## Technologies Used

- **Java 17**
- **Spring Boot 3.4.4**
- **Spring Data JPA**
- **Spring Web**
- **H2 Database**
- **SLF4J (Logging)**

---

## Run the Application
mvn spring-boot:run

---

## API Endpoints

| Method | Endpoint                   | Description               |
|--------|----------------------------|---------------------------|
| GET    | `/students`                | Get all students          |
| GET    | `/students/{id}`           | Get student by ID         |
| POST   | `/student/add`             | Add a new student         |
| PUT    | `/student/update/{id}`     | Update existing student   |
| DELETE | `/student/delete/{id}`     | Delete student by ID      |

---
##  Sample JSON for POST/PUT

```json
{
  "name": "RP",
  "percentage": 89,
  "branch": "SC"
}
```
---

## changes

###  Application properties
```bash

spring.datasource.url=jdbc:h2:mem:studentdatabase
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=
spring.datasource.password=

```
###  docker file
```bash
<finalName>spring-boot-docker</finalName>
```

---





