package org.Exercises.w3resource_exercises;

import java.util.ArrayList;
import java.util.Arrays;

public class Cwiczenie {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("Kia");
        list.add("Ford");
        list.add("Opel");
        list.add("Fiat");
        System.out.println(list);
        list.trimToSize();

        for(int i = 0; i < list.size(); i++) {
            int j = i + 1;
            System.out.println("Element " + j + " na liście to: " + list.get(i));
        }
    }
}


