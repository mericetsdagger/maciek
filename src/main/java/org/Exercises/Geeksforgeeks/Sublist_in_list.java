package org.Exercises.Geeksforgeeks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sublist_in_list {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<>();
        array.add("Example");
        array.add("in");
        array.add("Geeks");
        array.add("for");
        array.add("Geeks");

        System.out.println(array);

        List<String> arrayList = array.subList(2, 5);

        System.out.println("Sublist :" + arrayList);
    }
}
