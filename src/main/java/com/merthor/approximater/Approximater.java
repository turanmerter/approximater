package com.merthor.approximater;

import java.util.List;

public class Approximater {

    public static <T> List<T> findClosest(List<List<T>> prospects, List<T> target) {
        return bruteForce(prospects, target);
    }

    private static <T> List<T> bruteForce(List<List<T>> prospects, List<T> target) {
        int mostCommon = -1;
        List<T> closest = null;
        for (List<T> prospect : prospects) {
            int count = 0;
            for (T t : target) {
                if (prospect.contains(t))
                    count++;
            }
            if (count >= mostCommon) {
                mostCommon = count;
                closest = prospect;
            }
        }

        return closest;
    }
}
