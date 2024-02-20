package org.Exercises.Geeksforgeeks.Powtórka;

import java.util.Arrays;

public class check_if_is_palindrome {
    static boolean isPalindrom(String str) {
        boolean answer = false;
        String rev = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
        if(str.equals(rev)) {
            answer = true;
        }
        return answer;
    }

    public static void main(String[] args) {

        String word = "ala";
        boolean palindrom = isPalindrom(word);
        System.out.println(palindrom);
    }
}
