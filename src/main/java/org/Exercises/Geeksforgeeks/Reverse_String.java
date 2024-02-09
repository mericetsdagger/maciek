package org.Exercises.Geeksforgeeks;

public class Reverse_String {
    public static void main(String[] args) {
        String name = "Maciek";
        StringBuilder reverse = new StringBuilder(name);
        reverse.reverse();
        System.out.println("Imię to: " + name + ", a odwrócone imię to: " + reverse);
    }

}
