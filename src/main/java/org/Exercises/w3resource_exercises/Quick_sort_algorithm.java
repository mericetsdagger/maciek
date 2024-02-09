package org.Exercises.w3resource_exercises;

import java.util.Arrays;

public class Quick_sort_algorithm {
    private int[] array;
    private int len;

    public void sort(int[] nums) {
        if (nums == null || nums.length == 0) {
            return;
        }
        this.array = nums;
        len = nums.length;
        quickSort(0, len - 1);
    }

    private void quickSort(int low_index, int high_index) {
        int i = low_index;
        int j = high_index;
        int pivot = array[low_index + (high_index - low_index) / 2];
        while (i <= j) {
            while (array[i] < pivot) {
                i++;
            }
            while (array[j] > pivot) {
                j--;
            }
            if (i <= j) {
                exchangeNumbers(i, j);
                i++;
                j--;
            }
        }
        if (low_index < j)
            quickSort(low_index, j);
        if (i < high_index)
            quickSort(i, high_index);
    }

    private void exchangeNumbers(int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String[] args) {
        Quick_sort_algorithm ob =  new Quick_sort_algorithm();
        int nums[] = {5,11,-5,2,1,57};

        System.out.println("Original Array: " + Arrays.toString(nums));
        ob.sort(nums);
        System.out.println("Sorted Array: " + Arrays.toString(nums));

    }
}
