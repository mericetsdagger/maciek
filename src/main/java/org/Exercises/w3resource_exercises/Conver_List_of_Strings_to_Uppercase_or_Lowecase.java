package org.Exercises.w3resource_exercises;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Conver_List_of_Strings_to_Uppercase_or_Lowecase {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("RED", "grEEn", "white", "Orange", "pink");
        System.out.println("Kolory to: " + list);

        List<String>upperCaseList = list.stream().map(String::toUpperCase).collect(Collectors.toList());

        System.out.println(upperCaseList);

        List<String>lowerCaseList = list.stream().map(String::toLowerCase).collect(Collectors.toList());
        System.out.println(lowerCaseList);
    }
}
