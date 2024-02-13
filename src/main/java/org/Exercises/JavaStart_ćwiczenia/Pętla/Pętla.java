package org.Exercises.JavaStart_ćwiczenia.Pętla;

import java.util.Scanner;

public class Pętla {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę liczb do zsumowania: ");
        int numbers = scanner.nextInt();
        int sum = 0;


        for (int i = 0; i < numbers; i ++) {
            System.out.println("Podaj kolejną liczbę: ");
            sum = sum + scanner.nextInt();

        }
        System.out.println("Suma wszystkich liczb to: " +
                 sum);

    }
}
