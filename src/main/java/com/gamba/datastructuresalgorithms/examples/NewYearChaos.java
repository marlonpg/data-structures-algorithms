package com.gamba.datastructuresalgorithms.examples;

import java.util.Arrays;
import java.util.List;

public class NewYearChaos {
    public static void main(String[] args) {
        //minimumBribes(Arrays.asList(2, 1, 5, 3, 4));
        //minimumBribes(Arrays.asList(2, 5, 1, 3, 4));
        minimumBribes(Arrays.asList(1, 2, 5, 3, 7, 8, 6, 4));

    }

    /*
     * Complete the 'minimumBribes' function below.
     *
     * The function accepts INTEGER_ARRAY q as parameter.
     */
    public static void minimumBribes(List<Integer> q) {
        // Write your code here
        int pos1 = 0;
        boolean notChaoticYet = true;
        int maxBribes = 2;
        int totalBribes = 0;
        boolean doubleChecked = false;
        boolean changes = false;
        int numberOrdered = 0;
        while (notChaoticYet && pos1 <= q.size() - 1 && numberOrdered != q.size()) {
            System.out.println(q.toString());
            Integer temp;
            if (maxBribes < 0) {
                System.out.printf("Too chaotic");
                return;
            }
            if (pos1 + 1 < q.size()) {
                if (q.get(pos1) > q.get(pos1 + 1)) {
                    temp = q.get(pos1);
                    q.set(pos1, q.get(pos1 + 1));
                    q.set(pos1 + 1, temp);
                    maxBribes--;
                    totalBribes++;
                    numberOrdered = 0;
                } else {
                    numberOrdered++;
                    maxBribes = 2;
                }
                pos1++;
            } else {
                pos1 = 0;
            }
        }
        System.out.println(totalBribes);
    }
}
