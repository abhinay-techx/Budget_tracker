# 💰 Budget Tracker (Full Stack Project)

## 🚀 Project Overview

A full-stack **Personal Budget Tracker** that helps users:

* Track income & expenses
* Categorize transactions
* View dashboards & reports
* Set budgets and monitor spending

---

## 🧠 System Architecture

```
Frontend (React)
        ↓ HTTP (API)
Backend (Spring Boot)
        ↓
MySQL Database
```

---

## 📂 Project Structure

```
budget-tracker/
│
├── backend/                     ← Spring Boot (your current work)
│   ├── src/
│   │   └── main/
│   │       ├── java/com/abhinay/budgettracker/
│   │       │   ├── controller/
│   │       │   │   └── TransactionController.java
│   │       │   │
│   │       │   ├── service/
│   │       │   │   └── TransactionService.java
│   │       │   │
│   │       │   ├── repository/
│   │       │   │   └── TransactionRepository.java
│   │       │   │
│   │       │   ├── model/
│   │       │   │   └── Transaction.java
│   │       │   │
│   │       │   ├── dto/              ← (later)
│   │       │   ├── config/           ← (later)
│   │       │   │
│   │       │   └── BudgettrackerApplication.java
│   │       │
│   │       └── resources/
│   │           ├── application.properties
│   │           └── static/ (optional frontend)
│   │
│   ├── pom.xml
│   ├── mvnw / mvnw.cmd
│   └── target/ (auto-generated)
│
├── frontend/                  ← React (later)
│   ├── public/
│   ├── src/
│   │   ├── components/
│   │   │   ├── Navbar.jsx
│   │   │   ├── TransactionCard.jsx
│   │   │
│   │   ├── pages/
│   │   │   ├── Dashboard.jsx
│   │   │   ├── AddTransaction.jsx
│   │   │   └── Reports.jsx
│   │   │
│   │   ├── services/
│   │   │   └── api.js      ← calls backend APIs
│   │   │
│   │   ├── App.jsx
│   │   └── main.jsx
│   │
│   ├── package.json
│   └── node_modules/
│
├── database/                  ← optional (good practice)
│   ├── schema.sql
│   └── seed.sql
│
├── docs/                      ← optional
│   ├── api-docs.md
│   └── architecture.md
│
└── README.md
```

---

## 🧱 Backend Architecture (Spring Boot)

### 🔁 Request Flow

```
Client → Controller → Service → Repository → Database → Response
```

### 📦 Layers

#### 1. Controller

* Handles HTTP requests
* Example: `/transactions`

#### 2. Service

* Contains business logic
* Example: calculate totals

#### 3. Repository

* Talks to database
* Uses Spring Data JPA

#### 4. Model (Entity)

* Represents database table

---

## ⚙️ Tech Stack

### Backend:

* Java
* Spring Boot
* Spring Data JPA
* MySQL

### Frontend (planned):

* React.js
* Axios / Fetch API

### Database:

* MySQL

---

## 🔧 Setup Instructions

### 1. Clone Project

```
git clone <repo-url>
cd budget-tracker/backend
```

---

### 2. Configure Database

Create database in MySQL:

```
CREATE DATABASE budgetdb;
```

Update `application.properties`:

```
spring.datasource.url=jdbc:mysql://localhost:3306/budgetdb
spring.datasource.username=root
spring.datasource.password=yourpassword

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

---

### 3. Run Backend

Using Maven Wrapper:

```
.\mvnw.cmd spring-boot:run
```

---

### 4. Test API

#### GET

```
http://localhost:8080/transactions
```

#### POST

```
http://localhost:8080/transactions
```

Body:

```json
{
  "type": "EXPENSE",
  "category": "Food",
  "amount": 200,
  "description": "Lunch",
  "date": "2026-04-04"
}
```

---

## 📊 Features (Planned Roadmap)

### ✅ Phase 1 (Current)

* Add transaction
* View all transactions

### 🔜 Phase 2

* Filter by category/type
* Monthly summary

### 🔜 Phase 3

* Dashboard (charts)
* Category-wise analysis

### 🔜 Phase 4

* Budget limits
* Alerts

### 🔜 Phase 5

* Authentication (JWT)
* Multi-user support

---

## 🧠 Key Concepts Learned

* REST API development
* MVC architecture
* Dependency Injection
* ORM (JPA/Hibernate)
* Database design
* Full-stack integration

---

## ⚡ Developer Notes

* Backend and frontend are separate applications
* Backend runs on `localhost:8080`
* Frontend will run on `localhost:3000`
* Communication via REST APIs

---

## 🧭 Current Status

```
✔ Spring Boot setup complete
✔ MySQL connected
✔ Basic API structure ready
⬜ Repository implementation
⬜ CRUD operations
⬜ Frontend integration
```

---

## 🚀 Next Steps

* Implement Repository
* Save first transaction
* Build CRUD APIs
* Add business logic (reports)

---

## 👨‍💻 Author

Abhinay Kumar

