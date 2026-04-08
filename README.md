<<<<<<< HEAD
# 🚀 Quantity Measurement App (UC18 - JWT + OAuth2)

## 📌 Overview

The **Quantity Measurement App** is a Spring Boot-based REST API that supports various measurement operations like **Length, Weight, Volume, and Temperature**.

This project is enhanced with **advanced security features** including:

* 🔐 JWT Authentication
* 🌐 GitHub OAuth2 Login
* 🗄️ JPA & Database Integration
* 📊 Swagger API Documentation
* ⚡ Robust Exception Handling & Validation

---

## 🎯 Key Features

### 🧮 Core Functionalities

* Compare quantities
* Convert units
* Arithmetic operations (Add, Subtract, Divide)
* Measurement history tracking
* Error tracking & reporting

---

### 🔐 Security Features (UC18)

* JWT-based Authentication (Stateless)
* GitHub OAuth2 Login
* Secure REST APIs
* Custom Authentication Filter
* Unauthorized access handling (401 response)

---

### 🗄️ Database & Persistence

* JPA (Hibernate ORM)
* H2 (Development)
* MySQL (Production ready)
* Indexed queries for performance

---

### 📊 API & Monitoring

* Swagger UI (API Testing)
* Spring Boot Actuator
* Logging & Debugging support

---

## 🏗️ Project Structure

```
com.app
│
├── config              # Security & Swagger Config
├── controller          # REST Controllers
├── service             # Business Logic
├── repository          # JPA Repositories
├── model               # Entities & Domain Models
├── dto                 # Request/Response DTOs
├── security            # JWT & OAuth2 Components
├── exception           # Global Exception Handling
└── core                # Measurement Logic
```

---

## ⚙️ Tech Stack

| Layer      | Technology                   |
| ---------- | ---------------------------- |
| Backend    | Java, Spring Boot            |
| Security   | Spring Security, JWT, OAuth2 |
| Database   | H2, MySQL                    |
| ORM        | Hibernate (JPA)              |
| API Docs   | Swagger (OpenAPI)            |
| Build Tool | Maven                        |

---

## 🔑 Authentication Flow

### 🔐 1. JWT Login

```
POST /auth/login
```

➡️ Returns JWT Token

---

### 🌐 2. GitHub OAuth Login

```
GET /oauth2/authorization/github
```

➡️ Redirects to GitHub
➡️ Returns JWT after successful login

---

### 🔒 3. Access Protected APIs

Add header:

```
Authorization: Bearer <JWT_TOKEN>
```

---

## 📌 API Endpoints

### 🔹 Quantity Operations

| Method | Endpoint                      | Description         |
| ------ | ----------------------------- | ------------------- |
| POST   | `/api/v1/quantities/compare`  | Compare quantities  |
| POST   | `/api/v1/quantities/convert`  | Convert units       |
| POST   | `/api/v1/quantities/add`      | Add quantities      |
| POST   | `/api/v1/quantities/subtract` | Subtract quantities |
| POST   | `/api/v1/quantities/divide`   | Divide quantities   |

---

### 🔹 History & Reports

| Method | Endpoint                                           |
| ------ | -------------------------------------------------- |
| GET    | `/api/v1/quantities/history/operation/{operation}` |
| GET    | `/api/v1/quantities/history/type/{type}`           |
| GET    | `/api/v1/quantities/count/{operation}`             |
| GET    | `/api/v1/quantities/history/errored`               |

---

### 🔹 Auth APIs

| Method | Endpoint         |
| ------ | ---------------- |
| POST   | `/auth/register` |
| POST   | `/auth/login`    |

---

## ⚙️ Configuration

### 🔐 JWT Properties

```properties
jwt.secret=your_secret_key
jwt.expiration=86400000
```

---

### 🌐 GitHub OAuth Config

```properties
spring.security.oauth2.client.registration.github.client-id=YOUR_CLIENT_ID
spring.security.oauth2.client.registration.github.client-secret=YOUR_CLIENT_SECRET
spring.security.oauth2.client.registration.github.scope=user:email
```

---

## 📊 Swagger UI

Access API docs:

```
http://localhost:8080/swagger-ui/index.html
```

---

## 🧪 Testing

* Unit & Integration tests included
* Security disabled for test profile
* Covers:

  * API endpoints
  * Database persistence
  * Validation scenarios

---

## ⚠️ Important Notes

* OAuth login must be tested via browser (not Postman)
* JWT required for all protected endpoints
* Unauthorized requests return `401` (not redirect)

---


=======
# QuantityMeasurementApp

# UC1 – Feet Measurement Equality

##  Description

Implements equality comparison between two numerical values measured in feet using proper `equals()` method implementation.

---

##  Objective

Return:

- `true` if both feet values are equal  
- `false` otherwise  

---

##  Implementation

- Inner class `Feet`  
- Encapsulated `private final double value`  
- Immutable design  
- Overridden `equals()` using `Double.compare()`  
- Null and type safety checks  

---

##  Example

**Input:**  
1.0 ft and 1.0 ft  

**Output:**  
Equal: `true`

---

##  Concepts Covered

- Equality Contract  
- Floating-point comparison  
- Null safety  
- Type safety  
- Encapsulation  
- Unit testing basics  
>>>>>>> 5e0c17eee4639f0f17bff244e4fd7ec7969b1dea
