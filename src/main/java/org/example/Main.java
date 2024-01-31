package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        System.out.println(list);

        for (int i = 0; i < list.size(); i++) {
            int j = i + 1;
                System.out.println("Element " + j  + " to: " + list.get(i));
            }
        }
    }

