package org.Exercises;

import java.util.Arrays;

public class Exercise2 {
    public static void main(String[] args) {


        //Java Program to Check if two Arrays are Equal or not
        int[] a = {30, 10, 25};
        int[] b = {30, 10, 25, 30};

        boolean result = Arrays.equals(a, b);

        if(result == true) {
            System.out.println("Tabele są takie same");
        }else {
            System.out.println("Tabele różnią się");
        }
    }
}
