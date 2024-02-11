package org.Exercises.w3resource_exercises;

import java.util.Arrays;
import java.util.List;

public class Find_second_smallest_and_largest_elements {
    public static void main(String[] args) {
        List< Integer > nums = Arrays.asList(1, 17, 54, 14, 14, 33, 45, -11);
        System.out.println("Lista: " + nums);


        Integer secondSmallest = nums.stream().distinct().sorted().skip(1).findFirst().orElse(null);

        Integer secondLargest = nums.stream().distinct().sorted((a, b) -> Integer.compare(b, a)).skip(1).findFirst().orElse(null);

        System.out.println("Druga najmniejsza licza to: " + secondSmallest);
        System.out.println("Druga największa liczba to: " + secondLargest);
    }
}
