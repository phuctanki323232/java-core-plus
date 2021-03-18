package lesson8.Example;

import java.util.HashSet;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        Set<Student> sets = new HashSet<>();
        Student A = new Student("A");
        Student B = new Student("B");
        Student C = new Student("C");

        sets.add(A);
        sets.add(B);
        sets.add(B); // ignore
        sets.add(C);

        System.out.println("Set size: " + sets.size());

        for (Student item : sets) {
            System.out.println(item.toString());
        }
    }
}

class Student{
    private String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }
}

// đọc thêm các method trong slide
