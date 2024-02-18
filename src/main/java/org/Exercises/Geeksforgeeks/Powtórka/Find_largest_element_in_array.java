package org.Exercises.Geeksforgeeks.Powtórka;

public class Find_largest_element_in_array {
    static int[] array = {10, 50, 99, 999};

    static int largest() {
        int max = array[0];

        for (int i = 0; i < array.length; i++) {
            if(array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(largest());
    }

}
