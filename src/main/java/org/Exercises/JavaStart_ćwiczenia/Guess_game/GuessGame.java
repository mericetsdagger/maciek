package org.Exercises.JavaStart_ćwiczenia.Guess_game;

import java.util.Scanner;

public class GuessGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int number = 500;
        int userInput = scanner.nextInt();

        System.out.println("Zgadnij liczbę: ");

        while (userInput != number) {
            if(userInput > number) {
                System.out.println("Podana liczba jest za duża");
                userInput = scanner.nextInt();
            }else {
                System.out.println("Podana liczba jest za mała");
                userInput = scanner.nextInt();
            }
        }
        System.out.println("Brawo, zgadłeś!");
        scanner.close();
    }
}
