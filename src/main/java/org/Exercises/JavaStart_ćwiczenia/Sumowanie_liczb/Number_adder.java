package org.Exercises.JavaStart_ćwiczenia.Sumowanie_liczb;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Number_adder {
    public static void main(String[] args) {
        List<Double> numbers = readNumbersfromUser();
        printSum(numbers);
    }

    private static List<Double> readNumbersfromUser() {
        List<Double> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        double number = 0;
        do {
            System.out.println("Podaj liczbę(Liczba ujmena kończy program) : ");
            try {
                number = scanner.nextDouble();
                if (number >= 0) {
                    numbers.add(number);
                }
            }catch (InputMismatchException e) {
                System.out.println("Podana wartość nie jest liczbą");
                scanner.nextLine();
            }
            } while (number >= 0) ;
            return numbers;
        }
        private static void printSum (List < Double > numbers) {
            StringBuilder builder = new StringBuilder();
            double sum = 0;
            for (int i = 0; i < numbers.size(); i++) {
                builder.append(numbers.get(i));
                sum += numbers.get(i);

                if (i < (numbers.size() - 1)) {
                    builder.append(" + ");
                }
                builder.append(" = ");
                builder.append(sum);
                System.out.println(builder.toString());
            }
        }
    }
