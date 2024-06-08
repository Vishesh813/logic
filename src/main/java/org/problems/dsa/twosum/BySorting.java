package org.problems.dsa.twosum;

import java.util.Arrays;

public class BySorting {
    public static void main(String[] args) {
        int[] arr = {4,1,2,3,1};

        int target  = 6;
        System.out.println(isTargetAvailable(arr,target));
    }

    private static String isTargetAvailable(int[] arr, int target) {
        int left = 0 ;
        int right = arr.length - 1;

        Arrays.sort(arr);

        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == target) {
                return "YES";
            }
            else if(sum < target) {
                left++;
            }

            else{
                    right--;
            }
        }

        return "NO";
    }
}
