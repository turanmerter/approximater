package com.merthor.approximater;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class ApproximaterTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void findClosest_int() {
        List<List<Integer>> prospects = new ArrayList<>();
        prospects.add(Arrays.asList(1, 2, 3));
        prospects.add(Arrays.asList(3, 5, 6, 7, 1));
        prospects.add(Arrays.asList(6, 3, 7, 2));
        prospects.add(Arrays.asList(2, 7, 5, 1, 6, 8));

        List<Integer> target = Arrays.asList(4, 2, 5, 6, 2);

        List<Integer> closest = Approximater.findClosest(prospects, target);
        Assertions.assertTrue(closest.contains(2));
        Assertions.assertTrue(closest.contains(5));
        Assertions.assertTrue(closest.contains(6));
    }

    @Test
    void findClosest_str() {
        List<List<String>> prospects = new ArrayList<>();
        prospects.add(Arrays.asList("a", "p", "q", "r", "s", "v", "w"));
        prospects.add(Arrays.asList("a", "e", "f", "g", "h", "x", "y"));
        prospects.add(Arrays.asList("a", "b", "c", "f", "g", "h",  "k", "o"));
        prospects.add(Arrays.asList("a", "b", "c", "k", "l", "m", "n", "o", "p"));

        List<String> target = Arrays.asList("a", "q", "f", "p", "z", "g", "r", "s");

        List<String> closest = Approximater.findClosest(prospects, target);
        Assertions.assertTrue(closest.contains("a"));
        Assertions.assertTrue(closest.contains("p"));
        Assertions.assertTrue(closest.contains("q"));
        Assertions.assertTrue(closest.contains("r"));
        Assertions.assertTrue(closest.contains("s"));
    }
}