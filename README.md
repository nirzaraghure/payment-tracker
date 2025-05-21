# 💳 Payment Tracker API

A Spring Boot REST API to manage user payments — track, add, and analyze totals.

## 📌 Features
- Add a payment
- View all payments
- Get total payment for a user

## 🚀 Tech Stack
- Java 17
- Spring Boot
- Maven
- Docker

## 📦 Endpoints

| Method | Endpoint                  | Description                    |
|--------|---------------------------|--------------------------------|
| POST   | `/payments`               | Add a new payment              |
| GET    | `/payments`               | List all payments              |
| GET    | `/payments/{userId}/total` | Total paid by user             |

## 🐳 Run with Docker

```bash
docker build -t paymenttracker-app .
docker run -p 8080:8080 paymenttracker-app
