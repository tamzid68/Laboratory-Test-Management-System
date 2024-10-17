# Hospital Management System (HMS)

## Overview
The Hospital Management System (HMS) is a Java-based application designed to manage laboratory tests efficiently. It provides functionalities for setting up tests, saving reports, searching for test records, and displaying data in a user-friendly interface.

## Features
- User authentication for secure access.
- Manage and set up various lab tests (pathological and radiological).
- Search for test reports using test names.
- Display test details in a table format.
- Store and retrieve test data from a text file.

## Technologies Used
- **Java**: The primary programming language.
- **Java Swing**: For the graphical user interface (GUI).
- **BufferedReader & FileWriter**: For reading from and writing to text files.

## Project Structure
The project is structured as follows:

com.hms ├── controller │ ├── LogingController.java │ ├── Main.java │ ├── RouteController.java │ ├── SearchController.java │ └── TableController.java ├── model │ ├── DefineTheEnum.java │ ├── GetDataAll.java │ ├── LabTest.java │ ├── SaveingData.java │ ├── SearchTest.java │ ├── TestReport.java │ └── LoginData.java └── view ├── LogingPage.java ├── Home.java ├── LabTestSetup.java ├── LabTestSearch.java └── ListTable.java




## Getting Started

### Prerequisites
- Java Development Kit (JDK) installed on your machine.
- An IDE such as IntelliJ IDEA or Eclipse.

### Installation
1. Clone the repository:
   ```bash
   git clone https://github.com/yourusername/hospital-management-system.git

2. Navigate to the project directory
cd hospital-management-system

Open the project in your preferred IDE.
Running the Application
Compile and run the Main.java class in the controller package.
The application will launch the login page, from which you can access the main features.
Usage
Use the login page to authenticate.
Navigate to the home page to manage lab tests or search for reports.
The application will read test data from the test_reports.txt file.
Contributing
Contributions are welcome! If you have suggestions for improvements or new features, please fork the repository and submit a pull request.

