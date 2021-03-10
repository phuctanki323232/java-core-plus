package lesson7.Activity.Class;

public class FulltimeEmployee extends Employee{

    final long MEAL_ALLOWANCE = 2_000_000;

    private int totalWokingDay;
    private long dailySalary;

    public long getMealAllowance() {
        return MEAL_ALLOWANCE;
    }

    public int getWorkingCount() {
        return totalWokingDay;
    }

    public long getSalaryRate(){
        return dailySalary;
    }

    public FulltimeEmployee(String name, int age, String identificationNumber, int totalWokingDay, long dailySalary) {
        super(name, age, identificationNumber);
        this.totalWokingDay = totalWokingDay;
        this.dailySalary = dailySalary;
    }

    public FulltimeEmployee(int totalWokingDay, long dailySalary) {
        this.totalWokingDay = totalWokingDay;
        this.dailySalary = dailySalary;
    }

    public FulltimeEmployee() {
    }

    public FulltimeEmployee(String name, int age, String identificationNumber) {
        super(name, age, identificationNumber);
    }
}
