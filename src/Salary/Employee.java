package Salary;

public class Employee {

    private String name;
    private int age;
    private String email;
    private String address;
    private String phone;
    private double ratio;

    public static int baseSalary = 5000000;

    public Employee(){

    }

    public Employee(String name, int age, String email, String address, String phone, int ratio) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.address = address;
        this.phone = phone;
        this.ratio = ratio;
    }

    public String getName() {
        return name;
    }

    public void setName(String firstName, String lastName) {
        this.name = firstName + " " + lastName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public double getRatio() {
        return ratio;
    }

    public void setRatio(double ratio) {
        this.ratio = ratio;
    }

    public int getSalary() {
        return (int) (baseSalary * ratio + 1000000);
    }

    public void print() {
        System.out.println("Ten toi la " + getName() + " " + getAge() + " tuoi");
        System.out.println("Dia chi email " + getEmail() + ". Dia chi nha " + getAddress() + ".So dien thoai " + getPhone());
        System.out.println("He so luong cua toi la " + getRatio());
        System.out.println("Luong cua toi la " + getSalary());
    }
}
