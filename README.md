# Sesame workshop

A REST API built with Spring Boot around 1 JPA entity, using PostgreSQL.

## Tech stack

- Java 21, built with Maven
- Spring Boot 3.2.5
- Spring Web (REST controllers)
- Spring Data JPA (Hibernate)
- Spring Data REST
- Spring Boot Actuator
- Lombok
- PostgreSQL driver
- Database: PostgreSQL (`eshop_db` in `application.properties`)

## Concepts covered

Interfaces.

## Data model

| Entity | Fields |
|---|---|
| `Product` | — |

## Project structure

- `tn.sesame.workshop.ecommerce`: EcommerceApplication
- `tn.sesame.workshop.ecommerce.Entities`: Product
- `tn.sesame.workshop.ecommerce.Repositories`: ProductRepository
- `tn.sesame.workshop.ecommerce.services`: ProductService
- `tn.sesame.workshop.ecommerce.web`: ProductController
- Tests: 1 test class

## How to run

Requirements: a JDK 21+ and Maven (or the included Maven wrapper).
Create the `eshop_db` database and set your own username and password in `src/main/resources/application.properties`.

```bash
./mvnw spring-boot:run
```

The API then listens on `http://localhost:8080`.

---

Author: [Chaouki Bayoudhi](https://github.com/ChaoukiBayoudhi)
