package org.Exercises.Geeksforgeeks.Powtórka;

import java.util.Arrays;

public class check_if_anagram {

    static boolean areAnagram(char[] str1, char[] str2) {
        int n1 = str1.length;
        int n2 = str2.length;

        if (n1 != n2) {
            return false;
        }
        for (int i = 0; i < str1.length; i++) {

            Arrays.sort(str1);
            Arrays.sort(str2);

            if (str1[i] != str2[i]) {
                return false;
            }
        }
            return true;
        }

        public static void main (String[]args){

            char str1[] = {'t', 'e', 's', 't'};
            char str2[] = {'t', 'e', 'w', 't'};

            if (areAnagram(str1, str2)) {
                System.out.println("Są anagramami");
            } else {
                System.out.println("Nie są anagramami");
            }

        }
    }

