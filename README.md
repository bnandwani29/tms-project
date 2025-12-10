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

