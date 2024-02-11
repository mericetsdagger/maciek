package org.Exercises.w3resource_exercises;

import org.w3c.dom.ls.LSOutput;

public class check_if_string_ends_with_another_string {
    public static void main(String[] args) {

        String str1 = "Java Exercises";
        String str2 = "Java Exercise";

        String end = "se";

        boolean ends1 = str1.endsWith(end);

        boolean ends2 = str2.endsWith(end);

        System.out.println(ends1);
        System.out.println(ends2);

    }
}
