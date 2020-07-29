package Entities;

public class CNPJ extends User {

    private int employees;

    public CNPJ(){
        super();
    }

    public CNPJ(String name, double annualIncome, int employees){
        super(name, annualIncome);
        this.employees = employees;
    }

    public int getEmployees(){
        return employees;
    }

    public void setEmployees(int employees){
        this.employees = employees;
    }

    @Override
    public double tax() {
        if (employees > 10){
            return getAnnualincome() * 0.14;
        }
        else {
            return getAnnualincome() * 0.16;
        }
    }
}