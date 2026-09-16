## HostelSync

Smart Hostel Management System

HostelSync is a Java-based Smart Hostel Management System developed as a Build Your Own Project (BYOP) at VIT Bhopal University.

The application provides a console-based platform for managing students, rooms, complaints, fees, staff and hostel information. It also includes an AI-based complaint analysis feature that analyzes complaint descriptions and provides a category, priority and confidence score.

Features

- Student management
- Room management
- Room availability checking
- Complaint submission
- Complaint viewing and tracking
- Complaint status updates
- AI-based complaint analysis
- Complaint category detection
- Complaint priority prediction
- AI confidence score
- Fee status management
- Hostel dashboard
- Staff information
- Login flow
- Student, Faculty and Keyless Entry options
- Demo mode

## Login and Demo

When the application starts, the user is presented with:

1. Login
2. Demo
0. Exit

The Login option asks the user to enter an email or phone number. No predefined password is required.

After entering the login information, the user can select:

1. Student
2. Faculty
3. Keyless Entry

All three options provide access to the HostelSync system.

The Demo option allows the reviewer to directly enter the main HostelSync system without going through the login process.

## Main Menu

After entering the system, the following options are available:

1. View Students
2. View Rooms
3. Submit Complaint
4. View Complaints
5. Check Fees
6. AI Complaint Analysis
7. View Dashboard
8. Update Complaint Status
0. Logout

## Student Management

The student module stores basic student information.

The information includes:

- Student ID
- Name
- Email
- Phone number
- Room assignment

The stored student records can be viewed through the main menu.

## Room Management

The room module provides information about hostel rooms.

The system displays:

- Room number
- Room capacity
- Occupied spaces
- Room availability

This allows the current room status to be viewed from the console.

## Complaint Management

Students can submit complaints by entering a description of the problem.
Example:

The fan in my room is not working
After submission, the complaint is stored with its category, priority and current status.
New complaints are assigned the status:

## PENDING

The system supports the following complaint statuses:

- PENDING
- ASSIGNED
- IN_PROGRESS
- RESOLVED
- CLOSED

Complaints can be viewed through the View Complaints option and their status can be changed using the Update Complaint Status option.

## AI Complaint Analysis

HostelSync includes an AI-based complaint analysis module.

The system analyzes the complaint description and provides:

- Complaint category
- Complaint priority
- Confidence score

For example, a complaint related to a fan or another electrical problem can be classified under the Electrical category.

The AI analysis is available while submitting a complaint and through the separate AI Complaint Analysis option.

## Fee Management

The fee module allows users to view student fee information.

The system displays:

- Student ID
- Fee amount
- Payment status

Payment status can be displayed as:

- PAID
- UNPAID

## Dashboard

The HostelSync dashboard provides a quick overview of the current hostel data.

It displays:

- Total students
- Total rooms
- Available rooms
- Occupancy rate
- Total complaints
- Pending complaints
- Resolved complaints
- Unpaid fees

This provides a quick summary of the current state of the hostel system.

## Sample Data

HostelSync loads sample data when the application starts.

The sample data contains:

- Student records
- Room records
- Fee records
- Staff information
- Hostel information
- Sample complaint data

This allows the reviewer to test the major features immediately without manually creating all the initial records.

## Technology Used

- Java
- Maven
- Object-Oriented Programming
- Java Collections
- Exception Handling
- IntelliJ IDEA

## Project Structure

The project follows a modular structure with separate packages for different responsibilities.

HostelSync



### Package Overview

**ai**

Contains the AI-based complaint analysis and prediction components.

**model**

Contains the main data models and enums used by the application.

**service**

Contains the business logic for students, rooms, complaints, fees, staff, hostel information and other operations.

**repository**

Contains the data access related components.

**exception**

Contains custom exception classes used by the application.

**util**

Contains utility classes used by the application.

## Requirements

Before running HostelSync, make sure the following are installed:

- JDK 26 or a compatible Java version
- Apache Maven
- IntelliJ IDEA or another Java IDE

## Checking Java

Open a terminal and run:

java -version

## Checking Maven

Open a terminal and run:

mvn -version

## How to Run

### Using IntelliJ IDEA

1. Open the HostelSync project in IntelliJ IDEA.
2. Make sure the project is configured with the required JDK.
3. Wait for Maven to load the project dependencies.
4. Open Main.java.
5. Run the Main class.
6. The HostelSync application will start in the console.
7. Select the required option by entering its corresponding number.

### Using Maven

Open a terminal in the project root directory.

Run:

mvn clean compile

After compilation, run the application using the configured main class.

## Application Usage

When the application starts, the following options are displayed:

1. Login
2. Demo
0. Exit

Selecting Demo opens the main HostelSync system directly.

Selecting Login asks for an email or phone number and then provides the following options:

1. Student
2. Faculty
3. Keyless Entry

The selected option opens the main HostelSync menu.

## Example Workflow

Start HostelSync

↓

Login / Demo

↓

Student / Faculty / Keyless Entry

↓

Main Menu

↓

View Students
↓
View Rooms
↓
Submit Complaint
↓
View Complaints
↓
Check Fees
↓
AI Complaint Analysis
↓
View Dashboard
↓
Update Complaint Status
↓
Logout

## OOP Concepts Used

The project demonstrates several Object-Oriented Programming concepts:

- Classes and Objects
- Encapsulation
- Constructors
- Getters and Setters
- Enums
- Service Classes
- Exception Handling
- Collections
- Separation of Responsibilities

## Project Objective

The main objective of HostelSync is to create a simple and organized hostel management system that brings different hostel operations together in one application.

The project focuses on managing student and room information, handling hostel complaints, checking fee status and providing an overview through the dashboard.

The AI complaint analysis feature adds an intelligent component that helps classify complaints and determine their priority.

## Future Enhancements

Possible improvements for future versions include:

- Database integration
- Persistent data storage
- Secure user authentication
- Online fee payment
- Web-based interface
- Mobile application
- Real-time notifications
- Automated staff assignment
- Advanced AI-based complaint classification
- Online complaint tracking
- Room allocation and transfer management

## Author

**Ayush Raj**

**Registration Number - 25BAI11407**

**VIT Bhopal University**

Project: HostelSync

Domain: Smart Hostel Management

Technology: Java
