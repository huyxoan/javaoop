package Makemoney;

public class Director extends Employee{
    @Override
    public int getSalary(){
        System.out.println("Tien luong cua quan ly ");
        return (int)(getRatio()*BaseSalary + 4000000);
    }

}
