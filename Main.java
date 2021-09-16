package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows : ");

        int rows = scanner.nextInt();

//      outermost loop
        for (int i = rows-1; i >=0 ; i--) {

            for (int j = rows; j > i ; j--) {
                System.out.print("O");
            }

            for (int k = 1; k <= i ; k++) {
                System.out.print("*");
            }
            System.out.println();
        } //  end of outermost loop

    }

}
