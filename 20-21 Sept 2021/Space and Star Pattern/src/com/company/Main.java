package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	            Scanner scanner = new Scanner(System.in);
                System.out.print("Enter the number of rows: ");
                int rows = scanner.nextInt();
          int i=0,j=0,k=0;
        for (i=0; i<rows; i++)
        {
//inner loop work for space
            for (j=2*(rows-i); j>=0; j--)
            {
//prints space between two stars
                System.out.print(" ");
            }
//inner loop for columns
            for (j=0; j<=i; j++ )
            {
//prints star
                System.out.print("* ");
            }
//throws the cursor in a new line after printing each line
            System.out.println();
        }
    }
}

