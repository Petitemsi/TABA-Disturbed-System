# Distributed Systems – gRPC Sum & RESTful API Project

This project was developed as part of the **Higher Diploma in Science in Computing – Distributed Systems** module (TABA 2025). It demonstrates the implementation of a simple **Remote Procedure Call (RPC)** system using **gRPC in Java**, and a **RESTful API** designed for controlling smart devices.

## 📌 Project Structure

### 1. gRPC Sum Service
A client-server model where:
- The client sends a list of integers
- The server returns their total using a remote gRPC method

✔️ Includes:
- `.proto` definition file (Protocol Buffers)
- Synchronous gRPC client
- Asynchronous gRPC client (bonus)
- Java server implementation
- Auto-generated Java stubs via `protobuf-maven-plugin`

### 2. RESTful Smart Device API
A Spring Boot-based REST API to control IoT-style smart devices.

✔️ Includes:
- REST endpoints (`/devices/{id}/power/on`)
- HTTP verbs (GET, PUT)
- JSON input/output examples
- Testing via Postman/cURL

## 🛠️ Technologies Used

- Java 17
- gRPC
- Protocol Buffers
- Spring Boot
- Maven
- NetBeans / IntelliJ IDEA
- Postman / cURL

## 📸 Screenshots

See `/screenshots/` folder for:
- gRPC server and client console output
- Async client response
- REST endpoint tests

## 📚 Learning Outcomes

- Understood the difference between REST and gRPC
- Learned how to define and compile `.proto` files
- Built synchronous and asynchronous gRPC clients
- Designed and tested RESTful endpoints in Spring Boot
- Applied CAP theorem, service discovery, and scalability concepts

## 📖 References

See full references and bibliography in the [report](TABA_Report.pdf) or below.

## 📂 Folder Structure

