# ⚽ Football Player Modeling System (Java OOP)

This repository contains a Java-based implementation of a Football Player management system. The project focuses on demonstrating core **Object-Oriented Programming (OOP)** principles such as Abstraction, Inheritance, and Encapsulation.

---

## 📌 Project Overview
The task involves designing a system to model famous football players (like Messi and Ronaldo) and calculating their performance metrics while maintaining data confidentiality.

### Key Requirements:
* **Abstract Base Class:** `FootballPlayer` stores name, goals, and salary.
* **Encapsulation:** Monthly salary is kept `private` to ensure confidentiality.
* **Inheritance:** Two subclasses, `LaLigaPlayer` and `PremierLeaguePlayer`, extend the base class.
* **Polymorphism:** Implementation of the `calculateGoalRate()` method in each subclass.

---

## 🏗️ Class Architecture

1. **FootballPlayer (Abstract Class)**
   - **Attributes:** `name`, `goals`, `monthlySalary` (Private).
   - **Abstract Method:** `calculateGoalRate()`.

2. **Subclasses**
   - **LaLigaPlayer:** Specifically designed for players in the Spanish league (e.g., Messi).
   - **PremierLeaguePlayer:** Specifically designed for players in the English league (e.g., Ronaldo).

---

## 🧬 Performance Logic
The performance of each player is determined by the following formula implemented in the subclasses:

$$\text{Goal Rate} = \frac{\text{Total Goals Scored}}{\text{Total Matches Played}}$$

---

## 🚀 How to Run the Program

1.  **Prerequisites:** Ensure you have **JDK** (Java Development Kit) installed.
2.  **Save the file:** Save the source code as `FootballSystem.java`.
3.  **Compile:**
    ```bash
    javac FootballSystem.java
    ```
4.  **Execute:**
    ```bash
    java FootballSystem
    ```

---

## 📊 Sample Output
When the program runs, it displays the public details of the players without exposing sensitive salary information:

```text
--- Football Player Details ---

Player: Lionel Messi
League: LaLiga
Goals: 474
Goal Rate: 0.91
---------------------------
Player: Cristiano Ronaldo
League: Premier League
Goals: 103
Goal Rate: 0.44
---------------------------
