package org.Exercises.Geeksforgeeks.Powtórka;

public class swap_two_numbers {
    public static void swap(int m, int n) {
        int temp = m;
        m = n;
        n = temp;

        System.out.println("Wartość M to: " + m + ", a wartość N to : " + n);
    }

    public static void main(String[] args) {

        int m = 10;
        int n = 5;
        swap(m, n);

    }
}
