package org.Exercises.w3resource_exercises;

public class Print_the_specified_grid {
    public static void main(String[] args) {
        int[][] a = new int[10][10];

        for(int i = 1; i<10; i++) {
            for (int j = 1; j <10; j++) {

                System.out.printf("%2d ", a[i][j]);
            }
            System.out.println();
        }
    }
}
