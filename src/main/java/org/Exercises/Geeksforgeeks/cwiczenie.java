package org.Exercises.Geeksforgeeks;

import java.util.Arrays;

public class cwiczenie {
    public static void main(String[] args) {
        int[] array1 = {1,2,3};
        int[] array2 = {4,5,6};

        int newArray = array1.length + array2.length;


        int[]  newArrayLength =  new int[newArray];

        for (int i = 0; i < array1.length; i++) {
            newArrayLength[i] = array1[i];
        }

        for (int i = 0; i <array2.length; i++) {
            newArrayLength[array1.length + i] = array2[i];
        }

        System.out.println(Arrays.toString(newArrayLength));
    }
}
