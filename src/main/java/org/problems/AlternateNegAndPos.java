package org.problems;

import java.util.*;

public class AlternateNegAndPos {

    public static void main(String[] args) {
        int[] arr = {1,2,-3,-1,-2,-3};
       // int[] arrangedArray = arrangeArray(arr);
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(1,2,-3,-1,-2,-3));
        List<Integer> arrangedArray = arrangedArrayForExtraValue(A);
       // Arrays.stream(arrangedArray).forEach((e)->System.out.print(e+" "));
        arrangedArray.forEach((e)->System.out.print(e+" "));

    }

    private static List<Integer> arrangedArrayForExtraValue(ArrayList<Integer> result) {
        List<Integer> positiveList = new ArrayList<>();
        List<Integer> negativeList = new ArrayList<>();

        for (int j : result) {
            if (j > 0) {
                positiveList.add(j);
            } else {
                negativeList.add(j);
            }
        }

        int positiveListSize = positiveList.size();
        int negativeListSize = negativeList.size();

        int size = Math.min(positiveListSize, negativeListSize);

        for (int i = 0; i < size; i++) {
            result.set(2*i, positiveList.get(i));
            result.set(2*i+1, negativeList.get(i));
        }

        if (positiveListSize < negativeListSize) {
            int index = positiveListSize*2;
            for (int i = positiveListSize; i < negativeListSize; i++) {
                result.set(index, negativeList.get(i));
                index++;
            }
        }
        else {
            int index = negativeListSize*2;
            for (int i = negativeListSize; i < positiveListSize; i++) {
                result.set(index, positiveList.get(i));
                index++;
            }
        }
        return result;
    }

    private static int[] arrangeArray(int[] arr) {
       int negIndex = 1,posIndex = 0;
        int n = arr.length;
        int[] newArr = new int[n];

        for (int i : arr) {
            if (i < 0) {
                newArr[negIndex] = i;
                negIndex += 2;
            } else {
                newArr[posIndex] = i;
                posIndex += 2;
            }
        }

       return newArr;
    }
}
