package org.Exercises.Geeksforgeeks;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class Initialize_list_in_Java {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        System.out.println("ArrayList : " + list);


        List<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(5);
        linkedList.add(5);
        System.out.println("Linked List : " + linkedList);

        List<Integer> stack = new Stack<>();
        stack.add(3);
        stack.add(1);
        System.out.println("Stack : " + stack);
    }
}
