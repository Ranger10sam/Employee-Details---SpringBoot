# Employee Management System - Spring Boot

This is a simple Employee Management System built using Spring Boot with PostgreSQL as the database. The system includes CR operations for Employees, Departments, and Designations.

## Features
- Create, Read Employees
- Create, Read Departments
- Create, Read Designations
- PostgreSQL database integration

## Technologies Used
- Java Spring Boot
- Spring Data JPA
- PostgreSQL
- REST APIs

## Endpoints

### Employee Endpoints
1. **Create Employee** - `POST /emp/createEmp`
   ```json
   {
       "name": "Shyam Galla",
       "email": "shyam1@example.com",
       "phone": 9888801234,
       "designation": {
           "id": 2
       },
       "department": {
           "id": 4
       }
   }
   ```

2. **Get All Employees** - `GET /emp/getAllEmp`

### Department Endpoints
1. **Create Department** - `POST /dept/createDept`
   ```json
   {
       "name": "Google Cloud"
   }
   ```
2. **Get All Departments** - `GET /dept/getAllDept`

### Designation Endpoints
1. **Create Designation** - `POST /designation/createDesignation`
   ```json
   {
       "name": "SDE-I",
       "salary": 3000000
   }
   ```
2. **Get All Designations** - `GET /designation/getAllDesignation`

## Database Schema

### Employee Table
```sql
CREATE TABLE employee (
    id SERIAL PRIMARY KEY,
    name VARCHAR(100),
    email VARCHAR(100) NOT NULL,
    phone BIGINT NOT NULL,
    designation BIGINT REFERENCES designation(id),
    department BIGINT REFERENCES department(id)
);
```

### Department Table
```sql
CREATE TABLE department (
    id SERIAL PRIMARY KEY,
    name VARCHAR(100) NOT NULL
);
```

### Designation Table
```sql
CREATE TABLE designation (
    id SERIAL PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    salary BIGINT NOT NULL
);
```

## Setup and Installation

### Prerequisites
- Java 17+
- PostgreSQL
- Maven

### Steps to Run the Project
1. Clone the repository:
   ```sh
   git clone <repository-url>
   cd employee-management
   ```
2. Configure PostgreSQL Database in `application.properties`:
   ```properties
   spring.datasource.url=jdbc:postgresql://localhost:5432/your_db
   spring.datasource.username=your_username
   spring.datasource.password=your_password
   ```
3. Build the project:
   ```sh
   mvn clean install
   ```
4. Run the application:
   ```sh
   mvn spring-boot:run
   ```
