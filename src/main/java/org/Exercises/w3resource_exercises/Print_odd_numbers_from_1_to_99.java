package org.Exercises.w3resource_exercises;

public class Print_odd_numbers_from_1_to_99 {
    public static void main(String[] args) {
        for (int i = 1; i < 100; i++) {
            if(i % 2 !=0) {
                System.out.println(i);
            }
        }
    }
}
