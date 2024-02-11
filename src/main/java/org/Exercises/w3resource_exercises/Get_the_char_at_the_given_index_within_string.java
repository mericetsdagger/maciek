package org.Exercises.w3resource_exercises;

public class Get_the_char_at_the_given_index_within_string {
    public static void main(String[] args) {
        String text = "Java Exercises!";

        int index1 = text.charAt(0);
        int index2 = text.charAt(10);


        System.out.println("Pierwszy index to : " + (char)index1);
        System.out.println("Dziesiąty index to: " +(char)index2);
    }
}
