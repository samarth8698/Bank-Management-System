# Bank Management System

A Java-based Bank Management System developed using Java Swing and MySQL. This desktop application simulates basic banking operations such as account creation, login, deposit, withdrawal, balance enquiry, mini statement, PIN change, and fast cash.

## Features

* User Registration
* Secure Login
* Deposit Money
* Withdraw Money
* Balance Enquiry
* Mini Statement
* Fast Cash
* PIN Change
* MySQL Database Integration
* User-Friendly Java Swing Interface

## Tech Stack

* Java
* Java Swing (GUI)
* JDBC
* MySQL
* Eclipse IDE

## Project Structure

Bank-Management-System/
│
├── Backend/
│   └── Bank-Management-System/
│       ├── build/
│       │   └── classes/
│       ├── src/
│       │   └── main/
│       │       ├── java/
│       │       │   ├── BankSystem/
│       │       │   │   ├── BalanceEnquriy.java
│       │       │   │   ├── Conn.java
│       │       │   │   ├── Deposit.java
│       │       │   │   ├── FastCash.java
│       │       │   │   ├── Login.java
│       │       │   │   ├── Pin.java
│       │       │   │   ├── Signup.java
│       │       │   │   ├── Signup2.java
│       │       │   │   ├── Signup3.java
│       │       │   │   ├── Withdrawl.java
│       │       │   │   ├── mini.java
│       │       │   │   └── main_Class.java
│       │       │   │
│       │       │   └── icon/
│       │       │       ├── atm2.png
│       │       │       ├── backbg.png
│       │       │       ├── bank.png
│       │       │       └── card.png
│       │       │
│       │       └── webapp/
│       │           ├── META-INF/
│       │           │   └── MANIFEST.MF
│       │           └── WEB-INF/
│       │               └── web.xml
│       │
│       ├── .classpath
│       ├── .project
│       └── .settings/
│
└── Database/
    └── Bank.sql

    

## Database Setup

1. Open MySQL.
2. Create a database named "banksystem".
3. Import the "Database/Bank.sql" file.
4. Update the database username and password in "Conn.java" if required.


## How to Run

1. Clone the repository.
2. Import the project into Eclipse IDE.
3. Configure the MySQL database.
4. Run "main_Class.java".


## Screenshots
You can add screenshots of:-

* Login Screen
* Signup
* Deposit
* Withdraw
* Balance Enquiry
* Mini Statement

## Developer

**Samarth Adhao**
