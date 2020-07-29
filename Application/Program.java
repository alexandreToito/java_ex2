package Application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Entities.CNPJ;
import Entities.CPF;
import Entities.User;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        List<User> list = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();

        for(int i = 0; i < n; i++){

            System.out.println("Tax payer " + (i+1) + " data: ");
            System.out.print("Individual or company? (i/c) ");
            char type = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Annual income: ");
            double income = sc.nextDouble();

            if(type == 'i'){
                System.out.print("Health expenditures: ");
                double health = sc.nextDouble();
                list.add(new CPF(name, income, health));
                }
                else {
                System.out.print("Number of employees: ");
                int employees = sc.nextInt();
                list.add(new CNPJ(name, income, employees));
            }
        }

        System.out.println("Taxes paid: ");
        for(User user : list){
            System.out.println(user.getName() + ": $ " + String.format("%.2f", user.tax()));        }

        sc.close();
    }   
}