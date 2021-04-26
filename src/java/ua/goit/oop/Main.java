package main.java.OOP;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        SortUtil sortUtil = new SortUtil();
        int[] inputData = new int[]{-4,5,-7,100,-4,5,45,34,42,12,11};
        SearchUtil searchUtil = new SearchUtil();

        int[] sortedArray = sortUtil.sortInArray(inputData);
        int result = searchUtil.findElement(sortedArray,0);
        System.out.println(Arrays.toString(sortedArray));
        System.out.println(result);
    }
}
