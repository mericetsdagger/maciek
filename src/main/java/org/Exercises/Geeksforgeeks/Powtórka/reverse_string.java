package org.Exercises.Geeksforgeeks.Powtórka;

public class reverse_string {
    public static void main(String[] args) {
        String word = "Maciek";
        StringBuilder sb = new StringBuilder(word);
        StringBuilder reverse = sb.reverse();
        System.out.println(reverse);
    }
}
