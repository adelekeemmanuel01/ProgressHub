# 🚀 ProgressHub - Task Management API

ProgressHub is a RESTful Task Management API built with Spring Boot that helps users organize tasks, manage priorities, track completion status, and monitor progress across multiple task lists.

Designed with scalability and clean architecture in mind, the API provides a structured way to manage productivity workflows through well-defined REST endpoints and PostgreSQL persistence.

## ✨ Features

* 📋 Create, retrieve, update, and delete task lists
* ✅ Create, retrieve, update, and delete tasks within task lists
* 🎯 Task priority management (`HIGH`, `MEDIUM`, `LOW`)
* 📌 Task status tracking (`OPEN`, `CLOSED`)
* 📊 Automatic progress calculation for task lists
* 🗄️ PostgreSQL database integration
* 🔗 RESTful API architecture
* 📖 Interactive API documentation with Swagger/OpenAPI

## 🛠️ Tech Stack

* Java 24
* Spring Boot 4.0.2
* Spring Data JPA
* PostgreSQL
* Maven
* Lombok

## 🎯 Project Goal

ProgressHub was built to demonstrate backend development best practices using Spring Boot, including REST API design, layered architecture, database integration, exception handling, and clean code principles.

The project serves as a foundation for more advanced productivity features such as authentication, deadlines, notifications, team collaboration, and analytics.

## 🚀 Getting Started

### Clone the Repository

```bash
git clone https://github.com/YOUR-USERNAME/progresshub.git
cd progresshub
```

### Configure Environment Variables

Create a `.env` file in the root directory:

```env
DB_URL=jdbc:postgresql://your-host:5432/your-database
DB_USERNAME=your-username
DB_PASSWORD=your-password
```

### Run the Application

```bash
mvn spring-boot:run
```

The application will start on:

```text
http://localhost:8080
```
