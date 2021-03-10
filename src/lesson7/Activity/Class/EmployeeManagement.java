package lesson7.Activity.Class;

import java.util.Scanner;

public class EmployeeManagement {
    private int soNhanVien;
    Employee[] employees;

    public EmployeeManagement(int soNhanVien) {
        this.soNhanVien = soNhanVien;
    }

    public void nhapThongTin() {

        Scanner scanner = new Scanner(System.in);

        employees = new Employee[soNhanVien];

        for (int i = 0; i < soNhanVien; i++) {
            System.out.println("\nNhan vien thu " + (i + 1));

            System.out.print("Nhap ten: ");
            String name = scanner.nextLine();

            System.out.print("Nhap tuoi: ");
            int age = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Nhap idNumber: ");
            String idNumber = scanner.nextLine();

            System.out.print("Nhap loai nv FULL/PART: ");
            String type = scanner.nextLine();

            if (type.equals("FULL")) {
                System.out.print("Nhap so ngay lam viec: ");
                int workingDays = scanner.nextInt();

                System.out.print("Nhap luong hang ngay: ");
                long daily_Salary = scanner.nextLong();
                scanner.nextLine();

                employees[i] = new FulltimeEmployee(name, age, idNumber, workingDays, daily_Salary);
            }
            if (type.equals("PART")) {

                System.out.print("Nhap so ca lam: ");
                int workingShift = scanner.nextInt();

                System.out.print("Nhap luong moi ca: ");
                long base_Salary = scanner.nextLong();
                scanner.nextLine();

                employees[i] = new PartimeEmployee(name, age, idNumber, workingShift, base_Salary);
            }
        }
    }

    public void showInfoAndSalary(){
        for (Employee employee : employees) {
            employee.printInfo();
            System.out.println("Salary: " + employee.calculateSalary());
        }
    }

    public void highestSalaryEmployee() {
        // luong cao nhat
        long maxSalary = employees[0].calculateSalary();
        int sttMax = 0;
        for (int i = 0; i < soNhanVien; i++) {
            if (maxSalary < employees[i].calculateSalary()) {
                maxSalary = employees[i].calculateSalary();
                sttMax = i;
            }
        }

        employees[sttMax].printInfo();
    }

    public void lowestSalaryEmployee(){
        // luong thap nhat
        long minSalary = employees[0].calculateSalary();
        int sttMin = 0;
        for (int i = 0; i < soNhanVien; i++){
            if (minSalary > employees[i].calculateSalary()){
                minSalary = employees[i].calculateSalary();
                sttMin = i;
            }
        }

        employees[sttMin].printInfo();
    }
}
