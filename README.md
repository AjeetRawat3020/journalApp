# 📓 Journal App

A secure RESTful Journal Management API built with **Spring Boot** that allows users to manage personal journal entries using **JWT Authentication** and **Role-Based Authorization**.

## 🚀 Features

* User Signup & Login
* JWT Authentication
* BCrypt Password Encryption
* CRUD Operations for Journal Entries
* Role-Based Access (USER / ADMIN)
* MongoDB Atlas Integration
* Redis Caching
* Weather API Integration
* Email Service (Spring Mail)

## 🛠️ Tech Stack

* Java 17
* Spring Boot 3
* Spring Security
* JWT
* MongoDB Atlas
* Redis
* Maven
* Lombok

## 🔑 Authentication

After login, use the generated JWT token in the request header:

```text
Authorization: Bearer YOUR_JWT_TOKEN
```

## 📡 Main APIs

* **POST** `/public/signup`
* **POST** `/public/login`
* **GET** `/journal`
* **POST** `/journal`
* **PUT** `/journal/id/{id}`
* **DELETE** `/journal/id/{id}`

## ⚙️ Environment Variables

Create a `.env` file:

```env
MONGODB_URI=
REDIS_HOST=
REDIS_PORT=
REDIS_USERNAME=
REDIS_PASSWORD=
MAIL_USERNAME=
MAIL_PASSWORD=
WEATHER_API_KEY=
JWT_SECRET=
SERVER_PORT=8081
```

## ▶️ Run the Project

Clone the repository

```bash
git clone https://github.com/AjeetRawat3020/journalApp.git
```

Go to project directory

```bash
cd journalApp
```

Install dependencies

```bash
mvn clean install
```

Run the application

```bash
mvn spring-boot:run
```

Application will start at:

```text
http://localhost:8081/journal
```

**Developed by:** Ajeet Singh Rawat
