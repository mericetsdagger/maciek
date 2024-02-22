package org.Exercises.Geeksforgeeks.Powtórka;

import java.util.Arrays;

public class Sum_array_elements {

    static int factorial(int number) {
        int res = 1;
        for (int i = 1; i <=number; i++) {
            res*=i;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
}

