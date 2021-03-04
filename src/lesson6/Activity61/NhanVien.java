package lesson6.Activity61;

public class NhanVien {
    String name;
    int age;
    String sex;

    public NhanVien(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public NhanVien() {
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }

    public void printInformation() {
        System.out.println("Name: " +  name);
        System.out.println("Age: " + age);
        System.out.println("Sex: " + sex);
    }

    public int tinhLuong() {
        return 1600000;
    }
}
