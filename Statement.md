# HostelSync — Project Statement

## 1. Problem Statement

Hostel management involves handling different types of information such as student records, room availability, complaints, fee details, staff information and hostel details. When these operations are handled separately, it can become difficult to access information quickly and keep track of complaints and other hostel-related activities.

HostelSync is a console-based Java application developed to bring these common hostel management operations into a single system. The application provides separate modules for managing students, rooms, complaints, fees, staff and hostel information. It also provides a complaint analysis feature that processes a complaint description and provides its category, priority and confidence score.

The system provides a clear menu-based workflow where users can access hostel information, submit and track complaints, check fee status and view an overall dashboard from one application.

## 2. Scope of the Project

The current scope of HostelSync covers the following hostel management operations:

- Student record management
- Room information and availability checking
- Complaint submission and tracking
- Complaint status updates
- Complaint category and priority analysis
- Fee status management
- Staff information
- Hostel information
- Hostel dashboard and summary information
- Login and role selection
- Demo mode for accessing the system with sample data

The application is currently implemented as a command-line Java application. Sample data is loaded when the application starts so that the main features can be demonstrated and tested without additional database configuration.

The current project focuses on core hostel management and information-handling workflows. Features such as a graphical user interface, online deployment and external database integration are outside the scope of the current version.

## 3. Target Users

### Students

Students can use the system to access relevant hostel information, check fee details and submit or track complaints.

### Faculty and Hostel Staff

Faculty and hostel staff can use the available system functions to access hostel information and work with complaint and related records.

### Hostel Administrators

Hostel administrators can use the system to view student, room, complaint, fee and dashboard information for hostel management activities.

### Keyless Entry Users

The system also provides a Keyless Entry option as part of its available access flow.

## 4. High-Level Features

### Student Management

Provides access to student records maintained by the system.

### Room Management

Displays room information and allows room availability to be checked.

### Complaint Management

Allows users to submit complaints and view existing complaints.

### Complaint Status Management

Supports complaint tracking through statuses including `PENDING`, `ASSIGNED`, `IN_PROGRESS`, `RESOLVED` and `CLOSED`.

### Complaint Analysis

Processes complaint descriptions to identify the complaint category, priority and confidence score.

### Fee Management

Provides access to fee information and unpaid fee status.

### Hostel Dashboard

Provides a summary of important hostel information, including students, rooms, occupancy, complaints and unpaid fees.

### Staff and Hostel Information

Provides access to staff and hostel-related information maintained by the application.

### Login and Role Selection

Provides a login flow with Student, Faculty and Keyless Entry options.

### Demo Mode

Allows the system to be opened directly with sample data for demonstration and testing.
