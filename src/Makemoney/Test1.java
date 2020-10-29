package Makemoney;




public class Test1 {

    public static void main(String[] args) {

        Employee e1 = new Employee();
        e1.setRatio(2);


        Manager m1 = new Manager();
        m1.setRatio(1.6);

        Department department = new Department();
        department.setEmployees(new Employee[]{e1, m1});
        System.out.println("Tong tien luong cua van phong la " + department.getSumSalary());


      TrialEmployee t2 = new TrialEmployee();
        t2.setRatio(1.4);

     Director d2 = new Director();
        d2.setRatio(1.2);

        Company company = new Company();
        company.setDepartments(new Department[]{e1,m1,t2,d2});
        System.out.println("Tong tien luong cua cong ty la " + company.getallSumSalary());
    }
}
