package lesson7.Activity.Class;

import java.util.Scanner;

public class AppTest {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Number of Employee: ");
        int numberOfEmployee = scanner.nextInt();

        EmployeeManagement employee = new EmployeeManagement(numberOfEmployee);

        System.out.println("\nInput information:");
        employee.nhapThongTin();

        System.out.println("\nInformation of Employees:\n");
        employee.showInfoAndSalary();

        System.out.print("\nThe highest Salary Employee:");
        employee.highestSalaryEmployee();

        System.out.print("\nThe lowest Salary Employee:");
        employee.lowestSalaryEmployee();
    }
}
