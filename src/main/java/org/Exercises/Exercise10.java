package org.Exercises;

public class Exercise10 {
    //    Write a Program to Print Pyramid Number Pattern in Java.
    public static void main(String[] args) {
        int num = 5;
        int x = 0;

        for (int i = 1; i <= num; i++) {
            x = i - 1;

            for (int j = i; j <= num - 1; j++) {

                System.out.print(" ");

                System.out.print("  ");
            }
            for (int j = 0; j <= x; j++)
                if ((i + j) < 10) {
                    System.out.print((i + j) + "  ");
                } else {
                    System.out.print((i + j) + " ");
                }
            for (int j = 1; j <= x; j++)
                if ((i + x - j) < 10) {
                    System.out.print((i + x - j) + "  ");
                } else {
                    System.out.print((i + x - j) + " ");
                }
            System.out.println();
        }
    }
}





