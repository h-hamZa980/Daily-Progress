package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the string you want to be reversed : ");
        char[] array = scanner.nextLine().toCharArray();



        System.out.print("The reversed string is : ");

        for (int i = array.length-1; i >= 0 ; i--) {
            System.out.print(array[i]);
        }
    }
}
