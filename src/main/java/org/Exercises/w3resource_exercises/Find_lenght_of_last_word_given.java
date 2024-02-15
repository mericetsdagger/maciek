package org.Exercises.w3resource_exercises;

public class Find_lenght_of_last_word_given {
    public static void main(String[] args) {
        String word1 = "The length of last word";
        System.out.println(word1);
        System.out.println("Długość ostatniego słowa w zdaniu to: " + lengthOfLastWord(word1) + " litery");
    }

    public static int lengthOfLastWord(String word) {
        int length = 0;
        String[]words = word.split(" ");

        if(words.length > 0) {
           length = words[words.length - 1].length();
        }else {
            length = 0;
        }
        return length;
    }
}
