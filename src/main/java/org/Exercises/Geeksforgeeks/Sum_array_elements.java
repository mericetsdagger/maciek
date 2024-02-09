package org.Exercises.Geeksforgeeks;

public class Sum_array_elements {
//    Write a Java Program to Compute the Sum of Array Elements.

static int[] array = {5 , 10, 15, 20, 39};

static int arraySum() {
int sum = 0;
int i;
for (i = 0; i<array.length; i++)
    sum+= array[i];
return sum;
}

    public static void main(String[] args) {
        System.out.println(arraySum());
    }
}

