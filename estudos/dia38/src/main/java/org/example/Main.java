package org.example;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<TaxPayer> list = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int N = sc.nextInt();

        for (int i=1; i<=N; i++) {
            System.out.println("Tax payer #" + i + " data:");
            System.out.print("Individual or company (i/c)? ");
            char ch = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.next();
            System.out.print("Anual income: ");
            double anualIncome = sc.nextDouble();

            if (ch == 'i') {
                System.out.print("Health expenditures: ");
                double health = sc.nextDouble();

                Individual indi = new Individual(name,anualIncome,health);
                list.add(indi);
                }
                else if (ch == 'c') {
                    System.out.print("Number of employees: ");
                    int number = sc.nextInt();

                    Company cpn = new Company(name,anualIncome,number);
                    list.add(cpn);
            }
        }
        System.out.println();
        System.out.println("TAXES PAID:");

        double sum = 0.0;
        for (TaxPayer tp : list) {
            double tax = tp.tax();
            System.out.println(tp.getName() + ": $ " + String.format("%.2f", tax));
            sum += tax;
        }
        System.out.println();
        System.out.println("TOTAL TAXES: $ " + String.format("%.2f", sum));


        sc.close();
    }
}