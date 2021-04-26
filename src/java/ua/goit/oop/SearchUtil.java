package main.java.OOP;

public class SearchUtil {
    public int findElement(int[] inputData, int elementToSearch){
        int lowIndex = 0;
        int highIndex = inputData.length-1;

        Integer midElement = getMidElement(inputData, elementToSearch, lowIndex, highIndex);
        if (midElement != null) return midElement;
        return -1;
    }

    private Integer getMidElement(int[] inputData, int elementToSearch, int lowIndex, int highIndex) {
        while (lowIndex <= highIndex){
            int midIndex = (lowIndex + highIndex) /2;
            int midElement = inputData[midIndex];
            if(midElement < elementToSearch){
                lowIndex = midIndex +1;
            }else if (midElement > elementToSearch){
                highIndex = midIndex -1;
            }else {
                return midElement;
            }
        }
        return null;
    }
}
