package Makemoney;

public class TrialEmployee extends Employee {
    @Override
    public int getSalary(){
        System.out.println("Tien luong cua nhan vien thu viec ");
        return (int)(BaseSalary*getRatio()*0.8);
    }
}
