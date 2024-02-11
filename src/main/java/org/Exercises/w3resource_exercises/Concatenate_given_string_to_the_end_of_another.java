package org.Exercises.w3resource_exercises;

public class Concatenate_given_string_to_the_end_of_another {
    public static void main(String[] args) {
        String text1 = "Java Exercises and";
        String text2 = " more exercises";

        String text3 = text1.concat(text2);

        System.out.println(text3);
    }
}
