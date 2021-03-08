package main.java;

import java.util.Arrays;
import java.util.Scanner;

public class homeWorkKon3 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        int i = 0;
        Scanner in = new Scanner(System.in);
        for(int element : arr) {
            System.out.print("Введите " + (i + 1) + "-й элемент массива: ");
            arr[i] = in.nextInt();
            while (arr[i] > 6 | arr[i]<=0) {
                System.out.println("Введите " + (i + 1) + "-й элемент массива:");
                arr[i] = in.nextInt();
            }
            i++;
        }
        String res = Arrays.toString(arr);

    }

}