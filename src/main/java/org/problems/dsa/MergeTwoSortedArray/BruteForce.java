package org.problems.dsa.MergeTwoSortedArray;

import java.util.Arrays;

public class BruteForce {

    public static void main(String[] args) {

        int[] arr1 = {2, 3, 5, 7, 9};
        int[] arr2 = {2, 19, 34, 56, 89};
        Arrays.stream(mergeSortedArray(arr1, arr2)).forEach(System.out::println);
    }

    private static int[] mergeSortedArray(int[] arr1, int[] arr2) {
        int s1 = arr1.length;
        int s2 = arr2.length;

        int[] mergedArray = new int[s1 + s2];

        int left = 0;
        int right = 0;
        int index = 0;

        while (left < s1 && right < s2) {
            if (arr1[left] < arr2[right]) {
                mergedArray[index++] = arr1[left++];
            } else {
                mergedArray[index++] = arr2[right++];
            }
        }

        while (left < s1) {
            mergedArray[index++] = arr1[left++];
        }

        while (right < s2) {
            mergedArray[index++] = arr2[right++];
        }

        return mergedArray;
    }
}
