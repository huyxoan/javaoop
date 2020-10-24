package Salary;

public class Company {
    private String name;
    private String Nameofmanager;
    private String Listofemployee;

    public Company(){

    }

    public Company(String nameofCompany, String nameofmanager, String listofemployee){
        this.name = nameofCompany;
        this.Nameofmanager = nameofmanager;
        this.Listofemployee = listofemployee;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameofmanager() {
        return Nameofmanager;
    }

    public void setNameofmanager(String nameofmanager) {
        this.Nameofmanager = nameofmanager;
    }

    public String getListofemployee() {
        return Listofemployee;
    }

    public void setListofemployee(String listofemployee) {
        this.Listofemployee = listofemployee;
    }
}
