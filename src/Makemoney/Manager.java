package Makemoney;

public class Manager extends Employee{
    @Override
    public int getSalary(){
        System.out.println("Tien luong cua giam doc ");
        return (int)(BaseSalary*getRatio()*2 + 10000000);
    }
}
