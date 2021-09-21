package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        long userInput = 0;
        long sumOfDigits = 0;


        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the integer whose sum of digits you want to calculate : ");
        userInput = scanner.nextLong();

        while(userInput!=0){

            sumOfDigits += (userInput % 10);
            userInput/=10;

        }
        System.out.print("The sum of the digits of the integer you entered is "+sumOfDigits);
    }
}
