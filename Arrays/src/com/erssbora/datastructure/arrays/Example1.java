package com.erssbora.datastructure.arrays;

import java.util.HashMap;
import java.util.Map;

/**
 * Problem :-
 * Given two array, create a function that let a user know(true/false) whether these two arrays
 * contain any common items.
 */
public class Example1 {
    public static void main(String[] args) {
        int array1[] = {'a', 'b', 'c'};
        int array2[] = {'x', 'a'};
        int array3[] = {'x', 'y'};

        System.out.println(containCommonItems(array1, array2));
        System.out.println(containCommonItems(array1, array3));
    }

    public static boolean containCommonItems(int[] array1, int[] array2) {
        Map<Integer, Boolean> map = new HashMap<>();
        for (int i = 0; i < array1.length; i++) {
            map.put(array1[i], true);
        }

        for (int i = 0; i < array2.length; i++) {
            Boolean v = map.get(array2[i]);
            if (v != null && v) {
                return true;
            }
        }
        return false;
    }
}
