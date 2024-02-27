# Employee Management System

## Overview
This project is an Employee Management System designed to calculate the salary of both normal and special employees based on various allowances and deductions.

## Files
1. `main_part5.java`: Contains the main class to execute the program.
2. `Employee.java`: Abstract class representing an employee with common attributes and methods.
3. `NormalEmployee.java`: Class representing a normal employee, extending the `Employee` class.
4. `SpecialEmployee.java`: Class representing a special employee, extending the `Employee` class.

## Usage
To use this program, follow these steps:

1. Compile all Java files.
2. Execute the `main_part5` class.
3. Follow the prompts to input employee details.
4. The program will calculate and display the total earnings of each employee.

## Classes and Methods

### `Employee` Class
- Attributes:
  - `empName`: Employee name
  - `empAddress`: Employee address
  - `empDesignation`: Employee designation
  - `empDept`: Employee department
  - `doj`: Date of joining
  - `bankName`: Name of the bank
  - `UAN`: Universal Account Number
  - `PF_NO`: Provident Fund Number
  - `ESINo`: Employee State Insurance Number
  - `empId`: Employee ID
  - `bankAcctNo`: Bank account number
  - `totalWorkingDays`: Total working days in a month
  - `paidDays`: Number of days paid
  - `leavesTaken`: Number of leaves taken
  - `lopDays`: Loss of Pay (LOP) days
  - `grosswage`: Gross wage of the employee
  - `totalEarning`: Total earnings of the employee
  - `totalDeductions`: Total deductions from the employee's earnings
  - `basicWage`: Basic wage component
  - `hra`: House Rent Allowance (HRA)
  - `conveyanceAllowances`: Conveyance allowances
  - `medicalAllowances`: Medical allowances
  - `otherAllowances`: Other allowances
  - `epf`: Employee Provident Fund (EPF)
  - `esi`: Employee State Insurance (ESI)
  - `pt`: Professional Tax (PT)
  - `loanRecovery`: Loan recovery amount
  
- Methods:
  - `salaryCalculation()`: Abstract method to calculate the salary of an employee.
  - `getEmployeeDetails()`: Method to input employee details.

### `NormalEmployee` Class
- Extends the `Employee` class.
- Implements the `salaryCalculation()` method to calculate salary for normal employees.

### `SpecialEmployee` Class
- Extends the `Employee` class.
- Implements the `salaryCalculation()` method to calculate salary for special employees.

