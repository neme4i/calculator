# Console Calculator

A simple console-based calculator implemented in Java. This calculator supports basic arithmetic operations as well as some advanced mathematical functions. It also keeps a history of all calculations performed during the session.

## Table of Contents
1. [Features](#features)
2. [How to Use](#how-to-use)
   - [Running the Program](#running-the-program)
   - [Input Format](#input-format)
   - [Viewing History](#viewing-history)
   - [Exiting the Program](#exiting-the-program)
3. [Example Session](#example-session)
4. [Error Handling](#error-handling)
5. [Possible Improvements](#possible-improvements)
6. [License](#license)

---

## Features

- **Basic Arithmetic Operations**:
  - Addition (`+`)
  - Subtraction (`-`)
  - Multiplication (`*`)
  - Division (`/`)
  - Modulus (`%`)
  
- **Advanced Mathematical Functions**:
  - Power (`power`)
  - Square Root (`sqrt`)
  - Absolute Value (`abs`)
  - Round (`round`)

- **Calculation History**:
  - The program saves all performed operations in a history log.
  - Users can view the history by typing `history`.

- **Exit the Program**:
  - Users can exit the program by typing `exit`.

---

## How to Use

### Running the Program

1. Compile the program:
   ```bash
   Run the program:
java ConsoleCalculator
To perform operations, enter a command in the following format:   
<operator> <number1> <number2>
Example:+ 5 3\
For unary operations (e.g., square root), enter:<operator> <number>
Example:sqrt 16
To view the history of calculations, type history.
Example:Enter an operation (or 'history' to view past calculations, 'exit' to quit): history
Calculation History:Enter an operation (or 'history' to view past calculations, 'exit' to quit): history
Calculation History:
+ 5 3 = 8.0
sqrt 16 = 4.0
To exit the program, type exit.
Example:Enter an operation (or 'history' to view past calculations, 'exit' to quit): exit
Goodbye
Example SessionWelcome to Console Calculator!
Enter an operation (or 'history' to view past calculations, 'exit' to quit): + 5 3
Result: 8.0
Enter an operation (or 'history' to view past calculations, 'exit' to quit): sqrt 16
Result: 4.0
Enter an operation (or 'history' to view past calculations, 'exit' to quit): history
Calculation History:
+ 5 3 = 8.0
sqrt 16 = 4.0
Enter an operation (or 'history' to view past calculations, 'exit' to quit): exit
Goodbye!
Welcome to Console Calculator!
Enter an operation (or 'history' to view past calculations, 'exit' to quit): + 5 3
Result: 8.0
Enter an operation (or 'history' to view past calculations, 'exit' to quit): sqrt 16
Result: 4.0
Enter an operation (or 'history' to view past calculations, 'exit' to quit): history
Calculation History:
+ 5 3 = 8.0
sqrt 16 = 4.0
Enter an operation (or 'history' to view past calculations, 'exit' to quit): exit
Goodbye!
Division by Zero: If the user attempts to divide by zero, the program will display an error message.
Enter an operation (or 'history' to view past calculations, 'exit' to quit): / 5 0
Error: Cannot divide by zero.
Invalid Input Format: If the input is incorrect, the program will notify the user.
Enter an operation (or 'history' to view past calculations, 'exit' to quit): + 5
Error: Invalid input format.
Unknown Operation: If an unsupported operation is entered, the program will display an error message.
Enter an operation (or 'history' to view past calculations, 'exit' to quit): ^ 2 3
Error: Unknown operation.
