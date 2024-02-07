package org.Exercises.w3resource_exercises;

import java.util.Scanner;

public class Program_to_sum_two_numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Wprowadź pierwszą liczbę: ");
        int num1 = scanner.nextInt();

        System.out.println("Wprowadź drugą liczbę: ");
        int num2 = scanner.nextInt();

        int sum = num1 + num2;

        System.out.println();
        System.out.println("Suma wynosi: " + sum);
    }
}
