package Salary;

public class Company {
    private String name;
    private Manager manager;
    private Employee[] employees;

    public Company(){
        
    }

    public Company(String name, Manager manager, Employee[] employees) {
        this.name = name;
        this.manager = manager;
        this.employees = employees;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    public Employee[] getEmployees() {
        return employees;
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }
}
