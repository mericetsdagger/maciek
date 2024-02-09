package org.Exercises.Geeksforgeeks;

public class Swap_two_numbers {
    //Write a Program to Swap Two Numbers
static void swapNumbers(int a, int b) {
int num = a;
a = b;
b = num;
    System.out.println("Wartość A to: " + a +  " Wartość B to: " + b);}

    public static void main(String[] args) {
        int a = 10;
        int b = 15;

        swapNumbers(a, b);
    }
}



