package org.Exercises;

public class String_to_lower_case {


    public static void main(String[] args) {
        String name = "Maciek";
//      System.out.println(name.toLowerCase());
        System.out.println(toLower(name));

    }

    public static String toLower(String word) {
        return word.toLowerCase();
    }
}

