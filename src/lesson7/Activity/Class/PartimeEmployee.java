package lesson7.Activity.Class;

public class PartimeEmployee extends Employee{
    final long MEAL_ALLOWANCE = 0;

    private int totalWorkingShift;
    private long baseSalary;    // luong theo ca

    public long getMealAllowance() {
        return MEAL_ALLOWANCE;
    }

    public int getWorkingCount() {
        return totalWorkingShift;
    }

    public long getSalaryRate(){
        return baseSalary;
    }

    public PartimeEmployee(String name, int age, String identificationNumber, int totalWorkingShift, long baseSalary) {
        super(name, age, identificationNumber);
        this.totalWorkingShift = totalWorkingShift;
        this.baseSalary = baseSalary;
    }

    public PartimeEmployee(int totalWorkingShift, long baseSalary) {
        this.totalWorkingShift = totalWorkingShift;
        this.baseSalary = baseSalary;
    }

    public PartimeEmployee() {
    }

    public PartimeEmployee(String name, int age, String identificationNumber) {
        super(name, age, identificationNumber);
    }
}
