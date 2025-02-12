# Hybrid Automation Testing Framework for NopCommerce

## Overview

The **Hybrid Automation Testing Framework** is built exclusively for **NopCommerce**, a popular **eCommerce platform** running on **IIS Server** with **ASP.NET Core 8.0** and **SQL Server**. This framework is designed to automate **UI testing** using **Selenium WebDriver** and **TestNG**, ensuring **robust, scalable, and maintainable test execution**.

> **🔍 Why Java Project Instead of Maven/Gradle?**
> This project is intentionally built as a **pure Java Project** instead of using **Maven or Gradle**. The main objective is to gain a **deep understanding of manual dependency management, classpath configuration, and library integration**. By manually downloading, installing, and configuring all dependencies, developers will:
> - Understand **how external libraries interact with the Java classpath**.
> - Learn how to **resolve dependency conflicts manually** before relying on automated dependency management.
> - Gain **full control over the project structure**, enhancing debugging and troubleshooting skills.
> - **Facilitate an easier transition to Maven/Gradle** in the future with a solid foundational understanding.

This approach **provides deep learning** and ensures that when migrating to Maven/Gradle, dependency management and project structuring are **seamlessly integrated**.

---

### 🔗 GitHub Repository

**URL:** [Hybrid Automation Testing Framework for NopCommerce](https://github.com/LeTiepTuyen/hybrid-nopcommerce-framework)

> 🚨 If you are looking for **Automation Testing for the OrangeHRM5 Desktop Application**, check out the dedicated repo:  
> **🔗 [Hybrid Automation Testing Framework for OrangeHRM5](https://github.com/LeTiepTuyen/hybrid-orangehrm5-automation-framework)**

---

## 📌 Key Features

### 🚀 Framework Design
- Implements a **Hybrid Testing Framework** using the **Page Object Pattern (POP)** for **better modularity and maintainability**.
- Adopts **AAA (Arrange-Act-Assert) Pattern** for **structured and reliable test execution**.
- Utilizes **Factory Pattern** and **custom-built utilities** for **efficient test data management** and **driver instantiation**.

### 🛠️ Technology Stack
- **Java 17+**: Core programming language for automation scripting.
- **Selenium WebDriver**: Automates browser interactions for UI testing.
- **TestNG**: Manages test execution, assertions, and parallel testing.
- **Apache Log4j**: Implements logging for debugging test execution.
- **Extent Report v5 / Allure Report / ReportNG**: Multiple reporting mechanisms for test execution analysis.

### 📊 Advanced Reporting & Logging
- **Extent Report v5**: Provides interactive and customizable test reports.
- **Allure Report**: Offers advanced test execution visualizations.
- **ReportNG**: Enhances traditional TestNG reporting with better readability.
- **Log4j**: Implements structured logging for debugging and execution tracking.

### ⚡ Test Implementation & Structure
- **Manual Library Management**: **No Maven/Gradle** – all dependencies are manually configured.
- **Parallel Execution**: Uses **TestNG** for **multi-browser execution**.
- **Dynamic Locators**: Implements a **flexible locator strategy** for handling UI elements.
- **Assertions & Verifications**: Uses a **custom assertion library** for enhanced test validations.
- **Data-Driven Testing**: Supports **parameterized test execution** using **TestNG DataProvider**.
- **File Upload Handling**: Automates **file upload scenarios** using Selenium actions.

### 🔗 Integration
- Configured to run **locally** on **IIS Web Server** with **ASP.NET Core 8.0** and **SQL Server**.
- All external dependencies (WebDriver, Log4j, ReportNG, etc.) **must be manually downloaded and added** to the `lib` folder.

---

## 📂 Project Structure

hybrid-nopcommerce-framework/ 
- actions/ # Core automation actions 
- browserDrivers/ # WebDriverManager and browser drivers 
- htmlExtent/ # Extent Report handling 
- interfaces/ # Interface definitions 
- libExtent5/ # Extent Report v5 integration 
- libLog4j1/ # Log4j for logging (version 1) 
- libLog4j2/ # Log4j for logging (version 2) 
- libReportNG/ # ReportNG integration 
- libWDM/ # WebDriverManager setup 
- libraries/ # Utility and helper libraries 
- resources/ # Configurations and resource files 
- sourceDocs/ # Documentation and test strategies 
- testcases/com/ # Test case implementations 
- uploadFiles/ # File upload automation 
- .gitignore # Git ignored files 
- version2-hybrid-nopcommerce-framework.iml # IntelliJ project file


---

## 🛠️ Manual Setup Guide

### 📌 Prerequisites
Ensure the following software is installed:
- **Java 17+**
- **Google Chrome / Mozilla Firefox**
- **IntelliJ IDEA / Eclipse**
- **TestNG Plugin for IntelliJ/Eclipse**
- **Log4j / Extent Reports / Allure Reports (Manually Added to `lib/`)**

### ⚙️ Steps to Run Tests

1. **Clone the repository:**
  ```bash
   git clone https://github.com/LeTiepTuyen/hybrid-nopcommerce-framework.git
   cd hybrid-nopcommerce-framework
  ```
   
2. **Manually Download and Configure Dependencies:**
  Selenium WebDriver JARs → Add to the /lib folder
  TestNG JAR → Add to the /lib folder
  Log4j JAR → Add to the /lib folder
  Extent Reports / Allure Reports / ReportNG JARs → Add to /lib

3. **Set Up Classpath in IntelliJ/Eclipse:**
  Go to Project Settings → Libraries → Add all JARs from the /lib directory.
  Ensure TestNG is recognized by the IDE.

4. **Run Tests:**
  Open testng.xml file.
  Right-click and select Run As TestNG Suite.

5. **Generate and View Reports:**
  Extent Report: Open reports/extent-report.html
  Allure Report: Run allure serve allure-results/
  ReportNG: View generated TestNG reports in the test-output/ folder.

### 📌 Future Enhancements
- Migrate to Maven for easier dependency management once all libraries are well understood.
- CI/CD Integration with Jenkins/GitHub Actions for automated test execution.
- Dockerized Selenium Grid for cross-browser testing at scale.
- Enhanced Data-Driven Testing using Apache POI for Excel-based test scenarios.

---

### 📧 Contact

For any questions or contributions, feel free to reach out via GitHub Issues.

### 🔹 **Key Improvements in This Version**
1. **Clearly Defined Learning Objective** 🎯
   - Explicitly states **why manual setup was chosen** instead of Maven/Gradle.
   - Highlights **how this approach enhances foundational knowledge**.

2. **Emphasized Step-by-Step Manual Setup** ⚙️
   - Clearly outlines **manual installation of dependencies**.
   - Explains how to **configure the classpath in IntelliJ/Eclipse**.

3. **Future Migration to Maven** 🔄
   - Mentions that **once manual setup is fully understood, Maven migration will be easy**.
   - Helps show progression from **manual dependency management → Maven integration**.

---

## 🚀 Why Is This Version Better?
✅ **Better Justification** for using Java Project over Maven.  
✅ **More Professional & Structured** Markdown formatting.  
✅ **Clearly Highlights Future Roadmap** to migrate to Maven once concepts are fully grasped.  

This version makes your project look **polished, professional, and structured for learning & growth**! 🚀🔥 Let me know if you need any more refinements. 💡
