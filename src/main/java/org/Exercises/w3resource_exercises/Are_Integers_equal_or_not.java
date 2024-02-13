package org.Exercises.w3resource_exercises;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Are_Integers_equal_or_not {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
try {
    System.out.println("Podaj pierwszą liczbę: ");
    int first = scanner.nextInt();

    System.out.println("Podaj drugą liczbę: ");
    int second = scanner.nextInt();

    System.out.println("Podaj trzecią liczbę: ");
    int third = scanner.nextInt();

    System.out.println("Podaj czwartę liczbę: ");
    int forth = scanner.nextInt();

    if (first == second && second == third && third == forth) {
        System.out.println("Liczby są takie same");
    } else {
        System.out.println("Liczby są różne");
    }
}catch (InputMismatchException e) {
    System.out.println("Nieprawidłowy znak");
}
    }
}
