package org.example.Search;

import java.util.List;

public class Search {
    public static int binarySearch(int searchValue,List<Integer> massive){
        int lowIndex = 0;
        int maxIndex = massive.size();
        while (lowIndex <= maxIndex){
            int middle = Math.round((lowIndex+maxIndex)/2);
            int guess = massive.get(middle);
            if(guess > searchValue){
                maxIndex = middle - 1;
            } else if (guess < searchValue) {
                lowIndex = middle + 1;
            }else {
                return middle;
            }
        }
        return -1;
    }
    public static int binarySearchRecursion (int searchValue,List<Integer> massive){
        int middle = Math.round((0 + massive.size())/2);
        if(searchValue == massive.get(middle)){
            return middle;
        }
        else if (searchValue > massive.get(middle)){
            binarySearchRecursion(searchValue, massive.subList(middle + 1,massive.size() -1 ));
        }else {
            binarySearchRecursion(searchValue, massive.subList(0,middle + 1 ));
        }
        return middle;
    }
}
