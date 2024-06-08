package org.problems.question;

import java.util.Arrays;

public class MoveAllZeroToLast {
    public static void main(String[] args) {
        int[] arr = {0,0,0,1};
        moveAllZeroes(arr);
        Arrays.stream(arr).forEach(System.out::println);
    }

    private static void moveAllZeroes(int[] arr) {
        int i = 0;
        int j = arr.length - 1;

        while(i<j){
            if(arr[i]==0){
                while (arr[j]==0){
                    --j;
                }
                if (arr[i]!=0){
                    swap(i,j,arr);
                    j--  ;
                }

            }
            ++i;
        }
    }

    private static void moveAllZeroes2(int[] arr) {
        int nonZeroIndex=0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[nonZeroIndex++] = arr[i];
            }
        }
        while (nonZeroIndex < arr.length) {
            arr[nonZeroIndex++] = 0;
        }
    }

    private static void swap(int i, int j, int[] arr){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
