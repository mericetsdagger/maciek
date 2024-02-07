package org.Exercises.w3resource_exercises;

import java.util.Scanner;

public class Print_multiplication_table_of_a_number_up_to_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Wpisz liczbę: ");
        int num1 = input.nextInt();

        for(int i = 1; i <= 10; i++) {
            System.out.println(num1 + " x " + i + " = " + (num1 * i));        }
    }

}
