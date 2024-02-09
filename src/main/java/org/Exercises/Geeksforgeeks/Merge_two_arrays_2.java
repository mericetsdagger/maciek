package org.Exercises.Geeksforgeeks;

import java.util.Arrays;

public class Merge_two_arrays_2 {
    public static void main(String[] args) {


        //Java Program to Merge Two Arrays Metoda 2

        int[] a = {10, 30, 50, 100};
        int[] b = {50, 60, 70, 110};

        int a1 = a.length;
        int b1 = b.length;
        int c1 = a1 + b1;

        int[] c = new int[c1];
        System.arraycopy(a,0,c,0,a1);
        System.arraycopy(b,0,c,a1,b1);
        System.out.println(Arrays.toString(c));
    }
}
