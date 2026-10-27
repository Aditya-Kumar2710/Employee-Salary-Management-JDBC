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
Employee records added successfully:
767 - Aditya
768 - Harshil
764 - Prakahr
805 - Ayman

Employees with Gross Salary Above 50000:

Employee ID: 764
Name: Prakahr
Basic Salary: 300000.0
Allowances: 20000.0
Gross Salary: 320000.0
Deductions: 30000.0
Net Salary: 290000.0

Employee ID: 767
Name: Aditya
Basic Salary: 500000.0
Allowances: 60000.0
Gross Salary: 560000.0
Deductions: 50000.0
Net Salary: 510000.0

Employee ID: 768
Name: Harshil
Basic Salary: 700000.0
Allowances: 80000.0
Gross Salary: 780000.0
Deductions: 70000.0
Net Salary: 710000.0

Employee ID: 805
Name: Ayman
Basic Salary: 200000.0
Allowances: 60000.0
Gross Salary: 260000.0
Deductions: 20000.0
Net Salary: 240000.0

Salary updated successfully.
