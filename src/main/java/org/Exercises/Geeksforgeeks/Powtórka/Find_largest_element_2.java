package org.Exercises.Geeksforgeeks.Powtórka;

import java.util.Arrays;

public class Find_largest_element_2 {
    public static void main(String[] args) {
        int[]array = {10, 15, 200, 999};

        int max = Arrays.stream(array).max().getAsInt();
        int min = Arrays.stream(array).min().getAsInt();

        System.out.println(max);
        System.out.println(min);
    }

}
