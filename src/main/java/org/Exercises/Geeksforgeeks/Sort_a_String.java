package org.Exercises.Geeksforgeeks;

import java.util.Arrays;

public class Sort_a_String {

    public static String sortString(String text) {
        char[] Array = text.toCharArray();
        Arrays.sort(Array);
        return new String(Array);
    }

    public static void main(String[] args) {
        String text = "Maciek java learning";
        String textLowerCase = text.toLowerCase();
        System.out.println("Oryginalny tekst: " + textLowerCase);
        System.out.println("Posortowane litery: " + sortString(textLowerCase));

    }


}
