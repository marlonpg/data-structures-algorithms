package com.gamba.datastructuresalgorithms.examples;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MoveLeftArray {
    public static void main(String[] args) {
        var arrayListOfCharacter = new ArrayList<String>();
        arrayListOfCharacter.addAll(List.of("A", "B", "C", "D", "E", "F"));
        System.out.println(tempArray(arrayListOfCharacter, 3));
    }

    //Big O(n) - Linear
    public static List<String> tempArray(List<String> array, int movePositions) {

        Set dup = new HashSet();
        //dup.add()
        var tempArray = new ArrayList<String>(movePositions);
        for (int i = 0; i < movePositions; i++) {
            tempArray.add(i, array.get(i));
        }
        System.out.println(tempArray);

        int startingPos = 0;
        for (int i = movePositions; i < array.size(); i++) {
            System.out.println(array.get(startingPos));
            array.set(startingPos, array.get(i));
            startingPos++;
        }

        int moveToPosition = movePositions;
        for (int i = 0; i < tempArray.size(); i++, startingPos++) {
            array.set(moveToPosition, tempArray.get(i));
            moveToPosition++;
        }
        return array;
    }
}
