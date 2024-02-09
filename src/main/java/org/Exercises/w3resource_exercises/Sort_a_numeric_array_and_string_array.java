package org.Exercises.w3resource_exercises;

import java.util.Arrays;

public class Sort_a_numeric_array_and_string_array {
    public static void main(String[] args) {
        int[] myArray1 = {1789, 2035, 1899, 1456, 2013,
                1458, 2458, 1254, 1472, 2365,
                1456, 2165, 1457, 2456};

        String[] myArray2 = {"Java", "Python", "PHP", "C#", "C Programming", "C++"};

        System.out.println("Original numeric array: " + Arrays.toString(myArray1));
        Arrays.sort(myArray1);

        System.out.println("Sorted numeric array is: " + Arrays.toString(myArray1));
    }


}
