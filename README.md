# 🏦 Banking App Quality Assurance

**Authors:** Diego Gonzalez & Miguel Fernandez\
**Date:** November 2025\
**Current Phase:** 🟢 Sprint 2 Complete

<img width="250" height="720" alt="Diseño sin título (12)" src="https://github.com/user-attachments/assets/051d4701-34a6-4f42-b3cf-e3394ad0b6de" />

## 🚀 Overview

Welcome to the documentation for the Banking Application Validation
Project.\
This project solves a critical operational problem: ensuring data
quality for banking transactions within a complex financial environment.

Modern banking institutions face inconsistent validation mechanisms,
leading to potential service failures and financial risk. This project
delivers a structured validation and testing suite using equivalence
classes, test cases, and a Java-based simulation.

## 🌍 Social Problematic

Banking users rely on secure and predictable transactional systems. Poor
validation can result in incorrect operations, rejected transactions, or
system failures. This project strengthens reliability and reduces risks
associated with invalid or malformed data inputs.

## 🎯 Project Vision

To develop a complete testing and validation suite for a banking
application by applying black-box testing techniques and implementing a
Java simulation that automates field validation with high accuracy.

## 📅 Project Roadmap & Strategic Planning

### ✅ Sprint 1: Equivalence Class Design (Nov 15--18)

**Objectives** - Analyze required banking fields: bank code, branch
code, account number, personal key, and order value. - Define complete
equivalence classes (valid + invalid). - Provide justification and
examples. - Create an executive-level presentation.

**Tasks by Role** - **🔹 Member A --- Miguel (QA Analyst)**\
Analyze business rules.\
Define equivalence classes.\
Identify valid, invalid, and boundary values.\
Provide examples and justification.\
Create the PDF presentation.

-   **🔹 Member B --- Diego (QA/Dev Support)**\
    Validate correctness of classes.\
    Review presentation structure and clarity.\
    Confirm alignment with black-box standards.

**Expected Deliverables** - Document of equivalence classes.\
- Executive PDF with tables, examples, and justifications.

------------------------------------------------------------------------

### 🟢 Sprint 2: Test Case Development (Nov 19--24)

**Objectives** - Convert equivalence classes into concrete test
scenarios. - Build 12 detailed test cases. - Document initial/final
states and expected outcomes. - Prepare coverage Excel report.

**Activities Completed** - ✔ Identification of 12 coverage-optimal
scenarios.\
- ✔ Creation of detailed test cases with IDs, descriptions, input data,
classes, expected results, and system states.\
- ✔ Inclusion of valid, invalid, mixed and edge-case combinations.\
- ✔ Compilation of the Excel report with cover page + introduction +
test case table + class alignment column.\
- ✔ Validation that each equivalence class is represented at least once.

**Deliverables** - Excel file containing:\
• Cover page\
• Introduction\
• Table with the 12 test cases\
• Column for class (Valid/Invalid)\
• Expected outcomes\
• Initial and final state

------------------------------------------------------------------------

### 🔜 Sprint 3: Java Simulation & Validation (Nov 25--29)

**Objectives** - Build Java program to validate inputs using equivalence
rules. - Execute 3 representative test cases. - Display clear
success/error outputs. - Produce README instructions.

**Tasks by Role** - **🔹 Member A --- Miguel (Developer)**\
Implement Java validation script.\
Translate equivalence classes into rules.\
Add execution examples.\
Generate output messages.

-   **🔹 Member B --- Diego (QA/Dev Support)**\
    Review Java code for correctness and readability.\
    Run tests using defined cases.\
    Document findings and improvements.\
    Help write README.txt.

**Expected Deliverables** - Java simulation script.\
- README.txt with steps.\
- Validation notes.

------------------------------------------------------------------------

## 🧾 Final Submission (Nov 29)

**Deliverables** - Final integrated PDF combining all Sprints.\
- MP4 video presentation explaining methodology and results.

------------------------------------------------------------------------

## 📐 User Stories

