package org.problems.sorting.algos;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {
        int[] arr = {  7, 8, 9 ,4, 5, 6};
        insertionSort(arr);
        Arrays.stream(arr).forEach(System.out::println);

    }

    private static void insertionSort(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            int j = i;
            while(j>0 && arr[j-1]>arr[j]) {
                swap(arr, j);
                j--;
            }
        }
    }

    private static void swap(int[] arr, int j) {
        int temp = arr[j];
        arr[j] = arr[j -1];
        arr[j -1] = temp;
    }
}
