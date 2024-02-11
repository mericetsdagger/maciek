package org.Exercises.w3resource_exercises;

import java.util.Arrays;
import java.util.List;

public class Find_maximum_and_minimum_values_in_list {
    public static void main(String[] args) {
        List< Integer > nums = Arrays.asList(1, 17, 54, 14, 14, 33, 45, -11);
        System.out.println("Oryginalna lista: " + nums);

        Integer max = nums.stream().max(Integer::compare).orElse(null);


        Integer min = nums.stream().min(Integer::compare).orElse(null);

        System.out.println(min);
        System.out.println(max);
    }

}
