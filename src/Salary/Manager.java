package Salary;

public class Manager extends Employee {

    @Override
    public int getSalary() {
        return (int)(baseSalary* getRatio() * 2 + 10000000);
    }
}


