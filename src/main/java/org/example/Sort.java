package org.example;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Stream;

public class Sort {
    public static List<Integer> quickSort(List<Integer> massive) {
        if (massive.size() < 2) {
            return massive;
        } else {
            int pivot = massive.get(ThreadLocalRandom.current().nextInt(0, massive.size() - 1));
            Stream<Integer> less = massive.stream().filter(c->c < pivot);
            Stream<Integer> greater = massive.stream().filter(c->c > pivot);
            return Stream.concat(Stream.concat(quickSort(less.toList()).stream(),Stream.of(pivot)),quickSort(greater.toList()).stream()).toList();
        }
    }
}
