package org.Exercises.Geeksforgeeks.Powtórka;

public class Sum_array_elements {
    static int[] array = {12,6,11,8,10};

    static int sum() {
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum +=array[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sum());
    }
}
