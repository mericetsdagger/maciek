package org.Exercises.JavaStart_ćwiczenia;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a, b, result;
        char operator;
        result = 0;

        System.out.println("Podaj pierwszą liczbę: ");
        a = scanner.nextDouble();

        System.out.println("Podaj operator (+, -, *, /) : ");
        operator = scanner.next().charAt(0);

        System.out.println("Podaj drugą liczbę: ");
        b = scanner.nextDouble();


        switch (operator) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                if (b != 0) {
                    result = a / b;
                }else {
                    System.out.println("Dzielenie przez 0 jest niemożliwe!");
                }
                break;
            default:
                System.out.println("Nie wybrano operatora");
                return;
        }
        System.out.println("Wynik to: " + result);
    }
}
