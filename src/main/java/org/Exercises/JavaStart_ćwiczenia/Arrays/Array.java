package org.Exercises.JavaStart_ćwiczenia.Arrays;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {


        String[] names = {"Basia", "Kasia", "Joasia", "Wojtek", "Agnieszka"};
        Integer[] numbers = {2, 5, 1, 7, 10, 17};
        printArray(names);
        printArray(numbers);

        String[] names2 = Arrays.copyOf(names, names.length);
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));

        Integer[] numbers2 = Arrays.copyOf(numbers, numbers.length);
        System.out.println(Arrays.toString(numbers2));
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));


        System.out.println(Arrays.equals(numbers, numbers2));

        String[] strings = new String[5];
        Arrays.fill(strings, "Wacek");
        printArray(strings);



    }
    public static <T> void printArray(T[]array) {
        for (T t : array) {
            System.out.println(t + " " );
        }
        System.out.println();
    }
}