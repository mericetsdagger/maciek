package org.Exercises.w3resource_exercises;

import java.util.Arrays;
import java.util.List;

public class Calculate_average_of_Integers_using_streams {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,2,6,8,18,36);
        System.out.println("Lista: " + nums);

        double average = nums.stream().mapToDouble(Integer ::doubleValue).average().orElse(0.0);

        System.out.println("Średnia z liczb to: " + average);
    }
}
