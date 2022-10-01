package com.gamba.datastructuresalgorithms.examples;

import java.util.Arrays;
import java.util.List;

public class BinarySearch {
    public static void main(String[] args) {
        var arrayOfIntegers = List.of(1, 4, 7, 13, 19, 23, 37, 40, 59, 65, 78, 85, 92, 99, 102);
        int[] array = new int[]{1, 4, 7, 13, 19, 23, 37, 40, 59, 65, 78, 85, 92, 99, 102};
        System.out.println(Arrays.binarySearch(array, 13));
        //System.out.println(hasValue(arrayOfIntegers, 13));
    }

    private static boolean hasValue(List<Integer> arrayOfIntegers, int targetValue) {
        int mid = arrayOfIntegers.size() / 2;
        while (mid < arrayOfIntegers.size()) {
            if (arrayOfIntegers.get(mid) == targetValue) {
                return true;
            } else if (arrayOfIntegers.get(mid) > targetValue) {
                mid = arrayOfIntegers.size() - mid / 2;
            } else {
                mid = mid / 2;
            }
        }
        return false;
    }
}
