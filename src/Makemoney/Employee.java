package Makemoney;

public class Employee extends Department {
    private String name;
    private int dateOfBirth;
    private String email;
    private String address;
    private String phone;
    private double ratio;

    public Employee(){

    }

    public static int BaseSalary = 5000000;

    public String getName(){
        return name;
    }
    public void setName(String firstname, String lastname){
        this.name =  firstname + " " + lastname ;
    }

    public int getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(int dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
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

    public int getSalary(){
        System.out.println("Tien luong cua nhan vien ");
        return (int)(BaseSalary*ratio + 1000000);
    }

    public void print(){
        System.out.println("Ten toi la " + getName() + ".Ngay sinh cua toi la " + getDateOfBirth() + ". Dia chi nha cua toi " + getAddress());
        System.out.println("So dien thoai cua toi la " + getPhone());
        System.out.println("He so luong cua toi la " + getRatio());
        System.out.println("Luong cua toi la " + getSalary());
    }
}
