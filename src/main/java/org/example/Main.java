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
                System.out.println("Element pętli " + list.get(i));
            }
        }
    }

