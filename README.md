# Task25-Create-a-Log-File-Analyzer
java calculation

## Project Description
The Log File Analyzer is a Java-based application that reads an application log file and generates statistics for different log levels such as INFO, WARNING, and ERROR.

It helps users understand application activities, identify errors, and generate a summary report.

## Objectives
- Practice Java File Handling.
- Understand String Parsing.
- Use HashMap and ArrayList.
- Count different log levels.
- Generate an error summary and report.

## Technologies Used
- Java
- File I/O
- BufferedReader
- HashMap
- ArrayList
- PrintWriter

## Project Structure

```text
Task25/
│
├── Task25.java
├── application.log
├── log_report.txt
└── README.md
```

## Features
1. Reads an application log file line by line.
2. Identifies INFO messages.
3. Counts WARNING messages.
4. Counts ERROR messages.
5. Stores and displays error messages.
6. Handles malformed log lines.
7. Generates a report automatically in a text file.

## How to Run the Program

### Step 1: Compile the Java Program

```bash
javac Task25.java
```

### Step 2: Run the Program

```bash
java Task25
```

**Note:** Keep `application.log` in the same working directory as the Java program.

## Sample Input

```text
2026-11-13 09:00:00 INFO Application started
2026-11-13 09:05:00 INFO User logged in
2026-11-13 09:10:00 WARNING Low memory
2026-11-13 09:15:00 ERROR Database connection failed
2026-11-13 09:20:00 INFO File uploaded
2026-11-13 09:25:00 ERROR File not found
2026-11-13 09:30:00 WARNING High CPU usage
2026-11-13 09:35:00 INFO Application running
Invalid log entry
```

## Expected Output

```text
===== LOG ANALYSIS REPORT =====

Total Lines: 9
INFO Messages: 4
WARNING Messages: 2
ERROR Messages: 2
Malformed Lines: 1

===== ERROR SUMMARY =====

2026-11-13 09:15:00 ERROR Database connection failed
2026-11-13 09:25:00 ERROR File not found

Report generated successfully!
```

## Generated Report
The program automatically creates a file named `log_report.txt`.

The report contains:
- Total log lines.
- INFO message count.
- WARNING message count.
- ERROR message count.
- Malformed line count.
- Error message summary.

## Concepts Learned
- Java File Handling
- Reading and Writing Files
- HashMap Collections
- ArrayList Collections
- String Processing
- Exception Handling
- Report Generation
