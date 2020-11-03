package Makemoney;

import javax.swing.text.DefaultEditorKit;

public class Company{
    private String name;
    private Manager manager;
    private Department[] departments;


   public Company(){

   }

   public long getallSumSalary(){
       long sumSalary = 0 ;
       for(Department d:departments){
           sumSalary += d.getSalary();
       }

       return sumSalary;
   }

   public Company(String name , Manager manager, Department[] departments){
             this.name = name;
             this.manager = manager;
             this.departments = departments;
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

    public Department[] getDepartments() {
        return departments;
    }

    public void setDepartments(Department[] departments) {
        this.departments = departments;
    }
}
