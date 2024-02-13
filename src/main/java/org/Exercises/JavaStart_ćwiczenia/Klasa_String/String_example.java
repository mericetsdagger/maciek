package org.Exercises.JavaStart_ćwiczenia.Klasa_String;

import java.util.Scanner;

public class String_example {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj napis1: ");
        String str1 = input.nextLine();
        System.out.println("podaj napis2: ");
        String str2 = input.nextLine();

        System.out.println("str1 == str2: " + str1 == str2);
        System.out.println("str1 equals str2: " + str1.equals(str2));
    }

    }

