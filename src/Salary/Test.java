package Salary;

public class Test {
    public static void main(String[] args) {

        Employee employee = new Employee();
        employee.setName("Le Hoang", " Ba");
        employee.setAge(20);
        employee.setEmail("abc123@gmail.com");
        employee.setAddress("123 Ho Bac");
        employee.setPhone("0946829922");
        employee.setRatio(2);
        employee.print();
        System.out.println("====================");



        Manager manager = new Manager();
        manager.setName("Le Thi" ,"A");
        manager.setAge(21);
        manager.setEmail("bcd123@gmail.com");
        manager.setAddress("223 Cam Le");
        manager.setPhone("09842227792");
        manager.print();
        System.out.println("====================");


        Director director = new Director();
        director.setName("Tran Le ", "Danh");
        director.setAge(49);
        director.setEmail("danh1234@gmail.com");
        director.setAddress("124 Le Duan");
        director.setPhone("09387592223");
        director.setRatio(1.2);
        director.print();
        System.out.println("====================");



        TrialEmployee trialEmployee = new TrialEmployee();
               trialEmployee.setName("Do Ba", "Hoang");
               trialEmployee.setAge(19);
               trialEmployee.setRatio(1.4);
               trialEmployee.setEmail("HoangBa123@gmail.com");
               trialEmployee.setAddress("235 Nguyen Van Linh");
               trialEmployee.setPhone("092820842774");
               trialEmployee.print();
        System.out.println("====================");


    }
}
