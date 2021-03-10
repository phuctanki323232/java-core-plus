package lesson7.Example.Abstract;

import lesson5.Example.User;

public abstract class AbstractClassEx {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public AbstractClassEx(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public AbstractClassEx() {
    }

    public void print(String name) {
        System.out.println("This is abstract class");
        System.out.println("Hello " + name);
    }

    // Tinh nang dang ky
    public abstract void printInfo(String name); // không có body

    public abstract void verifyRequest(String name);

    public abstract User findUserByName(String name);

    public abstract int saveUserIntoDB(User user);
}
