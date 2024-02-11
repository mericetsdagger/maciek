package org.Exercises.w3resource_exercises;

import org.w3c.dom.ls.LSOutput;

public class Compare_two_strings {
    public static void main(String[] args) {


        String text = "Maciek 1";
        String text2 = "Maciek 2";

        int result = text.compareTo(text2);
        if (result < 0) {
            System.out.println("\"" + text + "\"" +
                    " is less than " +
                    "\"" + text2 + "\"");

        } else if (result == 0) {
            System.out.println("\"" + text + "\"" +
                    " is equal to " +
                    "\"" + text2 + "\"");
        }else  {
            System.out.println("\"" + text + "\"" +
                    " is greater than " +
                    "\"" + text2 + "\"");
        }
    }
}
