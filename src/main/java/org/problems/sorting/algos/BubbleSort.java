package org.problems.sorting.algos;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = { 5, 4, 3, 2, 1 ,123,4,2,5,6,4,5,6,73,1,3};
        int size = arr.length;

        for(int i = size-1; i >= 0; i--) {
            boolean isSwapped = false;
            for(int j = 0; j <=i-1; j++) {
                if(arr[j]>arr[j+1]) {
                    swap(arr,j,j+1);
                    isSwapped = true;
                }
            }
            if(!isSwapped) {
                break;
            }
        }

        Arrays.stream(arr).forEach(System.out::println);
    }

    private static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
