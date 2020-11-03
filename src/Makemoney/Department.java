package Makemoney;

public class Department{
    private String name;
    private Manager manager;
    private Employee[] employees;
    private double ratio;

    public Department(){

    }

    public static int BaseSalary = 5000000;

    public Department(String name,Manager manager, Employee[] employees) {
        this.name = name;
        this.manager = manager;
        this.employees = employees;
    }

    public long getSumSalary(){
        long sumSalary = 0 ;
        for(Employee e:employees){
            sumSalary += e.getSalary();
        }
        return sumSalary;
    };

    public int getSalary(){
        System.out.println("Tien luong cua nhan vien ");
        return (int)(BaseSalary*ratio + 1000000);
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
