package org.Exercises.w3resource_exercises;

import org.w3c.dom.ls.LSOutput;

public class Compare_given_String_to_stringbuffer {
    public static void main(String[] args) {

        String text1 = "example.com";
        String text2 = "Example.com";

        StringBuffer sb = new StringBuffer(text1);
        System.out.println("Compare: " + text1 + " and " + sb + " : " + text1.contentEquals(sb));

    }
}
