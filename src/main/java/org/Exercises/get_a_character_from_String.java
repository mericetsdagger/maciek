package org.Exercises;

public class get_a_character_from_String {

    public static char getChar(String text, int index) {
        return text.charAt(index);
    }
    public static void main(String[] args) {

        String text = "Maciek Java learning";
        int index = 3;

        System.out.println("Znak ze słowa: " + text + " o indeksie " + index + " to: " + text.charAt(index));
    }
}
