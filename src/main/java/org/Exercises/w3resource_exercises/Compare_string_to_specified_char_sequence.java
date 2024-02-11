package org.Exercises.w3resource_exercises;

import org.w3c.dom.ls.LSOutput;

public class Compare_string_to_specified_char_sequence {
    public static void main(String[] args) {

        String text = "example.com";
        String text2 = "Example.com";

        CharSequence cs = "example.com";
        System.out.println("Compare " +text + " and " + cs + " : " + text.contentEquals(cs));
        System.out.println("Compare " +text2 + " and " + cs + " : " + text2.contentEquals(cs));



    }
}