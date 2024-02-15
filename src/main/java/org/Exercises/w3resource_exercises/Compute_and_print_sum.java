package org.Exercises.w3resource_exercises;

import java.math.BigInteger;
import java.util.Scanner;

public class Compute_and_print_sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wpisz dwie liczby typu Integer: ");

        String s1 = new String();
        String s2 = new String();

        s1 = scanner.nextLine();
        s2 = scanner.nextLine();

        BigInteger b1 = new BigInteger(s1);
        BigInteger b2 = new BigInteger(s2);

        BigInteger result = new BigInteger("0");

        result = result.add(b1);
        result = result.add(b2);

        String s3 = "" + result;

        if(s1.length() > 80 || s2.length() > 80 || s3.length() > 80) {
            System.out.println("Overflow");
        }else {
            System.out.println(result);
        }
    }
}
