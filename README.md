# POE_St1048736_PROG5121 — Chat App (Part 1: Registration & Login)

## Description
This project is Part 1 of a Programming Portfolio of Evidence (PoE), which forms the foundation
of a chat application. This part implements user registration and login functionality, including
input validation, using Java.

## Features
- **Username validation** — must contain an underscore and be no more than five characters long.
- **Password complexity validation** — must be at least eight characters long and contain a
  capital letter, a number, and a special character.
- **Cell phone number validation** — must be in South African international format
  (e.g. `+27838968976`), validated using a regular expression.
- **User registration** — validates all fields and stores user details if successful.
- **User login** — verifies entered credentials against the registered user.
- **Login status messaging** — returns a personalised welcome message on success, or an
  error message on failure.

## Technologies Used
- Java
- Apache Maven
- JUnit 5 (for unit testing)
- Git & GitHub (for version control)

## Project Structure


## How to Run
1. Open the project in NetBeans (or any IDE with Maven support).
2. Run `POE_St1048736_PROG5121.java` to see example usage in the console.
3. Run `LoginTest.java` (Ctrl+F6 in NetBeans) to execute the full JUnit test suite.

## Testing
All six core methods are covered by JUnit tests, using test data provided in the assignment
brief. All tests currently pass.

## Regex Reference
The cell phone number validation regex pattern was informed by the Oracle Java Regex Tutorial:
https://docs.oracle.com/javase/tutorial/essential/regex/

## Author
Kganya — Student Number: St1048736
