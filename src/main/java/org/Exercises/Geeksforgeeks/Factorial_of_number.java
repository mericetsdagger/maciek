package org.Exercises.Geeksforgeeks;

public class Factorial_of_number {
    //Java Program for factorial of a number
    public static void main(String[] args) {


        int number = 6;
        int factorial = 1;

        for (int i = 1; i <= number; i++) {
            factorial *= i;

        }
        System.out.println(factorial);

    }
}
