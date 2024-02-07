package org.Exercises.w3resource_exercises;

import java.util.Scanner;

public class Check_if_the_number_is_even_or_not {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {

            System.out.println("Wprowadź liczbę: ");
            int n = input.nextInt();
            if (n % 2 == 0) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
    }
}
