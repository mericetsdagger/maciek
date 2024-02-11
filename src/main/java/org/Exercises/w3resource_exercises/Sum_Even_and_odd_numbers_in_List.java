package org.Exercises.w3resource_exercises;

import java.util.Arrays;
import java.util.List;

public class Sum_Even_and_odd_numbers_in_List {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        int sumOfEvens = list.stream().filter(num -> num % 2 == 0).mapToInt(Integer::intValue).sum();
        System.out.println("Suma liczb parzystych to: " + sumOfEvens);


        int sumOfOdds = list.stream().filter(num -> num % 2 != 0).mapToInt(Integer::intValue).sum();
        System.out.println("Suma liczb nieparzystych to: " + sumOfOdds);
    }
}
