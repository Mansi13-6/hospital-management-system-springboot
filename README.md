# Hospital Management System

A Hospital Management System backend application built using Spring Boot, Spring Data JPA, Maven, and H2 Database. The project demonstrates a layered architecture with Controller, Service, Repository, and Entity components while providing RESTful APIs for patient management.

## Features

* Add a new patient
* View all patients
* RESTful API implementation
* Spring Data JPA integration
* H2 In-Memory Database
* Maven Build Management
* Layered Architecture (Controller → Service → Repository → Database)

## Tech Stack

* Java 17
* Spring Boot 3
* Spring Data JPA
* H2 Database
* Maven
* REST APIs
* Git & GitHub

## Project Structure

```text
src
├── main
│   ├── java
│   │   └── hospital
│   │       ├── HospitalApplication.java
│   │       ├── controller
│   │       │   └── PatientController.java
│   │       ├── service
│   │       │   └── PatientService.java
│   │       ├── repository
│   │       │   └── PatientRepository.java
│   │       └── entity
│   │           └── Patient.java
│   └── resources
│       └── application.properties
└── test
```

## API Endpoints

### Add Patient

**POST** `/patients`

Request Body:

```json
{
  "name": "Mansi",
  "age": 22,
  "disease": "Fever"
}
```

Response:

```json
{
  "id": 1,
  "name": "Mansi",
  "age": 22,
  "disease": "Fever"
}
```

---

### Get All Patients

**GET** `/patients`

Response:

```json
[
  {
    "id": 1,
    "name": "Mansi",
    "age": 22,
    "disease": "Fever"
  }
]
```

## Running the Application

Clone the repository:

```bash
git clone https://github.com/Mansi13-6/HospitalManagementSystem.git
```

Navigate to the project folder:

```bash
cd HospitalManagementSystem
```

Run the application:

```bash
./mvnw spring-boot:run
```

Or on Windows:

```bash
mvnw.cmd spring-boot:run
```

## H2 Database Console

Open:

```text
http://localhost:8080/h2-console
```

Configuration:

```text
JDBC URL : jdbc:h2:mem:hospitaldb
Username : sa
Password : 
```

## Architecture

```text
Client/Postman
      ↓
PatientController
      ↓
PatientService
      ↓
PatientRepository
      ↓
H2 Database
```

## Future Enhancements

* Update Patient API
* Delete Patient API
* Search Patient by ID
* Doctor Management Module
* Appointment Scheduling Module
* Authentication & Authorization
* Frontend Integration (React)

## Author

**Mansi Gangurde**

GitHub: https://github.com/Mansi13-6
