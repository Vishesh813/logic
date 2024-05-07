package org.example.dsa.ksumsubarray;

public class Optimal {
    public static void main(String[] args) {
        int[] input = {2,3,5};

        System.out.println(getNoOfSubArrays(input,5));

    }

    private static int getNoOfSubArrays(int[] input,int target) {
        int left = 0,right = 0;
        int n = input.length;
        int sum = input[0];
        int maxLength = 0;

        while(right<n){

            while(left<=right && sum>target){
                sum-=input[left];
                left++;
            }

            if(sum == target){
                maxLength = Math.max(maxLength,right-left+1);
            }

            ++right;
            if(right<n){
                sum+=input[right];
            }
        }
        return maxLength;
    }
}
