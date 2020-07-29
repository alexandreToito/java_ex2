package Entities;

public abstract class User{

    private String name;
    private double annualIncome;

    public User(){
    }

    public User(String name, double annualIncome){
        this.name = name;
        this.annualIncome = annualIncome;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public double getAnnualincome(){
        return annualIncome;
    }

    public void setAnnualincome(double annualIncome){
        this.annualIncome = annualIncome;
    }

    public abstract double tax();
}   