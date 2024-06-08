package org.problems.dsa.ksumsubarray;

import java.util.HashMap;
import java.util.Map;

public class HashingApproach {
    public static void main(String[] args) {
        int[] input = {2,3,5};
        int target = 5;
        System.out.println(getNoOfSubArray(input,target));
    }

    private static int getNoOfSubArray(int[] input, int target) {
        int maxLength = 0;
        int sum = 0;
        Map<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < input.length; i++) {
            sum+=input[i];

            if (sum == target){
                maxLength = Math.max(maxLength,i+1);
            }

            int rem = sum - target;

            if(map.containsKey(rem)){
                int index = i - map.get(rem);
                maxLength = Math.max(maxLength,index+1);
            }

            if(!map.containsKey(sum)){
                map.put(input[i],i);
            }
        }
        return maxLength;
    }
}
