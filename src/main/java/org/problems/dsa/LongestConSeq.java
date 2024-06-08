package org.problems.dsa;

import java.util.Arrays;

public class LongestConSeq {
    public static void main(String[] args) {
        int[] arr = {100, 200, 1, 3, 2, 4};
        System.out.print(calculateLongestComSeq(arr));
    }

    private static int calculateLongestComSeq(int[] arr) {
        Arrays.sort(arr);
        int sizeOfSequence = 1;
        int temp = arr[0];
        int i = 0;

        while (i<arr.length) {
            if(temp + 1 == arr[i]) {
                sizeOfSequence++;
            }
            temp = arr[i];
            i++;
        }

        return sizeOfSequence;
    }
}
