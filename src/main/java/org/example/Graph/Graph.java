package org.example.Graph;

import lombok.Getter;

import java.util.*;

@Getter
public class Graph {
    private Map<String , List<String>> graph;

    public Graph(){
        this.graph = new HashMap<>();
    }
    public void addPoint(String label,String... nearPoints){
        graph.put(label,List.of(nearPoints));
    }
    public void addPoint(String label){
        graph.put(label,List.of(""));
    }
    public void deletePoint(String label){
        graph.remove(label);
    }

    public boolean searchPerson(String from, String to){
        Queue<String> queue = new ArrayDeque<>();
        queue.add(from);
        while (!queue.isEmpty()){
            if(graph.get(queue.element()).stream().anyMatch(point -> point.equals(to))){
                return true;
            }
            else {
                for (String friend : graph.get(queue.element())) {
                    if(!friend.isEmpty()){
                        queue.add(friend);
                    }
                }
                queue.remove();
            }
        }
        return false;
    }
}
