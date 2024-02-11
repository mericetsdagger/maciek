package org.Exercises.w3resource_exercises;

import java.util.Scanner;

public class Random_integers_in_specific_ranges {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadź początkową liczbę: ");
        int snum = scanner.nextInt();
        System.out.println("Wprowadź końcową liczbę: ");
        int rnum = scanner.nextInt();
        int randomNumber = snum + (int)(Math.random() * ((rnum - snum) +1));
        System.out.println(randomNumber);

    }
}
