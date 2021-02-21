    /*Viết lớp Student gồm có:
        - Các thuộc tính:
        + name
        + gpa
        - Các phương thức"
        + Khởi tạo, getters/setters.
        + Kiểm tra đỗ/trượt (gpa >=1.5 thì đỗ, ngược lại thì trượt).
        + In ra thông tin name, gpa.*/

package lesson5;

public class Student {
    private String name;
    private float gpa;

    // khởi tạo
    public Student(String name, float gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    public Student() {
    }

    // getter, setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    // Kiểm tra đỗ/trượt (gpa >=1.5 thì đỗ, ngược lại thì trượt).
    public boolean checkPass() {
        if (gpa >= 1.5) {
            return true;
        } else {
            return false;
        }
    }

    // In ra thông tin name, gpa
    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Gpa: " + gpa);
    }
}
