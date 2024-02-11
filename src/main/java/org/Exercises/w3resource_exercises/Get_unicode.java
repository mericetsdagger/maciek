package org.Exercises.w3resource_exercises;

import org.w3c.dom.ls.LSOutput;

public class Get_unicode {
    public static void main(String[] args) {


        String text = "Maciek";

        int val1 = text.codePointAt(0);
        int val2 = text.codePointAt(4);

        System.out.println(val1);
        System.out.println(val2);

        System.out.println((char)val1);
        System.out.println((char)val2);
    }
}