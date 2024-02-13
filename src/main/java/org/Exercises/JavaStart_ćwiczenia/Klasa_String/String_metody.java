package org.Exercises.JavaStart_ćwiczenia.Klasa_String;

import java.util.Arrays;

public class String_metody {
    public static void main(String[] args) {
        String words = "    Jeden dwa trzy cztery pięć sześć siedem ";
        String sub1 = words.substring(4, 9);
        String trim = words.trim();
        char charat = words.charAt(5);
        System.out.println(words);
        System.out.println(sub1);
        String replace = words.replaceAll("dwa", "hehe");
        System.out.println(replace);
        System.out.println(trim);
        System.out.println(charat);
        char first = trim.charAt(0);
        System.out.println(first);

        String[]split = trim.split(" ");
        System.out.println(Arrays.toString(split));
        System.out.println(split.length);

    }
}
