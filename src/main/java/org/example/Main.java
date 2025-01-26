package org.example;

import org.example.Graph.Graph;

public class Main {
    public static void main(String[] args) {
        //List<Integer> mass = List.of(2,3,1,5,4,6,9,8,7,11,20,10,13,12,14,16,15,17,18,19);
        //System.out.println(quickSort(mass));
        //List<String> mass1 = List.of("apple","banana","grape","kiwi","orange");
        //List<Integer> mass1 = List.of(1,3,4,6,7,9,10);
        //System.out.println(binarySearch(3,mass1));
        //System.out.println(binarySearchRecursion(3,mass1));
        Graph graph = new Graph();
        graph.addPoint("Bella","Alan","Ola");
        graph.addPoint("Alan","Peter");
        graph.addPoint("Ola","Adam");
        graph.addPoint("Peter");
        graph.addPoint("Adam","Elvis","Liza");
        graph.addPoint("Elvis");
        graph.addPoint("Liza");
        System.out.println(graph.searchPerson("Bella", "Liza"));
    }
}