package org.Exercises.JavaStart_ćwiczenia.Klasa_String;

public class String_unmutable {
    public static void main(String[] args) {
        String hello = "Hello";
        hello = hello + " World";
        System.out.println(hello);

       StringBuilder sb = new StringBuilder();
       for (int i = 0; i < 1000; i++) {
           sb.append(i);
           sb.append(" ");
       }
       String numbers = sb.toString();
        System.out.println(numbers);
    }
}
