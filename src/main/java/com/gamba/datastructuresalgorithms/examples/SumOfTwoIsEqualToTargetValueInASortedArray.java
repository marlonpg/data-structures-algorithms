package com.gamba.datastructuresalgorithms.examples;

import java.util.List;

public class SumOfTwoIsEqualToTargetValueInASortedArray {
    public static void main(String[] args) {
        var sortedList = List.of(-2, 2, 3, 4, 5, 10, 12);
        var sortedArray = new int[]{-2, 2, 3, 4, 5, 10, 12};
        System.out.println(twoLoops(sortedList, 10));
        System.out.println(twoLoops2(sortedArray, 10));
        System.out.println(twoPointers(sortedList, 10));

    }

    //Big O(n^2) - quadratic
    public static boolean twoLoops(List<Integer> list, Integer targetValue) {
        for (int pos = 0; pos < list.size(); pos++) {
            for (int pos2 = pos + 1; pos2 < list.size(); pos2++) {
                if (list.get(pos) + list.get(pos2) == targetValue) {
                    return true;
                }
            }
        }
        return false;
    }

    //Big O(n^2) - quadratic
    public static boolean twoLoops2(int[] array, Integer targetValue) {
        for (int pos = 0; pos < array.length; pos++) {
            for (int pos2 = pos + 1; pos2 < array.length; pos2++) {
                if (array[pos] + array[pos2] == targetValue) {
                    return true;
                }
            }
        }
        return false;
    }

    //Big O(n) - linear
    public static boolean twoPointers(List<Integer> list, Integer targetValue) {
        int firstPointer = 0;
        int secondPointer = list.size() - 1;

        while (firstPointer < secondPointer) {
            if (list.get(firstPointer) + list.get(secondPointer) == targetValue) {
                return true;
            } else if (list.get(firstPointer) + list.get(secondPointer) > targetValue) {
                secondPointer--;
            } else {
                firstPointer++;
            }
        }
        return false;
    }
}
