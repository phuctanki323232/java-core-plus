package lesson7.Activity.Class;

import lesson7.Activity.Interface.EmployeeInterface;

public class Employee implements EmployeeInterface {

    private String name;
    private int age;
    private String identificationNumber;

    //construct, get/set

    public Employee(String name, int age, String identificationNumber) {
        this.name = name;
        this.age = age;
        this.identificationNumber = identificationNumber;
    }

    public Employee() {
    }

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

    public String getIdentificationNumber() {
        return identificationNumber;
    }

    public void setIdentificationNumber(String identificationNumber) {
        this.identificationNumber = identificationNumber;
    }

    // so tien tro cap an trua
    @Override
    public long getMealAllowance() {
        return 0;
    }

    @Override
    public long getSalaryRate() {
        return 0;
    }

    @Override
    public int getWorkingCount() {
        return 0;
    }

    @Override
    public long calculateSalary() {
        return getWorkingCount() * getSalaryRate() + getMealAllowance();
    }

    public void printInfo(){
        System.out.println("\nName: " + name);
        System.out.println("Age: " + age);
        System.out.println("Id: " + identificationNumber);
    }
}
