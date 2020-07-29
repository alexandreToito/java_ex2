package Entities;

public class CPF extends User {

    private double healthCare;
    
    public CPF(){
        super();
    }

    public CPF(String name, double annualIncome, double healthCare){
        super(name, annualIncome);
        this.healthCare = healthCare;
    }

    public double getHealthcare(){
        return healthCare;
    }

    public void setHealthcare(double healthCare){
        this.healthCare = healthCare;
    }

    @Override
    public double tax() {
        if (getAnnualincome() < 2000){
            return getAnnualincome() * 0.15 - healthCare * 0.5;
        }
        else {
            return getAnnualincome() * 0.25 - healthCare * 0.5;
        }
    }
}