package org.Exercises.w3resource_exercises;

import java.util.Arrays;

public class Segregate_even_numbers_and_odd_numbers {
    public static void main(String[] args) {
        int[] nums = {7, 2, 4, 1, 3, 5, 6, 8, 2, 10};

        System.out.println(Arrays.toString(nums));

        int[]result = partitionArray(nums);

        System.out.println("Liczby podzielone na parzyste oraz nieparzyste: " + Arrays.toString(result));
        Arrays.sort(result);
        System.out.println("Liczby posortowane: " + Arrays.toString(result));
    }

    public static int[] partitionArray(int[] nums) {
        int i = 0;
        int j = nums.length - 1;

        while (i < j) {
            while(nums[i] % 2 == 0) {
                i++;
            }
            while(nums[j] % 2 !=0){
                j--;
            }
            if (i < j) {
                int temp = nums[i];
                nums[i] =  nums[j];
                nums[j] = temp;
            }
        }
        return nums;
    }
}
