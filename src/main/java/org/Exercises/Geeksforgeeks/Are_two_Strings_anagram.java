package org.Exercises.Geeksforgeeks;

import java.util.Arrays;

public class Are_two_Strings_anagram {
    //    Java Program To Check Whether Two Strings Are Anagram

    static boolean areAnagram(char[] array1, char[] array2) {
        int n1 = array1.length;
        int n2 = array2.length;

        if (n1 != n2) {
            return false;
        }
        Arrays.sort(array1);
        Arrays.sort(array2);
        for (int i = 0; i < n1; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        char[] array1 = {'l', 'i', 's', 't', 'e', 'n'};
        char[] array2 = {'s', 'i', 'l', 'e', 'n', 't'};

        if (areAnagram(array1, array2)) {
            System.out.println("Two string are anagrams");
        } else {
            System.out.println("Two strings are not anagrams");
        }
    }
}


