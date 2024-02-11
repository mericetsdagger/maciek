package org.Exercises.w3resource_exercises;

public class create_string_object_with_contents_of_charArray {
    public static void main(String[] args) {
        char[] array = new char[] {'1', '2', '3', '4'};

        String str = String.copyValueOf(array, 1, 3);

        System.out.println(str);
    }
}
