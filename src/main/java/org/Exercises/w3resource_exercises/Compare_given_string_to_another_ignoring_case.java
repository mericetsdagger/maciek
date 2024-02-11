package org.Exercises.w3resource_exercises;

public class Compare_given_string_to_another_ignoring_case {
    public static void main(String[] args) {
        String str1 = "Maciek";
        String str2 = "maciek";



        boolean eql1 = str1.equals(str2);
        boolean eql2 = str1.equalsIgnoreCase(str2);

        System.out.println(eql1);
        System.out.println(eql2);
    }
}