| N° | User Story | Requirements | Deliverables | Sprint | Deadline |
|----|------------|--------------|--------------|--------|----------|
| 1 | As a QA Analyst, I need to define equivalence classes to ensure structured test coverage. | Analyze fields; define valid/invalid ranges; prepare examples. | Equivalence class document. | Sprint 1 | Nov 18 |
| 2 | As a QA Analyst, I need an executive PDF to present the equivalence classes. | Introduce concept; justify classes; build tables. | PDF presentation. | Sprint 1 | Nov 18 |
| 3 | As a QA Tester, I need 12 detailed test cases. | Define inputs, states, expected results. | Excel with 12 test cases. | Sprint 2 | Nov 24 |
| 4 | As a QA Tester, I need a coverage report. | Create coverage table; ensure variety. | Excel report. | Sprint 2 | Nov 24 |
| 5 | As a Developer, I need a Java simulation that applies the validation logic. | Implement validation rules; execute cases. | Java script + README.txt. | Sprint 3 | Nov 29 |
| 6 | As a Developer, I need to deliver a final integrated submission. | Combine all outputs; create video. | Final PDF + MP4. | Sprint 3 | Nov 29 |


------------------------------------------------------------------------

## 📌 Technical Rules Defined (Sprint 1)

Using Equivalence Partitioning, the following rules were established:

  Data Field       Requirement            Strategic Value
  ---------------- ---------------------- --------------------------------
  Bank Code        3 digits               Prevent routing errors.
  Branch Code      4 digits               Ensures valid location.
  Account Number   10 digits              Standardized integrity.
  PIN (Key)        4 digits               Access control.
  Order Value      Specific text values   Ensures processing efficiency.

------------------------------------------------------------------------

## 🛠 Deliverables Overview

This repository includes:

-   📄 Executive PDF (Sprint 1)\
-   📘 Equivalence Classes\
-   📊 Excel Test Case Report (Sprint 2)\
-   💻 Java Simulation File (Sprint 3)\
-   🎥 Final MP4 Presentation (Sprint 3)

------------------------------------------------------------------------

## 🌱 Sustainability & Long-Term Value

By applying systematic testing and validation, this project enhances
REM's ability to deliver reliable banking software. This approach
reduces long-term financial risk and increases trust in digital
services.

------------------------------------------------------------------------

## 👥 Team Structure & Roles

### 1️⃣ Miguel --- QA Analyst & Backend Developer

-   Equivalence classes\
-   Test case design\
-   Java implementation\
-   Final documentation

### 2️⃣ Diego --- QA/Dev Support

-   Review & validation\
-   Test case quality checks\
-   Java script testing\
-   Documentation support

------------------------------------------------------------------------

## 🟢 Sprint 3 Overview
Sprint 3 focuses on transforming the validation logic and test design from previous sprints into a functional **Java simulation**, complete with **JUnit automated tests** and a simple **frontend interface** for user input.

This sprint ensures that the banking application behaves correctly in real execution scenarios, including frontend validation, backend validation, and automated test verification.

---

## 🎯 Objectives

- Implement a **Java validation program** using the equivalence classes from Sprint 1.
- Execute **three representative test cases**:
  - 1 valid case  
  - 1 invalid case  
  - 1 boundary case  
- Generate **clear success or error messages** based on user input.
- Produce a **README.txt** with execution instructions.
- Create **JUnit 5 automated tests** replicating the 12 test cases from Sprint 2.
- Prepare the project for final delivery.

---

## 🧩 Activities Completed

- ✔ Development of a `BankValidator.java` class containing all validation logic.  
- ✔ Implementation of a simulation script (`DemoApplication.java`) to run validation examples.  
- ✔ Creation of a simple **frontend** using vanilla JavaScript + HTML + CSS to collect user inputs.  
- ✔ Connection between frontend JavaScript and backend validation through form logic simulation.  
- ✔ Addition of **JUnit 5 test suite** validating all 12 test cases:
  - Valid cases  
  - Invalid numeric formats  
  - Invalid lengths  
  - Invalid characters  
  - Invalid order operations  
- ✔ Review and debugging of Java validation rules.  
- ✔ Documentation of findings and best practices.

---

## 📦 Deliverables

- 💻 **Java validation script** (`BankValidator.java`)
- 🧪 **JUnit test suite** (`BankValidatorTest.java`)
- 🌐 **Frontend prototype**  
  - `index.html`  
  - `app.js`  
  - `styles.css`
