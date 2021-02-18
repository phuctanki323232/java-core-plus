package lesson5;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*String[] names = new String[5];
        float[] gpas = new float[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Nhap vao ten sinh vien:");
            String name = scanner.nextLine();
            names[i] = name;
            System.out.println("Nhap vao gpa: ");
            float gpa = scanner.nextFloat();
            gpas[i] = gpa;
        }

        float temp;
        String tempName = "";
        for (int i = 0; i < 5; i++) {
            for (int j = i + 1; j < 5; j++) {
                if (gpas[i] < gpas[j]) {
                    temp = gpas[i];
                    gpas[i] = gpas[j];
                    gpas[j] = temp;

                    tempName = names[i]; // đổi name theo gpa
                    names[i] = names[j];
                    names[j] = tempName;
                }
            }
        }*/

        /*StudentOOP[] students = new StudentOOP[5]; // khởi tạo class
        for (int i = 0; i < 5; i++) {

            students[i] = new StudentOOP();

            System.out.println("Nhap vao ten sinh vien:");
            String name = scanner.nextLine();
            students[i].name = name; //
            System.out.println("Nhap vao gpa: ");
            float gpa = scanner.nextFloat();
            students[i].gpa = gpa;
            System.out.println("Nhap vao dia chi: ");
            String add = scanner.nextLine();
            students[i].address = add;
        }

        StudentOOP temp = null;
        for (int i = 0; i < 5; i++) {
            for (int j = i + 1; j < 5; j++) {
                if (students[i].getGpa() < students[j].getGpa()){
                    temp = students[i];
                    students[i] = students[j];
                    students[j] = temp;
                }
            }
        }

        if (students[0].checkGpa() == true) {
            System.out.println("Sinh vien 1 loai gioi");
        }*/

        /*StudentOOP[] students = new StudentOOP[5];
        StudentOOP student1 = students[0];
        student1 = new StudentOOP();
        student1.setName("");

        StudentOOP studentOOP = new StudentOOP();

        studentOOP.setName("phuc");
        studentOOP.setGpa(4.0f);
        studentOOP.setAddress("Nghe an");
        studentOOP.setMath(8.0f);

        StudentOOP student2 = new StudentOOP("Hoang", 3.0f, "ha noi", 7.0f);

        System.out.println(student2.checkGpa());

        if (studentOOP.checkGpa() == true) {
            System.out.println("Hoc sinh loai gioi");
        } else {
            System.out.println("Hoc sinh kha");
        }

        Car car = new Car();
        car.setClose(false);
    }

    public void print() {
        System.out.println("this is test class");
    }*/

        System.out.print("Nhap vao so luong sinh vien: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        StudentOOP[] students = new StudentOOP[n];

        for (int i = 0; i < n; i++) {

            System.out.print("Nhap vao ten sinh vien thu " + (i + 1) + ": ");
            String name = scanner.nextLine();
            System.out.print("Nhap vao GPA sinh vien thu " + (i + 1)+ ": ");
            float gpa = scanner.nextFloat();
            scanner.nextLine();

            students[i] = new StudentOOP(name, gpa);
        }

        System.out.println("Before:");
        for (StudentOOP st : students) {
            System.out.println(st.information());
        }

        StudentOOP temp = students[0];
        for(int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++){
                if (students[i].getGpa() < students[j].getGpa()) {
                    temp = students[i];
                    students[i] = students[j];
                    students[j] = temp;
                }
            }
        }

        System.out.println("After:");
        for (StudentOOP st : students){
            System.out.println(st.information());
        }
    }
}
