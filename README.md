# Simple Spring Boot CRUD

This is a simple CRUD (Create, Read, Update, Delete) application created with Spring Boot for practicing purposes. It uses an H2 in-memory database, so no external database installation is required.

## Prerequisites

- Java 17

## Step-by-step Setup

### Run the application

The application will start on `http://localhost:8080`.

### Connect to H2 Database

Since this project uses an in-memory database, you can view the data directly in your browser.

1. Go to: `http://localhost:8080/h2-console`

2. Use these settings to log in:
   - **JDBC URL**: `jdbc:h2:mem:testdb`
   - **User Name**: `sa`
   - **Password**: `password`

3. Click **Connect**.

> **Note**: Because H2 is in-memory, all data is lost when you stop the application.

## CRUD Testing

### 1. Create a User

This creates a new user in the database.

```bash
curl -X POST http://localhost:8080/api/users \
-H "Content-Type: application/json" \
-d "{\"name\": \"Alice\", \"email\": \"alice@example.com\"}"
```

### 2. Get All Users

This retrieves the list of all users.

```bash
curl -X GET http://localhost:8080/api/users
```

### 3. Get User by ID

This retrieves a specific user (ID 1).

```bash
curl -X GET http://localhost:8080/api/users/1
```

### 4. Update a User

This updates the name and email for the user with ID 1.

```bash
curl -X PUT http://localhost:8080/api/users/1 \
-H "Content-Type: application/json" \
-d "{\"name\": \"Alice Smith\", \"email\": \"alice.smith@test.com\"}"
```

### 5. Delete a User

This removes the user with ID 1.

```bash
curl -X DELETE http://localhost:8080/api/users/1
```

## Viewing Data via H2 Console

You can also consult and view all the information directly through the H2 database interface. After performing any CRUD operations, you can:

1. Go to `http://localhost:8080/h2-console`
2. Log in with the credentials mentioned above
3. Run SQL queries directly, for example:
   ```sql
   SELECT * FROM USER;
   ```

This allows you to verify that your CRUD operations are working correctly by viewing the database state in real-time.

