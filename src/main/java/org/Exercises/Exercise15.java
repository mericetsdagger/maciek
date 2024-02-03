package org.Exercises;

import java.util.Arrays;

public class Exercise15 {
    //    Write a Java Program to Find the Largest Element in Array
    static int[] array = {100, 25, 1000, 8024, 1192};

    static int findLargestNumber() {
        int max = array[0];
        for (int i = 0; i < array.length; i++)
            if (array[i] > max) {
                max = array[i];
            }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(findLargestNumber());
        System.out.println(Arrays.stream(array).max().getAsInt());   // drugi spoób
    }
}
