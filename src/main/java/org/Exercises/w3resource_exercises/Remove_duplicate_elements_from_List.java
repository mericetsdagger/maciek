package org.Exercises.w3resource_exercises;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Remove_duplicate_elements_from_List {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(10, 23, 22, 23, 24, 24, 33, 15, 26, 15);
        System.out.println("Bazowa lista to: " + nums);

        List<Integer> distinctNumbers = nums.stream().distinct().collect(Collectors.toList());

        System.out.println("Lista po usunięciu powtarzających się liczb: " +distinctNumbers );


   }
}
