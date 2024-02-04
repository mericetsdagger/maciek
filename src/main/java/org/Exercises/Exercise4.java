package org.Exercises;

public class Exercise4 {
    //Write a Java Program to convert Integer numbers and Binary numbers.

    static void decToBinary(int n) {
        int[] binary = new int[1000];

        int i = 0;
        while (n > 0){
            binary[i] = n % 2;
            n = n / 2;
            i++;
        }

        for (int j = i - 1; j >=0; j--)
            System.out.print(binary[j]);
    }

    public static void main(String[] args) {
        int n = 20;
        System.out.println("Decimal : " + n);
        System.out.print("Binary : ");
        decToBinary(n);

    }
}
