package org.example.sorting.algos;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1,0,-1,0,9,8};
        int size  = arr.length;

        for (int i = 0; i < size-1; i++) {
            swap(arr,i,findMinimumValueIndex(arr,i,size-1));
        }
        Arrays.stream(arr).forEach((e)->System.out.print(e+" "));
    }

    private static int findMinimumValueIndex(int[] arr, int i, int j ) {
        int min = Integer.MAX_VALUE;
        int index = 0;
        for(int k = i; k <= j; k++) {
            if(arr[k] < min) {
                index = k;
                min = arr[k];

            }
        }
        return index;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
