# Java GUI Login System

## Faith Runesu H230278R

A complete login and registration system built with Java Swing, featuring a graphical user interface, user data persistence, and basic security features.

## 📋 Table of Contents
- [Features](#features)
- [Prerequisites](#prerequisites)
- [Installation](#installation)
- [Project Structure](#project-structure)
- [Usage](#usage)
- [Technical Details](#technical-details)
- [Troubleshooting](#troubleshooting)
- [Future Enhancements](#future-enhancements)
- [Contributing](#contributing)

## ✨ Features
- User-friendly graphical interface
- User registration with email validation
- Secure login system
- Password encryption
- Password confirmation
- Data persistence using file storage
- Error handling and input validation
- Navigation between screens
- Welcome screen after successful login

## 🔧 Prerequisites
- Java Development Kit (JDK) 8 or higher
- Integrated Development Environment (IDE) like IntelliJ IDEA or Eclipse
- Basic understanding of Java (optional)

## 📥 Installation

### Using IntelliJ IDEA
1. Download and install IntelliJ IDEA Community Edition
2. Clone or download this project
3. Open IntelliJ IDEA
4. Select `File -> New -> Project from Existing Sources`
5. Navigate to the project directory and select it
6. Follow the import wizard, accepting the default settings

### Using Command Line
1. Clone or download the project
2. Navigate to the project directory
3. Create a `src` directory if it doesn't exist
4. Copy all .java files into the `src` directory
5. Compile the project:
```bash
javac src/*.java
```
6. Run the application:
```bash
java -cp src Main
```

## 📁 Project Structure
```
LoginSystem/
│
├── src/
│   ├── Main.java           # Application entry point
│   ├── User.java           # User data model
│   ├── UserManager.java    # User data handling
│   ├── LoginFrame.java     # Login window GUI
│   └── RegisterFrame.java  # Registration window GUI
│
├── users.txt               # User data storage file
└── README.md              # This file
```

## 🚀 Usage

### Running the Application
1. Launch the application using your IDE or command line
2. The login window will appear first

### Registration
1. Click the "Register" button on the login window
2. Fill in the required fields:
   - Username
   - Password
   - Confirm Password
   - Email
3. Click "Register"
4. If successful, you'll be redirected to the login screen

### Login
1. Enter your username and password
2. Click "Login"
3. If successful, you'll see the welcome screen

## 🔍 Technical Details

### Components Description

#### User.java
- Basic user model class
- Stores username, password, and email
- Provides getter methods for data access

#### UserManager.java
- Handles user data operations
- Manages file-based persistence
- Implements registration and login logic
- Validates user credentials

#### LoginFrame.java
- Main login window interface
- Handles login form validation
- Manages navigation to registration
- Shows success/error messages

#### RegisterFrame.java
- Registration window interface
- Implements form validation
- Handles user registration process
- Provides navigation back to login

#### Main.java
- Application entry point
- Initializes the GUI
- Sets up the user management system

### Data Storage
- Users are stored in `users.txt`
- Data format: `username,password,email`
- File is automatically created on first run
- Data is loaded at startup and saved after modifications

## ❗ Troubleshooting

### Common Issues and Solutions

1. **Application Won't Start**
   - Verify Java installation: `java -version`
   - Check compilation errors
   - Ensure all files are in correct directories

2. **Can't Register New User**
   - Check if users.txt is writable
   - Verify username isn't already taken
   - Ensure all fields are filled correctly

3. **Login Failed**
   - Verify username and password
   - Check if users.txt exists and is readable
   - Ensure user was properly registered

4. **Compilation Errors**
   - Verify JDK installation
   - Check all files are present
   - Ensure proper file encoding (UTF-8)

## 🚧 Future Enhancements
1. Password recovery system
2. Remember me functionality
3. User profile management
4. Admin panel
5. Database integration
6. Enhanced input validation
7. Password strength meter
8. Session management
9. Dark/Light theme toggle

## 🤝 Contributing
Contributions are welcome! Here's how you can help:

1. Fork the repository
2. Create a feature branch
3. Make your changes
4. Test thoroughly
5. Submit a pull request

### Code Style Guidelines
- Use meaningful variable names
- Add comments for complex logic
- Follow Java naming conventions
- Keep methods focused and concise
- Add appropriate error handling

### Testing
Before submitting changes:
1. Test all registration scenarios
2. Verify login functionality
3. Check data persistence
4. Validate error handling
5. Ensure UI responsiveness

## 📝 Notes for Beginners
- Start by understanding the Main.java file
- Study how the GUI components interact
- Look at the basic user management flow
- Experiment with small modifications first
- Use the debugger to understand the flow

For questions or support, please open an issue in the repository.
