# 👩‍💻 User Management API – Spring Boot + MongoDB

This is a simple REST API project for managing users, built using **Java 17**, **Spring Boot**, and **MongoDB**. It supports creating, updating, listing, and toggling user activation status.

---

## ✅ Features

- `POST /api/create-user` – Create a new user
- `POST /api/update-user` – Update existing user details
- `GET /api/users` – List all users
- `POST /api/toggle-user?id=` – Activate or deactivate a user

---

## 🧾 MongoDB Document Structure

```json
{
  "_id": "ObjectId",
  "email": "string",
  "firstName": "string",
  "lastName": "string",
  "isActive": true,
  "tenantId": "string",
  "createdAt": "datetime",
  "updatedAt": "datetime"
}
```

## ⚙️ Technologies Used

* Java 17

* Spring Boot

* MongoDB (local)

* Maven

* IntelliJ IDEA

* Git & GitHub

* Postman (for API testing)


## 🚀 How to Run This Project

### **🖥️ Prerequisites**

* MongoDB running locally on ```mongodb://localhost:27017```

* Java 17 installed

* IntelliJ IDEA (or other Java IDE)

### 📦 **Steps to Run

**1. Clone the repo:**

````git clone https://github.com/srijeeta0425/user-api-springboot.git````

**2. Open the project in IntelliJ IDEA**

**3. Configure MongoDB if needed in:**
````
src/main/resources/application.properties
````
**4. Run the application:**

Open ````UserApiApplication.java````

Click the green Run button or use ````Shift + F10````

**5. Test the API in Postman:**

### Example 
1. ````POST```` request to ````/api/create-user:````
````
{
  "email": "srijeeta@gmail.com",
  "firstName": "Srijeeta",
  "lastName": "Purkait",
  "tenantId": "getpostlabs123"
}
```` 
2. ````POST```` request to ````/api/update-user:````
````
{
  "email": "updated@gmail.com",
  "firstName": "Updated",
  "lastName": "Name",
  "tenantId": "newTenant"
}
````
3.````GET```` request to ````/api/users:````
````
{
  "email": "srijeeta@gmail.com",
  "firstName": "Srijeeta",
  "lastName": "Purkait",
  "tenantId": "getpostlabs123"
}
````
4. ````POST```` request to ````/api/toggle-user:````
````
{
  "email": "updated@gmail.com",
    "firstName": "Updated",
    "lastName": "Name",
    "tenantId": "newTenant"
}
````
## 🔍 API Endpoints

| Method | Endpoint             | Description                    |
|--------|----------------------|--------------------------------|
| POST   | `/api/create-user`   | Create a new user              |
| POST   | `/api/update-user`   | Update existing user info      |
| GET    | `/api/users`         | Fetch list of all users        |
| POST   | `/api/toggle-user`   | Toggle user activation by ID   |


## 📁 Project Structure

````
user-api-springboot/
├── src/
│   ├── main/
│   │   ├── java/com/example/userapi/
│   │   │   ├── controller/
│   │   │   ├── model/
│   │   │   ├── repository/
│   │   │   └── service/
│   │   └── resources/
│   │       └── application.properties
├── pom.xml
├── README.md
````

## 🙋‍♀️ Author
Srijeeta Purkait

Software Engineer Trainee– [GetPost Labs]

📫 Email: srijeeta@getpostlabs.io
🔗 GitHub: https://github.com/srijeeta0425/user-api-springboot

