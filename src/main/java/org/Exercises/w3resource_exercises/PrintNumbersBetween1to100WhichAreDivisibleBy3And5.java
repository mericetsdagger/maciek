package org.Exercises.w3resource_exercises;

public class PrintNumbersBetween1to100WhichAreDivisibleBy3And5 {
    public static void main(String[] args) {
        System.out.println("Podzielne przez 3: ");
        for (int i = 1; i < 100; i++) {
            if (i % 3 == 0) {
                System.out.print(i + ", ");
            }
        }
        System.out.println("\nPodzielne przez 5: ");
        for (int i = 1; i < 100; i++) {
            if (i % 5 == 0) {
                System.out.print(i + ", ");
            }
        }

        System.out.println("\nPodzielne przez 3 oraz 5: ");
        for (int i = 1; i < 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print(i + ", ");
            }
            }
        }
    }
