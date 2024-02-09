package org.Exercises.Geeksforgeeks;

public class Replace_a_character_at_a_specific_index {
    public static void main(String[] args) {
//Metoda 1

        String text = "Java Fearning";
        int index = 5;
        char letter = 'L';
        System.out.println("Oryginalny tekst: " + text);

        text = text.substring(0, index) + letter + text.substring(index + 1);

        System.out.println("Zmodyfikowany tekst: " + text);
//Metoda 2

        text = "Java Fearning";
        index = 5;

        StringBuilder string = new StringBuilder(text);
        string.setCharAt(index, letter);

        System.out.println("Zmodyfikowany drugi string to: " + string);

    }


}

