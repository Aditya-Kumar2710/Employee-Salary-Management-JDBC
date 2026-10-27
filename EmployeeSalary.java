
import java.sql.*;
import java.util.Scanner;

public class EmployeeSalary {

    static final String URL =
        "jdbc:mysql://localhost:3306/employee_db";
    static final String USER = "root";
    static final String PASSWORD = "APP";

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            Connection con =
                DriverManager.getConnection(URL, USER, PASSWORD);

            int choice;

            do {
                System.out.println("\n1. Add Employee");
                System.out.println("2. Update Salary");
                System.out.println("3. Display Employees with Gross Salary Above 50000");
                System.out.println("4. Exit");
                System.out.print("Enter choice: ");
                choice = sc.nextInt();

                if (choice == 1) {
                    System.out.print("Enter Employee ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Employee Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Basic Salary: ");
                    double basic = sc.nextDouble();

                    System.out.print("Enter Allowances: ");
                    double allowance = sc.nextDouble();

                    String sql =
                        "INSERT INTO employees VALUES (?, ?, ?, ?)";

                    PreparedStatement ps = con.prepareStatement(sql);
                    ps.setInt(1, id);
                    ps.setString(2, name);
                    ps.setDouble(3, basic);
                    ps.setDouble(4, allowance);

                    ps.executeUpdate();
                    System.out.println("Employee added successfully.");
                    ps.close();
                }

                else if (choice == 2) {
                    System.out.print("Enter Employee ID: ");
                    int id = sc.nextInt();

                    System.out.print("Enter new Basic Salary: ");
                    double basic = sc.nextDouble();

                    System.out.print("Enter new Allowances: ");
                    double allowance = sc.nextDouble();

                    String sql =
                        "UPDATE employees SET basic_salary = ?, allowances = ? WHERE emp_id = ?";

                    PreparedStatement ps = con.prepareStatement(sql);
                    ps.setDouble(1, basic);
                    ps.setDouble(2, allowance);
                    ps.setInt(3, id);

                    int rows = ps.executeUpdate();

                    if (rows > 0)
                        System.out.println("Salary updated successfully.");
                    else
                        System.out.println("Employee not found.");

                    ps.close();
                }

                else if (choice == 3) {
                    String sql = "SELECT *, (basic_salary + allowances) AS gross_salary, (basic_salary * 0.10) AS deductions FROM employees WHERE (basic_salary + allowances) > 50000";

                    Statement st = con.createStatement();
                    ResultSet rs = st.executeQuery(sql);

                    while (rs.next()) {
                        double gross = rs.getDouble("gross_salary");
                        double deduction = rs.getDouble("deductions");
                        double net = gross - deduction;

                        System.out.println("\nEmployee ID: " +
                            rs.getInt("emp_id"));
                        System.out.println("Name: " +
                            rs.getString("emp_name"));
                        System.out.println("Basic Salary: " +
                            rs.getDouble("basic_salary"));
                        System.out.println("Allowances: " +
                            rs.getDouble("allowances"));
                        System.out.println("Gross Salary: " + gross);
                        System.out.println("Deductions: " + deduction);
                        System.out.println("Net Salary: " + net);
                    }

                    rs.close();
                    st.close();
                }

            } while (choice != 4);

            con.close();
            sc.close();
        }
        catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
