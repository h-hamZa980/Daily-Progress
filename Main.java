package com.company;
public class Main{
    public static void main(String[] args)
    {
        int i, j, k, m, a = 1,b = 0;
        for(i = 5;i > 0;i--)
        {
            for(j = i;j > 0;j--)
            {
                System.out.print("*");
            }
            for(k = 1;k < a;k++)
            {
                System.out.print("O");
            }
            a = a + 2;
            for(m = i;m > 0;m--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for(i = 1;i <= 4;i++)
        {
            for(j = 0;j <= i;j++)
            {
                System.out.print("*");
            }
            for(k = 6;k > b;k--)
            {
                System.out.print("O");
            }
            b = b + 2;
            for(m = 0;m <= i;m++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
