package lesson8.Example;

import java.util.*;

public class ComparatorExample {
    public static void main(String[] args) {
        List<Student2> list = new ArrayList<>();
        list.add(new Student2("Phuc", 20, 3.5f));
        list.add(new Student2("Hoang", 19, 2.8f));
        list.add(new Student2("Vy", 30, 3.0f));
        list.add(new Student2("Quang", 17, 2.7f));

        for (Student2 st : list) {
            System.out.println(st.toString());
        }

        /*Collections.sort(list);
        Collections.reverse(list);*/

        Collections.sort(list, new Comparator<Student2>() {
            @Override
            public int compare(Student2 o1, Student2 o2) {
                //return o1.getAge().compareTo(o2.getAge());
                return o2.getAge().compareTo(o1.getAge());
            }
        });

        System.out.println("After");
        for (Student2 st : list) {
            System.out.println(st.toString());
        }
    }
}

//class Student2 implements Comparable<Student2>{
class Student2 {

    private String name;
    private Integer age;
    private Float gpa;

    public Student2(String name, Integer age, Float gpa) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }

    public Student2() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Float getGpa() {
        return gpa;
    }

    public void setGpa(Float gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Student2{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gpa=" + gpa +
                '}';
    }

   /* @Override
    public int compareTo(Student2 o) {
        return o.gpa.compareTo(this.gpa);
    }*/
}
