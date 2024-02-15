package org.Exercises.Geeksforgeeks;

public class Check_if_value_is_present_in_array {
    public static void main(String[] args) {
        int[]array = {7, 2, 4, 1, 3, 5, 6, 8, 2, 10};
        int checklValue = 12;

        check(array, checklValue);

    }

    private static  void check(int[]array, int checkValue) {
        boolean test = false;
        for (int element : array) {
            if (element == checkValue) {
                test = true;
                break;
            }
        }
        System.out.println("Czy " + checkValue + " znajduje się w tabeli : " + test);
    }
}
