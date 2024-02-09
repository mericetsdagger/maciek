package org.Exercises.Geeksforgeeks;

public class Merge_two_arrays {
    ////Java Program to Merge Two Arrays Metoda 1
    public static void main(String[] args) {

        int a[] = {10, 25, 30};
        int b[] = {45, 60, 70, 90};

        int a1 = a.length;
        int b1 = b.length;

        int c1 = a1 + b1;


        int[] c = new int[c1];
        for (int i = 0; i < a1; i = i + 1) {
            c[i] = a[i];
        }
        for (int i = 0; i < b1; i = i + 1) {
            c[a1 + i] = b[i];
        }

        for (int i = 0; i < c1; i = i + 1) {
            System.out.println(c[i]);
        }
    }
}
