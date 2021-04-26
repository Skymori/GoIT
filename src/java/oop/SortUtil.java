package java.ua.goit.oop;

public class SortUtil {
   public int[] sortInArray(int[] inputData) {
      for (int i = 0; i < inputData.length; i++) {
         for (int j = 0; j < inputData.length - i - 1; j++) {
            if (inputData[j] > inputData[j + 1]) {
               int temp = inputData[j];
               inputData[j] = inputData[j + 1];
               inputData[j + 1] = temp;
            }

         }
      }
      return inputData;
   }

}