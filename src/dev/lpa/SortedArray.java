package dev.lpa;

import java.util.Arrays;
import java.util.Scanner;

public class SortedArray {
    public static int[] getIntegers(int length){
        int[] intArray = new int[length];
        Scanner in = new Scanner(System.in);
        System.out.printf("Please enter %d numbers: %n", length);
        for (int i = 0; i < length; i++){
            intArray[i] = in.nextInt();
        }
        return intArray;
    }

    public static void printArray(int[] intArray){
        for (int i = 0; i < intArray.length; i++){
            System.out.printf("Element %d contents %d%n", i, intArray[i]);
        }
    }

    public static int[] sortIntegers(int[] intArray){
        Arrays.sort(intArray);
        for (int i = 0; i < intArray.length / 2 ; i++){
            int temp = intArray[i];
            intArray[i] = intArray[intArray.length - i - 1];
            intArray[intArray.length - i - 1] = temp;
        }
        return Arrays.copyOf(intArray, intArray.length);
    }
}
