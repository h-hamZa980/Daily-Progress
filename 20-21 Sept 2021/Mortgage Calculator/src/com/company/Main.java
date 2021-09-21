package com.company;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        NumberFormat currency = NumberFormat.getCurrencyInstance();

        //Declaring variables
        long Principal = 0L;
        double interestRate = 0.0;
        int period = 0;

        // Getting input from the user

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the amount of Principal: ");
        Principal = scanner.nextLong() ;

        System.out.print("Enter the Annual Interest Rate: ");
        interestRate = scanner.nextDouble();

        System.out.print("Enter the duration for which you want the loan in years. Period :  ");
        period = scanner.nextInt() ;

        double annualInterestRate = interestRate/(double) 100;
        double monthlyInterestRate = (double)(annualInterestRate)/(double)(12) ;
        int n = period*12;

        // Mortgage formula

        double mortgage = Principal*((double)(monthlyInterestRate*Math.pow(1+monthlyInterestRate,n))/(double)((Math.pow(1+monthlyInterestRate,n))-1));
        String result = currency.format(mortgage) ;
        System.out.print("The Mortgage is :  "+ result);

    }
}
