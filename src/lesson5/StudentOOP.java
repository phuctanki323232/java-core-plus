package lesson5;

// lấy hàm getter và setter: ALt + Insert

public class StudentOOP {
    private String name;
    private float gpa;
    private String address;
    private float math;
    private TeacherOOP teacherOOP;

    public StudentOOP(String name, float gpa, String address, float math) {
        this.name = name;
        this.gpa = gpa;
        this.address = address;
        this.math = math;
    }

    public StudentOOP(String name, float gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    public StudentOOP() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public float getMath() {
        return math;
    }

    public void setMath(float math) {
        this.math = math;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        if (gpa > 0){
            this.gpa = gpa;
        }
    }

    public boolean checkGpa() {
        if (gpa > 3.0) {
            return true;
        } else {
            return false;
        }
    }

    public String information(){
        return name + ": " +gpa;
    }
}
