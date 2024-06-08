package org.problems.recursion;

import java.util.ArrayList;
import java.util.List;

public class ArrayCombination {

    private static void createCombinations(int[] input, List<Integer> ds, boolean[] map, List<List<Integer>> ans) {

        if (ds.size() == input.length) {
            ans.add(new ArrayList<>(ds));
            return;
        }

        for (int i = 0; i < input.length; i++) {
            if (!map[i]) {
                map[i] = true;
                ds.add(input[i]);
                createCombinations(input, ds, map, ans);
                map[i] = false;
                int indexOfElementToRemove = ds.size() - 1;
                ds.remove(indexOfElementToRemove);
            }
        }

    }

    private static void swap(int i, int j, int[] array) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }


    public static void main(String[] str) {
        int[] input = {1, 2, 3};
        List<List<Integer>> ans = new ArrayList<>();
        boolean[] map = new boolean[input.length];
        List<Integer> ds = new ArrayList<>();
        createCombinations(input, ds, map, ans);
        ans.forEach(System.out::println);
    }
}
