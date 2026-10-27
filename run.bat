
@echo off
cd /d "%~dp0"

javac -cp ".;lib\*" EmployeeSalary.java

if errorlevel 1 (
    echo Compilation failed.
    pause
    exit /b 1
)

java -cp ".;lib\*" EmployeeSalary
pause
