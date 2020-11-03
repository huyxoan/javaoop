package Salary;

public class TestCompanySalary {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.setRatio(1.2);


        Manager m1 = new Manager();
        m1.setRatio(1.4);


        Department department= new Department();
        department.setEmployees(new Employee[]{e1,m1});
        System.out.println("Tong luong van phong la " + department.getSumSalary());




        TrialEmployee t2 = new TrialEmployee();
        t2.setRatio(1.6);

        Director d2 = new Director();
        d2.setRatio(1.4);


        Company company = new Company();
        company.setDepartments(new Department[]{e1,d2,m1,t2});
        System.out.println("Tong luong trong cong ty la " + company.getallSumSalary());
    }
}
