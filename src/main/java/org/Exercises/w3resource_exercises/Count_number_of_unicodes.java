package org.Exercises.w3resource_exercises;

public class Count_number_of_unicodes {
    public static void main(String[] args) {
        String text = "Maciek";

        int count = text.codePointCount(2,6);

        System.out.println(count);
    }
}