- 📄 **README.txt** with execution instructions  
- 📝 Developer notes and validation summary

---

## 🗂 Project Structure

The project follows a clean, modular structure as shown below:

```
src/
├── main/
│   ├── java/com/example/demo/
│   │   ├── BankValidator.java
│   │   ├── DemoApplication.java
│   │
│   └── resources/
│       ├── static/
│       │   ├── index.html
│       │   ├── styles.css
│       │   └── app.js
│       └── application.properties
│
└── test/
    └── java/com/example/demo/
        └── BankValidatorTest.java
```

### 📌 Explanation of Project Structure

- **BankValidator.java**  
  Contains all backend validation rules:  
  - Bank code (3 digits)  
  - Branch code (4 digits)  
  - Account number (10 digits)  
  - Personal key (4 digits)  
  - Order value (1 = checkbook, 2 = statement)

- **DemoApplication.java**  
  Allows quick manual testing through `main()` execution.

- **Frontend files (`index.html`, `app.js`, `styles.css`)**  
  Simulate a real-world banking form.  
  Validations occur first in JavaScript (frontend) and then repeated in Java (backend).

- **JUnit Test Suite**  
  Automatically runs all 12 test cases from Sprint 2.

---

## 🧪 JUnit Test Implementation

The Sprint 3 JUnit test suite validates:

| Test ID | Input Case | Expected Result |
|--------|-------------|-----------------|
| TC01 | All valid data | ✔ Operation accepted |
| TC02 | Bank code contains letters | ❌ Invalid bank code |
| TC03 | Bank code too short | ❌ Wrong length |
| TC04 | Branch code has letters | ❌ Only numbers allowed |
| TC05 | Branch code too long | ❌ Wrong length |
| TC06 | Account number too short | ❌ Wrong length |
| TC07 | Account number too long | ❌ Too many digits |
| TC08 | Account has letters | ❌ Invalid characters |
| TC09 | Personal key has letters | ❌ Invalid key |
| TC10 | Personal key too long | ❌ Wrong length |
| TC11 | Order value = 3 | ❌ Invalid operation |
| TC12 | Order value has letters | ❌ Invalid data type |

All test cases are automated using:

- `assertTrue()`
- `assertFalse()`
- `assertEquals()`

The JUnit suite ensures backend validation matches Sprint 1–2 specifications.

---

## 🖼 Image Placeholders

### 🖥 Frontend Screenshot  
*Paste your frontend UI image here*


<img width="1877" height="1082" alt="image" src="https://github.com/user-attachments/assets/412c3b59-5cef-4aed-846b-01c83d446c43" />
<img width="1871" height="1081" alt="image" src="https://github.com/user-attachments/assets/da3c0bba-ed83-4b22-a757-42697fba1c31" />
<img width="1874" height="1088" alt="image" src="https://github.com/user-attachments/assets/1cf10d5a-8696-483e-ad23-1f8793c44ffb" />


---

### 🧪 JUnit Test Results Screenshot  
*Paste your JUnit green-bar test results here*


<img width="1637" height="594" alt="image" src="https://github.com/user-attachments/assets/093a1abc-497f-4f3a-b602-7b308b80fa52" />

<img width="372" height="158" alt="image" src="https://github.com/user-attachments/assets/60009392-8205-4ccf-a959-22f8772b5399" />


---

**"Building quality software, one Sprint at a time."**  
Developed for the Digital NAO Challenge — REM Consultancy


## 📦 Backlog & Roadmap

### Backlog Board:

<img width="1417" height="842" alt="image" src="https://github.com/user-attachments/assets/4f5c29c3-60b8-4fc4-a6f5-07190569a4f8" />
🧷 Link: https://github.com/users/RazFernandez/projects/11/views/3

### Roadmap Board:

<img width="1454" height="794" alt="image" src="https://github.com/user-attachments/assets/5af3c1cc-b002-4908-bfa2-1fb34502cf71" />
🧷 Link: https://github.com/users/RazFernandez/projects/11/views/1

------------------------------------------------------------------------

**"Building quality software, one Sprint at a time."**\
Developed for Digital NAO Challenge --- REM Consultancy
