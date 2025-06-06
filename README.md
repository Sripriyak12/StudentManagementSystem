# Student Management System

A full-stack Student Management System built using **Spring MVC**, **JSP**, and **JDBC**. This web application allows users to **add**, **edit**, **view**, and **delete** student records. It also provides a RESTful API for programmatic access.

---

## 🌟 Features

- View list of all students
- Add a new student
- Edit existing student details
- Delete a student
- REST API for GET, POST, PUT, DELETE operations
- JSP frontend with JSTL integration
- JDBC-based DAO with PostgreSQL

---

## 🛠️ Tech Stack

- **Backend:** Spring MVC (Spring Core, Spring Web MVC)
- **Frontend:** JSP, JSTL, HTML/CSS
- **Database:** PostgreSQL
- **Build Tool:** Maven
- **Server:** Apache Tomcat

---

## 🚀 Running the Application

1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/student-management-system.git
   ```
2.Import the project into Eclipse or IntelliJ as a Maven project.

3.Configure PostgreSQL:

  - Create a database (e.g., student_management)

  - Update DB credentials in your DatabaseConfig.java

4.Build and deploy the WAR file to Apache Tomcat.

5.Access:

 -UI: http://localhost:8080/student-management-1.0.0/students/

 -API: http://localhost:8080/student-management-1.0.0/api/students


 ##📂 Project Structure
 ```bash

    student-management/
    ├── src/
    │   ├── main/
    │   │   ├── java/com/studentapp/
    │   │   │   ├── controller/
    │   │   │   ├── dao/
    │   │   │   └── model/
    │   │   ├── resources/
    │   │   └── webapp/WEB-INF/views/
    ├── pom.xml
    └── README.md

```
## 📬 API Endpoints

| Method | Endpoint              | Description         |
|--------|-----------------------|---------------------|
| GET    | `/api/students`       | Get all students    |
| GET    | `/api/students/{id}`  | Get student by ID   |
| POST   | `/api/students`       | Add new student     |
| PUT    | `/api/students/{id}`  | Update student      |
| DELETE | `/api/students/{id}`  | Delete student      |

---

## 📌 Screenshots
![Screenshot 2025-06-06 112304](https://github.com/user-attachments/assets/f6d6aa2a-22e6-43e9-bc8f-440db82f5193)
![Screenshot 2025-06-06 112220](https://github.com/user-attachments/assets/1db1ec59-44cb-4ff2-8477-3a754178361c)


## 🙋‍♀️ Author

**K Lakshmi Sripriya**  
📍 Palakollu, Andhra Pradesh

