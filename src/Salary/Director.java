package Salary;

public class Director extends Employee {

    @Override
    public int getSalary() {
        return (int)(baseSalary * getRatio() + 4000000);
    }
}





