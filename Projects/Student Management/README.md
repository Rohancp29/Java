# Student Management System

A Spring Boot application to manage student records using RESTful APIs.
Supports CRUD operations — Create, Read, Update, Delete.

---

## Technologies Used

- **Java 17**
- **Spring Boot 3.4.4**
- **Spring Data JPA**
- **Spring Web**
- **Thymeleaf (for frontend UI)**
- **MySQL (Database)**
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
  "percentage": 90,
  "branch": "IT"
}
```
---

## Usage Examples

###  Get all students
```bash
curl http://localhost:8080/students
```
###  Get student by ID
```bash
curl http://localhost:8080/students/1
```
###  Add a student
```bash
curl -X POST http://localhost:8080/student/add \
-H "Content-Type: application/json" \
-d '{"name":"RP", "percentage":90, "branch":"IT"}'
```
###  Update student
```bash
curl -X PUT http://localhost:8080/student/update/1 \
-H "Content-Type: application/json" \
-d '{"name":"RP Updated", "percentage":92, "branch":"CS"}'
```
###  Delete student
```bash
curl -X DELETE http://localhost:8080/student/delete/1
```
---

##  Logging with SLF4J

The application uses **SLF4J** (Simple Logging Facade for Java) to log key events and actions throughout the system. This helps in tracking application behavior and debugging issues efficiently.

### What is Logged?

- **Student Creation**
- **Student Update**
- **Student Deletion**
- **Errors and Exceptions**

---
##  Features

-  View all students  
-  Add new students  
-  Edit existing students  
-  Delete students  
-  REST API support  
-  HTML UI  
-  MySQL backend  
-  Logging and error handling  

---



