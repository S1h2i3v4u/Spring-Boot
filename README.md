# Spring-Boot
# Simple Calculator - Spring Boot Application

A **simple web-based calculator** built using **Spring Boot** that performs basic arithmetic operations: addition, subtraction, multiplication, and division.

---

## **Features**
- Perform **Addition (+), Subtraction (-), Multiplication (×), and Division (÷)**
- Simple and clean **HTML/CSS interface**
- Handles division by zero with a proper error message
- Built with **Spring Boot** for backend and **HTML/CSS** for frontend

---

## **Technologies Used**
- Java 17+
- Spring Boot
- Spring Web (REST Controller)
- HTML, CSS

---

## **Project Structure**

- demo1/src/main/resources/static/index.html
- demo1/src/main/java/com/example/demo1/Demo1Application.java
- demo1/src/main/java/com/example/demo1/myController.java



---

## **Using POST Instead of GET**
If you change your form and controller to use **POST** instead of **GET**, here are the key changes:

- Change the form method to `post` in your HTML.
- Update your controller to use `@PostMapping` instead of `@GetMapping`.

---

## **Key Differences Between GET and POST**

| Feature                  | GET                                      | POST                                      |
|---------------------------|-----------------------------------------|------------------------------------------|
| Parameters in URL         | Appended to URL as query string         | Sent in the request body                  |
| Security                  | Less secure, visible in URL             | More secure for sensitive data           |
| Data Length               | Limited by URL length                   | Can send large amounts of data           |
| Idempotency               | Safe to repeat (does not change state)  | Not necessarily idempotent               |
| Use Case                  | Retrieving data                         | Sending data / creating / updating data  |


### GET request:
http://localhost:8080/calculator?num1=10&num2=5&operation=add
### POST request:
http://localhost:8080/calculator


---

## **Usage**
1. Open the application in a browser (default: `http://localhost:8080/index.html`)
2. Enter two numbers and select an arithmetic operation
3. Click **Calculate**
4. View the result or error message

---

## **Notes**
- Division by zero is handled gracefully.
- Invalid operations will return an error message.
- Using **POST** is recommended for cleaner URLs and better security.

---
