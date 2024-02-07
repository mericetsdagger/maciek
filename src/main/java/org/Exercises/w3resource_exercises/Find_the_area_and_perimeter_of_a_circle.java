package org.Exercises.w3resource_exercises;

public class Find_the_area_and_perimeter_of_a_circle {
    private static final double radius = 9;

    public static void main(String[] args) {
        double perimeter = 2 * Math.PI * radius;
        double area = Math.PI * radius * radius;


        System.out.println("Perimeter is: " + perimeter);
        System.out.println("Area is: " + area);
    }
}
