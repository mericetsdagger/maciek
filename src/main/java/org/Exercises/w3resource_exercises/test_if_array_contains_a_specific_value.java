package org.Exercises.w3resource_exercises;

public class test_if_array_contains_a_specific_value {
    public static boolean contains(int[] array, int item) {
        for (int n : array) {
            if (item == n) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] myArray = {
                1789, 2035, 1899, 1456, 2013,
                1458, 2458, 1254, 1472, 2365,
                1456, 2265, 1457, 2456};

        System.out.println(contains(myArray, 1899));
    }
}



