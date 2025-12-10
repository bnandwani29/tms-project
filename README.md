<h1 align="center">🚚 Transport Management System (TMS)</h1>

<p align="center">
  <b>A Spring Boot + PostgreSQL Backend for Managing Transporters and Their Trucks</b><br>
  <sub>Includes CRUD APIs, entity relationships, and Postman-tested endpoints.</sub>
</p>

<hr>

<h2>📌 Overview</h2>

This project is a backend system for managing **Transporters** and their **Trucks**.  
It is built using **Spring Boot**, **JPA/Hibernate**, and **PostgreSQL**, with REST APIs tested via **Postman**.

Key Features:
<ul>
  <li>➤ Create & manage transporters</li>
  <li>➤ Add & manage trucks for each transporter</li>
  <li>➤ Fetch all trucks</li>
  <li>➤ Fetch trucks belonging to a specific transporter</li>
  <li>➤ Proper Entity Relationship using <code>@OneToMany</code> and <code>@ManyToOne</code></li>
  <li>➤ Clean layered architecture (Controller → Service → Repository)</li>
</ul>

<hr>

<h2>📂 Project Architecture</h2>

src/main/java/com/bhavya/tms/
│
├── controller/
│ └── TransporterTruckController.java
│
├── entity/
│ ├── Transporter.java
│ └── TransporterTruck.java
│
├── repository/
│ └── TransporterTruckRepository.java
│
├── service/
│ └── TransporterTruckService.java
│
└── TmsApplication.java


<hr>

<h2>🗄️ Database Schema</h2>

### **Transporter Table**
| Field | Type |
|-------|------|
| id | UUID |
| company_name | VARCHAR |
| rating | DOUBLE |

### **TransporterTruck Table**
| Field | Type |
|-------|------|
| id | UUID |
| truck_type | VARCHAR |
| total_count | INT |
| available_count | INT |
| transporter_id | UUID (FK → transporter.id) |

<hr>

<h2>🚀 Run the Application</h2>

### **1️⃣ Using IntelliJ (recommended)**
<ol>
  <li>Open the project in IntelliJ</li>
  <li>Let Maven load all dependencies</li>
  <li>Open <code>TmsApplication.java</code></li>
  <li>Click ▶️ <b>Run</b></li>
</ol>

### **2️⃣ Using Terminal**
```bash
./mvnw clean package
java -jar target/tms-0.0.1-SNAPSHOT.jar
Application starts at:
http://localhost:8080

<hr> <h2>🧪 Postman API Usage</h2> <h3>1️⃣ Get All Trucks</h3>

GET
http://localhost:8080/transporter-trucks

<h3>2️⃣ Get Trucks for a Specific Transporter</h3>

GET
http://localhost:8080/transporter-trucks/{transporterId}

✔ Returns all trucks belonging to that transporter.
If no trucks exist → returns [] (empty list).
<b>Bhavya Nandwani</b>
B.Tech CSE-AI

