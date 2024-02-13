package org.Exercises.w3resource_exercises;

import java.util.Arrays;
import java.util.Collections;

public class Find_largest_elements_in_array {
    public static void main(String[] args) {
        Integer[] array = {1,4,20, 55, 8, 101};
        int k = 2;

        System.out.println(Arrays.toString(array));


        System.out.println(k + " najwyższe liczby danej listy to: ");

        Arrays.sort(array, Collections.reverseOrder());
        System.out.println(Arrays.toString(array));

        for (int i = 0; i < k; i++) {
            System.out.println(array[i]);
        }
    }

}
