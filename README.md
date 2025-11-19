# 🏦 Banking App Quality Assurance

**Authors:** Diego Gonzalez & Miguel Fernandez\
**Date:** November 2025\
**Current Phase:** 🟢 Sprint 1 Complete

------------------------------------------------------------------------

## 🚀 Overview

Welcome to the documentation for the **Banking Application Validation
Project**.\
This project solves a critical operational problem: **ensuring data
quality for banking transactions** within a complex financial
environment.

This repository contains all deliverables for **Sprint 1**. We are using
an **Agile Methodology**, allowing us to manage the project's lifecycle
efficiently while anticipating future requirements.

------------------------------------------------------------------------

## 📅 Project Roadmap & Strategic Planning

To ensure the success of the final Java simulation, the project is
structured into **three dependent stages**:

### ✅ Sprint 1: Analysis & Design (**COMPLETED**)

-   **Goal:** Define the rules (Equivalence Classes).\
-   **Why:** We cannot write test cases or code until we define what is
    "Valid" and "Invalid".\
-   **Deliverable:** Executive PDF with Equivalence Classes.\
-   **Status:** Ready for review in this folder.

### 🔜 Sprint 2: Test Case Construction (**NEXT STEP**)

-   **Goal:** Create 12 specific test scenarios based on Sprint 1
    rules.\
-   **Strategy:** Combine valid and invalid classes to stress‑test the
    system.\
-   **Deliverable:** Excel report with detailed steps.\
-   **Status:** Planned (Waiting for Sprint 1 approval).

### 🔮 Sprint 3: Automation & Implementation (**FUTURE**)

-   **Goal:** Develop the Java code.\
-   **Strategy:** Translate Sprint 1 and 2 logic into a functional
    script.\
-   **Deliverable:** `.java` file and execution manual.\
-   **Status:** Pending completion of Sprint 2.

------------------------------------------------------------------------

## 🎯 Strategic Impact & Stakeholder Value

### 💰 Economic Feasibility

Filtering invalid data before processing saves computational and storage
resources.

### 🔧 Scalability

Rule definitions provide a robust model that can easily adapt as the
bank introduces new features.

### 🌍 Social Impact

A secure, bug‑free banking application fosters user trust and protects
financial stability.

------------------------------------------------------------------------

## 🛠️ Technical Rules Defined (Sprint 1)

Using **Equivalence Partitioning**, we established the "Ground Rules" to
maximize coverage:

  -----------------------------------------------------------------------
  Data Field             Requirement          Strategic Value
  ---------------------- -------------------- ---------------------------
  Bank Code              3 Digits             🛡️ Security: Prevents
                                              routing errors.

  Branch Code            4 Digits             📍 Precision: Ensures the
                                              location exists.

  Account No.            10 Digits            💾 Integrity: Maintains
                                              standard database format.

  PIN (Key)              4 Digits             🔒 Access: Basic access
                                              control.

  Order Value            Specific Text        ⚡ Efficiency: Limits
                                              operations to valid
                                              services only.
  -----------------------------------------------------------------------

------------------------------------------------------------------------

## 📂 Current Deliverables

In this sprint you will find:\
- 📄 **Executive PDF Presentation:**\
- Equivalence Classes\
- Justification of selected data ranges\
- Examples to be used in Sprint 2

------------------------------------------------------------------------

## 📬 Contact

If you have questions about the roadmap or the equivalence strategy,
please contact the development team.

> **"Building quality software, one Sprint at a time."** 🌟\
> Developed for **Digital NAO Challenge - REM Consultancy**
