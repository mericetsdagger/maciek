package org.Exercises.w3resource_exercises;

import java.util.Scanner;

public class ConvertStringIntoInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wpisz liczbę w postaci Stringa: ");
        String str1 = scanner.nextLine();

        int result = Integer.parseInt(str1);

        System.out.println("Wartość to: " + result);
    }
}
