package org.Exercises.Geeksforgeeks.Powtórka;

public class Find_char_index {

    static char index (String word, int index) {
        System.out.println(word.charAt(index));
        return word.charAt(index);
    }

    public static void main(String[] args) {
        String word = "Maciek";
        index(word, 2);
    }
}
