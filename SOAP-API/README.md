# SOAP Sum Service

This is a simple **Spring Boot SOAP Web Service** that takes two numbers as input and returns their sum. The service is implemented using **Spring Web Services (SOAP)** and can be tested using **Postman**.

## 🚀 Getting Started

### Prerequisites
- **Java 17+**
- **Maven**
- **Postman (for testing)**

### Installation & Running the Project

1. **Clone the Repository**
   ```sh
   git clone https://github.com/your-username/your-repo.git
   cd your-repo
   ```
2. **Build and Run the Application**
   ```sh
   mvn clean package
   mvn spring-boot:run
   ```
3. **Access the WSDL**
   ```
   http://localhost:8080/ws/sumService.wsdl
   ```

---

## 🛠️ Testing with Postman

### **📌 SOAP Request**
Send a **POST** request to:
```
http://localhost:8080/ws
```

Use **Headers**:
```
Content-Type: text/xml
```

Paste this XML request in **Postman Body (raw)**:
```xml
<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/"
                  xmlns:sum="http://example.com/sumservice">
   <soapenv:Header/>
   <soapenv:Body>
      <sum:SumRequest>
         <sum:number1>5</sum:number1>
         <sum:number2>25</sum:number2>
      </sum:SumRequest>
   </soapenv:Body>
</soapenv:Envelope>
```

---

### **📌 SOAP Response**
The expected response should be:
```xml
<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/"
                  xmlns:sum="http://example.com/sumservice">
   <soapenv:Header/>
   <soapenv:Body>
      <sum:SumResponse>
         <sum:result>30</sum:result>
      </sum:SumResponse>
   </soapenv:Body>
</soapenv:Envelope>
```

---

## 📷 Result

![image](https://github.com/user-attachments/assets/a5c86fdc-4d34-4ba2-a627-8116d8408eb7)

---

## 📂 Project Structure
```
sum-soap-service/
├── src/main/java/com/example/sumservice/
│   ├── SumApplication.java
│   ├── SumEndpoint.java
│   ├── SumRepository.java
│   ├── WebServiceConfig.java
├── src/main/resources/
│   ├── wsdl/sum-service.xsd
├── pom.xml
└── README.md
```

---

## 💡 Author
- GitHub: [Prince Poudel](https://github.com/Prince-7154)

---


