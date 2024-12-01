package org.example;

import java.util.*;

import static org.example.Sort.quickSort;

public class Main {
    public static void main(String[] args) {
        List<Integer> mass = List.of(2,3,1,5,4,6,9,8,7,11,20,10,13,12,14,16,15,17,18,19);
        System.out.println(quickSort(mass));
    }
}