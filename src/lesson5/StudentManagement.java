/*Viết lớp StudentManagement gồm có:
        - Các thuộc tính:
        + Tổng số sinh viên n.
        + Danh sách sinh viên (Student[] students).
        - Các phương thức:
        + Nhập vào thông tin từng sinh viên khi khởi tạo lớp.
        + Đếm tổng số sinh viên đỗ.
        + Đếm tổng số sinh viên trượt.
        + Tìm sinh viên có điểm gpa cao nhất.
        + Tìm sinh viên có điểm gpa thấp nhất.*/

package lesson5;

import java.util.Scanner;

public class StudentManagement {
    private int numOfStudent; // so Sinh vien
    private Student[] students;

    // khởi tạo


    public StudentManagement(Student[] students) {
        this.students = students;
        numOfStudent = students.length;
    }

    // Đếm tổng số sinh viên đỗ.
    public int soSvPass() {
        int count = 0;
        for (Student student : students) {
            if(student.checkPass()){
                count++;
            }
        }
        return count;
    }

    // Đếm tổng số sinh viên trượt.
    public int soSvNotPass(){
        int count = 0;
        for (Student student : students) {
            if (!student.checkPass()) {
                count++;
            }
        }
        return count;
    }

    // Tìm sinh viên có điểm gpa cao nhất.
    public Student SvGpaMax(){
        float max = students[0].getGpa();
        Student result = students[0];
        for (Student student : students) {
            if (student.getGpa() > max){
                result = student;
                max = student.getGpa();
            }
        }
        return result;
    }

    // Tìm sinh viên có điểm gpa thấp nhất.
    public Student SvGpaMin() {
        float min = students[0].getGpa();
        Student result = students[0];
        for (Student student : students) {
            if (student.getGpa() < min) {
                result = student;
                min = student.getGpa();
            }
        }
        return result;
    }
}
