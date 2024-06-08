package org.problems.dsa;

public class PosNeg {
    public static void main(String[] args) {
        int[] arr = {-1, 3, -4, -4, 5, 69, -1, 5, 3};

        placeDigits(arr);
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }

    private static void placeDigits(int[] arr) {

        int n = arr.length;

        // find the index of positive no.
        int end = -1;
        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] < 0) {
                end = i;
                break;
            }
        }

        // Modifying the array by traversing from end-1 to 0
        for (int i = end - 1; i >= 0; i--) {
            if (arr[i] > 0) { // if element is a negative element,
                // swap it with arr[end]
                int temp = arr[i];
                arr[i] = arr[end];
                arr[end] = temp;
                end--;
            }
        }
    }
}
