//RA2511003010767
//Aditya Kumar
# Employee Salary Management System using JDBC

1. **Language:** Java
2. **Database:** MySQL
3. **Connectivity:** JDBC using MySQL Connector/J.
4. **Database:** `employee_db`, table: `employees`.
5. **`DriverManager.getConnection()`** establishes the database connection.
6. **`PreparedStatement`** executes parameterized INSERT and UPDATE queries.
7. **`setInt()`, `setString()`, `setDouble()`** pass values to SQL placeholders.
8. **`executeUpdate()`** inserts employee records and updates salaries.
9. **`executeQuery()`** executes SELECT queries.
10. **`ResultSet`** and `rs.next()` retrieve employee records.
11. Gross Salary = Basic Salary + Allowances.
12. Deductions = 10% of Basic Salary; Net Salary = Gross Salary − Deductions.
13. **Execution:** Configure database credentials, create the table using `database.sql`, place Connector/J in `lib`, and run `run.bat`.

## Output Obtained

Employee records added successfully:<br>
767 - Aditya<br>
768 - Harshil<br>
764 - Prakahr<br>
805 - Ayman<br>

**Employees with Gross Salary Above 50000**<br><br>

Employee ID: 764<br>
Name: Prakahr<br>
Basic Salary: 300000.0<br>
Allowances: 20000.0<br>
Gross Salary: 320000.0<br>
Deductions: 30000.0<br>
Net Salary: 290000.0<br><br>

Employee ID: 767<br>
Name: Aditya<br>
Basic Salary: 500000.0<br>
Allowances: 60000.0<br>
Gross Salary: 560000.0<br>
Deductions: 50000.0<br>
Net Salary: 510000.0<br><br>

Employee ID: 768<br>
Name: Harshil<br>
Basic Salary: 700000.0<br>
Allowances: 80000.0<br>
Gross Salary: 780000.0<br>
Deductions: 70000.0<br>
Net Salary: 710000.0<br><br>

Employee ID: 805<br>
Name: Ayman<br>
Basic Salary: 200000.0<br>
Allowances: 60000.0<br>
Gross Salary: 260000.0<br>
Deductions: 20000.0<br>
Net Salary: 240000.0<br><br>



Salary updated successfully.
