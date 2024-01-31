package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        System.out.println(list);

        for (int i = 0; i <= 0; i++) {
            System.out.println("Pierwszy element z listy to: " + list.get(0));
            System.out.println("Drugi element z listy to : " + list.get(1));
            System.out.println("Trzeci element z listy to: " + list.get(2));
        }
    }
}