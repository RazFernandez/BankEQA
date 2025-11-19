# 🏦 Banking App Quality Assurance

**Authors:** Diego Gonzalez & Miguel Fernandez  
**Date:** November 2025  
**Current Phase:** 🟢 Sprint 1 Complete

<img width="250" height="720" alt="Diseño sin título (12)" src="https://github.com/user-attachments/assets/051d4701-34a6-4f42-b3cf-e3394ad0b6de" />

---

## 🚀 Overview

Welcome to the documentation for the **Banking Application Validation Project**.  
This project solves a critical operational problem: **ensuring data quality for banking transactions** within a complex financial environment.

Modern banking institutions face inconsistent validation mechanisms, leading to potential service failures and financial risk. This project delivers a structured validation and testing suite using **equivalence classes**, **test cases**, and a **Java-based simulation**.

---

## 🌍 Social Problematic

Banking users rely on secure and predictable transactional systems. Poor validation can result in incorrect operations, rejected transactions, or system failures. This project strengthens reliability and reduces risks associated with invalid or malformed data inputs.

---

## 🎯 Project Vision

To develop a complete testing and validation suite for a banking application by applying black‑box testing techniques and implementing a Java simulation that automates field validation with high accuracy.

---

## 🧩 Proposal Solution

The solution is structured into **three Sprints**, each producing key deliverables required to validate the application thoroughly.

---

# 📅 Project Roadmap & Strategic Planning

## ✅ Sprint 1: Equivalence Class Design (Nov 15–18)

### Objectives
- Analyze required banking fields: bank code, branch code, account number, personal key, and order value.  
- Define complete equivalence classes (valid + invalid).  
- Provide justification and examples.  
- Create an executive‑level presentation.

### Tasks by Role
**🔹 Member A — Miguel (QA Analyst)**  
- Analyze business rules.  
- Define equivalence classes.  
- Identify valid, invalid, and boundary values.  
- Provide examples and justification.  
- Create the PDF presentation.

**🔹 Member B — Diego (QA/Dev Support)**  
- Validate correctness of classes.  
- Review presentation structure and clarity.  
- Confirm alignment with black‑box standards.

### Expected Deliverables
- Document of equivalence classes.  
- Executive PDF with tables, examples, and justifications.

---

## 🔜 Sprint 2: Test Case Development (Nov 19–24)

### Objectives
- Convert equivalence classes into concrete test scenarios.  
- Build 12 detailed test cases.  
- Document initial/final states and expected outcomes.  
- Prepare coverage Excel report.

### Tasks by Role
**🔹 Member A — Miguel (QA Analyst)**  
- Create 12 detailed test cases.  
- Label them by class (valid/invalid/boundary).  
- Define expected outcomes.  
- Build Excel documentation.

**🔹 Member B — Diego (QA/Dev Support)**  
- Validate completeness of test cases.  
- Suggest improvements or missing scenarios.  
- Format Excel report.

### Expected Deliverables
- Excel report with 12 test cases.  
- Coverage table mapping classes → test cases.

---

## 🔮 Sprint 3: Java Simulation & Validation (Nov 25–29)

### Objectives
- Build Java program to validate inputs using equivalence rules.  
- Execute 3 representative test cases.  
- Display clear success/error outputs.  
- Produce README instructions.

### Tasks by Role
**🔹 Member A — Miguel (Developer)**  
- Implement Java validation script.  
- Translate equivalence classes into rules.  
- Add execution examples.  
- Generate output messages.

**🔹 Member B — Diego (QA/Dev Support)**  
- Review Java code for correctness and readability.  
- Run tests using defined cases.  
- Document findings and improvements.  
- Help write README.txt.

### Expected Deliverables
- Java simulation script.  
- README.txt with steps.  
- Validation notes.

---

## 🧾 Final Submission (Nov 29)

### Deliverables
- Final integrated PDF combining all Sprints.  
- MP4 video presentation explaining methodology and results.

---

# 📐 User Stories

| N° | User Story | Requirements | Deliverables | Sprint | Deadline |
|----|------------|--------------|--------------|--------|----------|
| 1 | As a QA Analyst, I need to define equivalence classes to ensure structured test coverage. | Analyze fields; define valid/invalid ranges; prepare examples. | Equivalence class document. | Sprint 1 | Nov 18 |
| 2 | As a QA Analyst, I need an executive PDF to present the equivalence classes. | Introduce concept; justify classes; build tables. | PDF presentation. | Sprint 1 | Nov 18 |
| 3 | As a QA Tester, I need 12 detailed test cases. | Define inputs, states, expected results. | Excel with 12 test cases. | Sprint 2 | Nov 24 |
| 4 | As a QA Tester, I need a coverage report. | Create coverage table; ensure variety. | Excel report. | Sprint 2 | Nov 24 |
| 5 | As a Developer, I need a Java simulation that applies the validation logic. | Implement validation rules; execute cases. | Java script + README.txt. | Sprint 3 | Nov 29 |
| 6 | As a Developer, I need to deliver a final integrated submission. | Combine all outputs; create video. | Final PDF + MP4. | Sprint 3 | Nov 29 |

---

# 📌 Technical Rules Defined (Sprint 1)

Using **Equivalence Partitioning**, the following rules were established:

| Data Field     | Requirement | Strategic Value |
|----------------|-------------|-----------------|
| Bank Code      | 3 digits | Prevent routing errors. |
| Branch Code    | 4 digits | Ensures valid location. |
| Account Number | 10 digits | Standardized integrity. |
| PIN (Key)      | 4 digits | Access control. |
| Order Value    | Specific text values | Ensures processing efficiency. |

---

# 🛠 Deliverables Overview

This repository includes:

- 📄 Executive PDF (Sprint 1)  
- 📘 Equivalence Classes  
- 📊 Excel Test Case Report (Sprint 2)  
- 💻 Java Simulation File (Sprint 3)  
- 🎥 Final MP4 Presentation (Sprint 3)  

---

# 🌱 Sustainability & Long‑Term Value

By applying systematic testing and validation, this project enhances REM's ability to deliver reliable banking software. This approach reduces long‑term financial risk and increases trust in digital services.

---

# 👥 Team Structure & Roles

### 1️⃣ Miguel — QA Analyst & Backend Developer  
- Equivalence classes  
- Test case design  
- Java implementation  
- Final documentation  

### 2️⃣ Diego — QA/Dev Support  
- Review & validation  
- Test case quality checks  
- Java script testing  
- Documentation support  

---

# 📦 Backlog & Roadmap

Backlog Board: 
<img width="1417" height="842" alt="image" src="https://github.com/user-attachments/assets/4f5c29c3-60b8-4fc4-a6f5-07190569a4f8" />
🧷 Link: https://github.com/users/RazFernandez/projects/11/views/3

Roadmap Board: 
<img width="1454" height="794" alt="image" src="https://github.com/user-attachments/assets/5af3c1cc-b002-4908-bfa2-1fb34502cf71" />
🧷 Link: https://github.com/users/RazFernandez/projects/11/views/1

---

> **"Building quality software, one Sprint at a time."**  
> Developed for **Digital NAO Challenge — REM Consultancy**
