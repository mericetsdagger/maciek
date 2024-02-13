package org.Exercises.w3resource_exercises;

import java.util.Arrays;

public class Find_smallest_elements_in_array {
    public static void main(String[] args) {
        Integer[] array = {1, 5, 20, -5, 100, -50};

        int k = 2;
        System.out.println(Arrays.toString(array));

        System.out.println(k + " najmniejsze liczby to: ");
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

        for (int i = 0; i < k; i++) {
            System.out.println(array[i]);
        }
    }
}
