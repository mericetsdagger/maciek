package org.Exercises.Geeksforgeeks;

import java.util.Arrays;
import java.util.Collections;

public class Sort_elements_in_desc_order {
    public static void main(String[] args) {
        Integer[] array = {10, 2, 19, 101, 18};
        Arrays.sort(array, Collections.reverseOrder());

        System.out.println(Arrays.toString(array));


    }
}