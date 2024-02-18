package org.Exercises.Geeksforgeeks.Powtórka;

public class factorial {

    static  int factorial(int n) {
    int res = 1;
    for (int i = 1; i <= n; i++) {
    res *= i;
    }
    return res;
    }

    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
}
