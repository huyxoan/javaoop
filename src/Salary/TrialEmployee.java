package Salary;

public class TrialEmployee extends Employee {
    @Override
    public int getSalary() {
        return (int) (baseSalary * getRatio() * (0.8));
    }
}

