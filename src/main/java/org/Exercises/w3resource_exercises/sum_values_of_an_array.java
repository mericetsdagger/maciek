package org.Exercises.w3resource_exercises;

public class sum_values_of_an_array {
    // The main method where the program execution starts.
    public static void main(String[] args) {
        int[] myArray = {2, 25, 69, 50, 100, 11};

        int sum = 0;

        for(int i : myArray) {
            sum += i;

        }
        System.out.println("Suma to: " + sum);
    }
}

