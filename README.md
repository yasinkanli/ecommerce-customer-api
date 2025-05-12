# 🛒 Ecommerce Customer API

A Java Spring Boot project that provides a RESTful API to manage customers and their orders in a simple e-commerce setting.  
Built with clean layered architecture (Controller → Service → Repository), DTO abstraction, in-memory H2 database, and global error handling.

---

## 🚀 Features

- **Customer Management**
    - Create new customers (`POST /api/customers/create`)
    - List all customers with their orders (`GET /api/customers/all`)

- **Error Handling**
    - Field-level validation with `@Valid` and custom error payload (`ApiError`)
    - Global exception handler for clean JSON error responses

- **Architecture**
    - Layered design: Controller, Service, Repository
    - DTOs for request/response separation
    - ModelMapper (GenericMapper) for mapping between DTOs and entities

---

## 🧰 Technologies Used

| Layer         | Technology                           |
|---------------|--------------------------------------|
| Language      | Java 21                              |
| Framework     | Spring Boot 3                        |
| ORM           | Spring Data JPA                      |
| Database      | H2 (in-memory)                       |
| Validation    | Spring Boot Starter Validation       |
| Mapping       | ModelMapper                          |
| Build Tool    | Maven                                |

---

## 📂 Project Structure

ecommerce-customer-api/
├── src/
│ ├── main/java/org/yasinkanli/ecommercecustomerapi/
│ │ ├── controller/
│ │ ├── service/
│ │ ├── repository/
│ │ ├── entity/
│ │ ├── dto/
│ │ ├── exception/
│ │ ├── mapper/
│ │ └── config/
│ └── resources/
│ └── schema.sql
├── pom.xml
└── README.md
