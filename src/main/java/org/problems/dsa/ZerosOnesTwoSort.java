package org.problems.dsa;

import java.util.Arrays;

public class ZerosOnesTwoSort {
    public static void main(String[] args) {
        int[] arr = {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
        Arrays.stream(sortedArray(arr))
              .forEach((x) -> System.out.print(x + " "));
    }

    private static int[] sortedArray(int[] arr) {
        int[] map = new int[3];
        for (int j : arr) {
            ++map[j];
        }

        int[] res = new int[arr.length];
        int k = 0;

        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i]; j++) {
                res[k++] = i;
            }
        }
        return res;
    }
}
