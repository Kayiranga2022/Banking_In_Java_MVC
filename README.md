# 🏦 Banking System in Java (MVC Architecture)

A clean and modular **Banking Management System** implemented in **Java** using the **Model-View-Controller (MVC)** architecture. This project demonstrates how to build scalable and maintainable desktop applications in Java with a structured separation of concerns.

---

## 📌 Features

- Create new customer bank accounts
- Deposit and withdraw money
- Display account details
- Validate account operations
- MVC design for maintainability and scalability
- Command-line interface (no GUI) for simplicity

---

## 🧱 Technologies Used

- **Java SE (Standard Edition)**
- **MVC Design Pattern**
- **Java I/O** for file-based data persistence
- No external libraries or frameworks used

---

## 🗂 Project Structure (MVC)

Banking_In_Java_MVC/
├── controller/
│ └── BankController.java # Coordinates between view and model
├── model/
│ ├── Account.java # Represents account data
│ └── AccountDAO.java # Handles data logic and persistence
├── view/
│ └── BankView.java # Handles user interaction and UI prompts
├── BankApp.java # Main application entry point
└── README.md

yaml
Copy
Edit

---

## 🚀 How to Run

1. **Clone the repository**
   ```bash
   git clone https://github.com/Kayiranga2022/Banking_In_Java_MVC.git
   cd Banking_In_Java_MVC
Open in an IDE like IntelliJ, Eclipse, or compile using terminal

bash
Copy
Edit
javac BankApp.java
java BankApp
Follow the on-screen instructions to:

Create accounts

Deposit or withdraw money

Check balances

💾 Data Handling
Account data is stored using basic file storage (e.g., accounts.txt)

AccountDAO handles all file reading/writing logic

Ensures operations like balance checks are validated properly

🎯 Learning Objectives
Understand how to apply the MVC architecture in Java

Use object-oriented principles to organize business logic

Practice file-based persistence without relying on databases

Improve understanding of code separation and reusability

📈 Future Enhancements
Add Java Swing GUI

Introduce authentication and login system

Store data in a relational database (e.g., MySQL or SQLite)

Generate PDF statements for account holders

📖 License
This project is open-source and available under the MIT License.

👤 Author
Kayiranga Ernest
📍 Kigali, Rwanda
🔗 LinkedIn
📧 kayinesta23@gmail.com

If you found this project useful, ⭐ star it and feel free to fork and contribute!
