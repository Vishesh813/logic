package org.problems.dsa.twosum;

import java.util.HashMap;

public class HashApproach {
    public static void main(String[] args) {
        int[] arr = {4, 1, 2, 3, 1};

        int target = 12;
        System.out.println(isTargetAvailable(arr, target));
    }

    private static String isTargetAvailable(int[] arr, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int more = target - arr[i];
            if (map.containsKey(more)) {
                return "YES";
            }
            map.put(more, i);
        }
        return "NO";
    }
}
