package dev.lpa;

public class Main {
    public static void main(String[] args) {
      int[] integerArray = SortedArray.getIntegers(7);
      SortedArray.printArray(SortedArray.sortIntegers(integerArray));
    }
}
