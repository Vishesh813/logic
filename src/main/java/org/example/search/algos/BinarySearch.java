package org.example.search.algos;

public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10,56,89};
        int target = 89;
        System.out.println(binarySearch(arr,target));
    }

    private static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        int mid = 0;
        while (start <= end) {
            mid = (start + end)/2;

            if(arr[mid] == target) {
                return mid;
            }
            if(arr[mid] < target) {
                start = mid + 1;
            }
            if(arr[mid] > target) {
                end = mid - 1;
            }
        }

        return -1;
    }
}
