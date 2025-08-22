
# Movie Management API 🎬

A simple **Spring Boot REST API** project for managing movies.  
It demonstrates basic CRUD operations (Create, Read, Update, Delete) with **Spring Data JPA** and pagination support.

---

## Features ✨
- Add a new movie  
- Fetch all movies (with pagination & sorting)  
- Fetch a single movie by ID  
- Update movie details  
- Delete a movie by ID  

---

## Tech Stack 🛠
- **Java 17**  
- **Spring Boot 3.x**  
- **Spring Data JPA**  
- **H2 Database** (in-memory)  
- **Maven**  

---

## Getting Started 🚀

### 1. Clone the repository
```bash
git clone https://github.com/your-username/movie-management-api.git
cd movie-management-api
2. Build the project
bash
Copy
Edit
./mvnw clean install
3. Run the application
bash
Copy
Edit
./mvnw spring-boot:run
The API will be available at:
👉 http://localhost:8080/api/movies

Example API Endpoints ->
GET all movies → GET /api/movies

GET movie by ID → GET /api/movies/{id}

POST add movie → POST /api/movies

PUT update movie → PUT /api/movies/{id}

DELETE movie → DELETE /api/movies/{id}

Personal Note ->
I built this project while learning Spring Boot and JPA.
My main focus was on understanding REST API design, exception handling, and clean service-repository patterns.

Future Improvements ->
Add JWT authentication & role-based access control

Containerize with Docker for deployment

Write Unit Tests using JUnit & Mockito
