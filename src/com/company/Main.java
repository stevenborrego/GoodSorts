package com.company;

import java.util.Random;
import java.time.Duration;
import java.time.LocalDateTime;

public class Main {

    public static int SMALL = 1000;
    public static int SMALL2 = 2500;
    public static int SMALL3 =  7500;
    public static int MEDIUM = 10000;
    public static int MEDIUM2 = 12500;
    public static int MEDIUM3 = 15000;
    public static int LARGE = 25000;
    public static int LARGE2 = 50000;
    public static int LARGE3 = 75000;
    public static int LARGEST = 100000;

    public static void SelectionSort(int [] array) {
        LocalDateTime start = LocalDateTime.now();

        int arrayLength = array.length;

        for (int i = 0; i < arrayLength - 1; i++) {

            int min = i;

            for (int j = i + 1; j < arrayLength; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }

            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }

        LocalDateTime end = LocalDateTime.now();
        Duration duration = Duration.between(start, end);

        System.out.print("Selection Sort has completed in " + duration.toMillis() + " milliseconds for array length: " + arrayLength + "\n");
    }

    public static void MergeSort(int [] array, int left, int right) {
        LocalDateTime start = LocalDateTime.now();

        Sort(array, left, right);

        LocalDateTime end = LocalDateTime.now();
        Duration duration = Duration.between(start, end);

        System.out.print("Merge Sort has completed in " + duration.toMillis() + " milliseconds.\n");
    }

    public static void Merge(int [] array, int left, int middle, int right) {
        int n1 = middle - left + 1;
        int n2 = right - middle;

        int leftArr[] = new int[n1];
        int rightArr[] = new int[n2];

        for(int i = 0; i < n1; ++i) {
            leftArr[i] = array[left + i];
        }
        for(int j = 0; j < n2; ++j) {
           rightArr[j] = array[middle + 1 + j];
        }

        int i = 0;
        int j = 0;

        int k = left;

        while(i < n1 && j < n2) {
            if(leftArr[i] <= rightArr[j]) {
                array[k] = leftArr[i];
                ++i;
            }
            else {
                array[k] = rightArr[j];
                ++j;
            }
            ++k;
        }

        while(i < n1) {
            array[k] = leftArr[i];
            ++i;
            ++k;
        }
        while(j < n2) {
            array[k] = rightArr[j];
            ++j;
            ++k;
        }

    }

    public static void Sort(int [] array, int left, int right) {
        if(left < right) {
            int middle = (left + right) / 2;

            Sort(array, left, middle);
            Sort(array, middle + 1, right);

            Merge(array, left, middle, right);
        }

    }

    public static int HoarePartition(int [] array, int low, int high){
        int pivot = array[low];
        int i = low - 1, j = high + 1;

        while (true) {

            do {
                i++;
            }while(array[i] < pivot);

            do{
                j--;
            }while (array[j] > pivot);

            if(i >= j)
                return j;
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }

    public static void QuickSort(int [] array, int low, int high) {
        LocalDateTime start = LocalDateTime.now();

        QuickSortRecursive(array, low, high);

        LocalDateTime end = LocalDateTime.now();
        Duration duration = Duration.between(start, end);

        System.out.print("Quick Sort has completed in " + duration.toMillis() + " milliseconds.\n");
    }

    public static void QuickSortRecursive(int [] array, int low, int high) {

        if(low < high) {
            int pivot = HoarePartition(array, low, high);

            QuickSortRecursive(array, low, pivot - 1);
            QuickSortRecursive(array, pivot + 1, high);
        }
    }

    public static void InitializeRandom(int [] array, int size) {

        Random rand = new Random();

        // initializes arrays with random int 0-99
        for(int i = 0; i < size; ++i){
           array[i] = rand.nextInt(100);
        }
    }

    public static void CopyArray(int [] sourceArray, int [] destArray, int size) {
       for (int i = 0; i < size; ++i) {
          destArray[i] = sourceArray[i];
       }
    }

    public static void InitializeSorted(int [] array, int size) {
        for(int i = 0; i < size; ++i) {
            array[i] = i;
        }
    }

    public static void InitializeReverseSorted(int [] array, int size) {
        for(int i = size - 1; i > 0; --i) {
            array[i] = i;
        }
    }

    public static void main(String[] args) {

        System.out.print("Welcome to ASS\n");

        // S = Selection Sort
        // M = Merge Sort
        // Q = Quick Sort

        // add intermediate arrays arrays arrays arrays arrays arrays arrays arrays arrays, automate array generation

        // random arrays
        int [] smallArrayRandomS = new int [SMALL];
        int [] small2ArrayRandomS = new int [SMALL2];
        int [] small3ArrayRandomS = new int [SMALL3];
        int [] mediumArrayRandomS = new int [MEDIUM];
        int [] medium2ArrayRandomS = new int [MEDIUM2];
        int [] medium3ArrayRandomS = new int [MEDIUM3];
        int [] largeArrayRandomS = new int [LARGE];
        int [] large2ArrayRandomS = new int [LARGE2];
        int [] large3ArrayRandomS = new int [LARGE3];
        int [] largestArrayRandomS = new int [LARGEST];

        int [] smallArrayRandomM = new int [SMALL];
        int [] small2ArrayRandomM = new int [SMALL2];
        int [] small3ArrayRandomM = new int [SMALL3];
        int [] mediumArrayRandomM = new int [MEDIUM];
        int [] medium2ArrayRandomM = new int [MEDIUM2];
        int [] medium3ArrayRandomM = new int [MEDIUM3];
        int [] largeArrayRandomM = new int [LARGE];
        int [] large2ArrayRandomM = new int [LARGE2];
        int [] large3ArrayRandomM = new int [LARGE3];
        int [] largestArrayRandomM = new int [LARGEST];

        int [] smallArrayRandomQ = new int [SMALL];
        int [] small2ArrayRandomQ = new int [SMALL2];
        int [] small3ArrayRandomQ = new int [SMALL3];
        int [] mediumArrayRandomQ = new int [MEDIUM];
        int [] medium2ArrayRandomQ = new int [MEDIUM2];
        int [] medium3ArrayRandomQ = new int [MEDIUM3];
        int [] largeArrayRandomQ = new int [LARGE];
        int [] large2ArrayRandomQ = new int [LARGE2];
        int [] large3ArrayRandomQ = new int [LARGE3];
        int [] largestArrayRandomQ = new int [LARGEST];


        // sorted arrays
        int [] smallArraySortedS = new int [SMALL];
        int [] small2ArraySortedS = new int [SMALL2];
        int [] small3ArraySortedS = new int [SMALL3];
        int [] mediumArraySortedS = new int [MEDIUM];
        int [] medium2ArraySortedS = new int [MEDIUM2];
        int [] medium3ArraySortedS = new int [MEDIUM3];
        int [] largeArraySortedS = new int [LARGE];
        int [] large2ArraySortedS = new int [LARGE2];
        int [] large3ArraySortedS = new int [LARGE3];
        int [] largestArraySortedS = new int [LARGEST];

        int [] smallArraySortedM = new int [SMALL];
        int [] small2ArraySortedM = new int [SMALL2];
        int [] small3ArraySortedM = new int [SMALL3];
        int [] mediumArraySortedM = new int [MEDIUM];
        int [] medium2ArraySortedM = new int [MEDIUM2];
        int [] medium3ArraySortedM = new int [MEDIUM3];
        int [] largeArraySortedM = new int [LARGE];
        int [] large2ArraySortedM = new int [LARGE2];
        int [] large3ArraySortedM = new int [LARGE3];
        int [] largestArraySortedM = new int [LARGEST];

        int [] smallArraySortedQ = new int [SMALL];
        int [] small2ArraySortedQ = new int [SMALL2];
        int [] small3ArraySortedQ = new int [SMALL3];
        int [] mediumArraySortedQ = new int [MEDIUM];
        int [] medium2ArraySortedQ = new int [MEDIUM2];
        int [] medium3ArraySortedQ = new int [MEDIUM3];
        int [] largeArraySortedQ = new int [LARGE];
        int [] large2ArraySortedQ = new int [LARGE2];
        int [] large3ArraySortedQ = new int [LARGE3];
        int [] largestArraySortedQ = new int [LARGEST];

        // reverse sorted arrays
        int [] smallArrayReverseS = new int [SMALL];
        int [] small2ArrayReverseS = new int [SMALL2];
        int [] small3ArrayReverseS = new int [SMALL3];
        int [] mediumArrayReverseS = new int [MEDIUM];
        int [] medium2ArrayReverseS = new int [MEDIUM2];
        int [] medium3ArrayReverseS = new int [MEDIUM3];
        int [] largeArrayReverseS = new int [LARGE];
        int [] large2ArrayReverseS = new int [LARGE2];
        int [] large3ArrayReverseS = new int [LARGE3];
        int [] largestArrayReverseS = new int [LARGEST];

        int [] smallArrayReverseM = new int [SMALL];
        int [] small2ArrayReverseM = new int [SMALL2];
        int [] small3ArrayReverseM = new int [SMALL3];
        int [] mediumArrayReverseM = new int [MEDIUM];
        int [] medium2ArrayReverseM = new int [MEDIUM2];
        int [] medium3ArrayReverseM = new int [MEDIUM3];
        int [] largeArrayReverseM = new int [LARGE];
        int [] large2ArrayReverseM = new int [LARGE2];
        int [] large3ArrayReverseM = new int [LARGE3];
        int [] largestArrayReverseM = new int [LARGEST];

        int [] smallArrayReverseQ = new int [SMALL];
        int [] small2ArrayReverseQ = new int [SMALL2];
        int [] small3ArrayReverseQ = new int [SMALL3];
        int [] mediumArrayReverseQ = new int [MEDIUM];
        int [] medium2ArrayReverseQ = new int [MEDIUM2];
        int [] medium3ArrayReverseQ = new int [MEDIUM3];
        int [] largeArrayReverseQ = new int [LARGE];
        int [] large2ArrayReverseQ = new int [LARGE2];
        int [] large3ArrayReverseQ = new int [LARGE3];
        int [] largestArrayReverseQ = new int [LARGEST];


        // random
        InitializeRandom(smallArrayRandomS, SMALL); // selection sort
        InitializeRandom(small2ArrayRandomS, SMALL2);
        InitializeRandom(small3ArrayRandomS, SMALL3);

        InitializeRandom(mediumArrayRandomS, MEDIUM);
        InitializeRandom(medium2ArrayRandomS, MEDIUM2);
        InitializeRandom(medium3ArrayRandomS, MEDIUM3);

        InitializeRandom(largeArrayRandomS, LARGE);
        InitializeRandom(large2ArrayRandomS, LARGE2);
        InitializeRandom(large3ArrayRandomS, LARGE3);
        InitializeRandom(largestArrayRandomS, LARGEST);

        CopyArray(smallArrayRandomS, smallArrayRandomM, SMALL); // Merge Sort
        CopyArray(small2ArrayRandomS, small2ArrayRandomM, SMALL2);
        CopyArray(small3ArrayRandomS, small3ArrayRandomM, SMALL3);

        CopyArray(mediumArrayRandomS, mediumArrayRandomM, MEDIUM);
        CopyArray(medium2ArrayRandomS, medium2ArrayRandomM, MEDIUM2);
        CopyArray(medium3ArrayRandomS, medium3ArrayRandomM, MEDIUM3);

        CopyArray(largeArrayRandomS, largeArrayRandomM, LARGE);
        CopyArray(large2ArrayRandomS, large2ArrayRandomM, LARGE2);
        CopyArray(large3ArrayRandomS, large3ArrayRandomM, LARGE3);
        CopyArray(largestArrayRandomS, largestArrayRandomM, LARGEST);

        CopyArray(smallArrayRandomS, smallArrayRandomQ, SMALL); // Quick Sort
        CopyArray(small2ArrayRandomS, small2ArrayRandomQ, SMALL2);
        CopyArray(small3ArrayRandomS, small3ArrayRandomQ, SMALL3);

        CopyArray(mediumArrayRandomS, mediumArrayRandomQ, MEDIUM);
        CopyArray(medium2ArrayRandomS, medium2ArrayRandomQ, MEDIUM2);
        CopyArray(medium3ArrayRandomS, medium3ArrayRandomQ, MEDIUM3);

        CopyArray(largeArrayRandomS, largeArrayRandomQ, LARGE);
        CopyArray(large2ArrayRandomS, large2ArrayRandomQ, LARGE2);
        CopyArray(large3ArrayRandomS, large3ArrayRandomQ, LARGE3);
        CopyArray(largestArrayRandomS, largestArrayRandomQ, LARGEST);

        // sorted
        InitializeSorted(smallArraySortedS, SMALL); // selection sort
        InitializeSorted(small2ArraySortedS, SMALL2);
        InitializeSorted(small3ArraySortedS, SMALL3);

        InitializeSorted(mediumArraySortedS, MEDIUM);
        InitializeSorted(medium2ArraySortedS, MEDIUM2);
        InitializeSorted(medium3ArraySortedS, MEDIUM3);

        InitializeSorted(largeArraySortedS, LARGE);
        InitializeSorted(large2ArraySortedS, LARGE2);
        InitializeSorted(large3ArraySortedS, LARGE3);
        InitializeSorted(largestArraySortedS, LARGEST);

        InitializeSorted(smallArraySortedM, SMALL); // merge sort
        InitializeSorted(small2ArraySortedM, SMALL2);
        InitializeSorted(small3ArraySortedM, SMALL3);

        InitializeSorted(mediumArraySortedM, MEDIUM);
        InitializeSorted(medium2ArraySortedM, MEDIUM2);
        InitializeSorted(medium3ArraySortedM, MEDIUM3);

        InitializeSorted(largeArraySortedM, LARGE);
        InitializeSorted(large2ArraySortedM, LARGE2);
        InitializeSorted(large3ArraySortedM, LARGE3);
        InitializeSorted(largestArraySortedM, LARGEST);

        InitializeSorted(smallArraySortedQ, SMALL); // quick sort
        InitializeSorted(small2ArraySortedQ, SMALL2);
        InitializeSorted(small3ArraySortedQ, SMALL3);

        InitializeSorted(mediumArraySortedQ, MEDIUM);
        InitializeSorted(medium2ArraySortedQ, MEDIUM2);
        InitializeSorted(medium3ArraySortedQ, MEDIUM3);

        InitializeSorted(largeArraySortedQ, LARGE);
        InitializeSorted(large2ArraySortedQ, LARGE2);
        InitializeSorted(large3ArraySortedQ, LARGE3);
        InitializeSorted(largestArraySortedQ, LARGEST);

        // reverse sorted
        InitializeReverseSorted(smallArrayReverseS, SMALL); // selection sort
        InitializeReverseSorted(small2ArrayReverseS, SMALL2);
        InitializeReverseSorted(small3ArrayReverseS, SMALL3);

        InitializeReverseSorted(mediumArrayReverseS, MEDIUM);
        InitializeReverseSorted(medium2ArrayReverseS, MEDIUM2);
        InitializeReverseSorted(medium3ArrayReverseS, MEDIUM3);

        InitializeReverseSorted(largeArrayReverseS, LARGE);
        InitializeReverseSorted(large2ArrayReverseS, LARGE2);
        InitializeReverseSorted(large3ArrayReverseS, LARGE3);
        InitializeReverseSorted(largestArrayReverseS, LARGEST);

        InitializeReverseSorted(smallArrayReverseM, SMALL); // merge sort
        InitializeReverseSorted(small2ArrayReverseM, SMALL2);
        InitializeReverseSorted(small3ArrayReverseM, SMALL3);

        InitializeReverseSorted(mediumArrayReverseM, MEDIUM);
        InitializeReverseSorted(medium2ArrayReverseM, MEDIUM2);
        InitializeReverseSorted(medium3ArrayReverseM, MEDIUM3);

        InitializeReverseSorted(largeArrayReverseM, LARGE);
        InitializeReverseSorted(large2ArrayReverseM, LARGE2);
        InitializeReverseSorted(large3ArrayReverseM, LARGE3);
        InitializeReverseSorted(largestArrayReverseM, LARGEST);

        InitializeReverseSorted(smallArrayReverseQ, SMALL); // quick sort
        InitializeReverseSorted(small2ArrayReverseQ, SMALL2);
        InitializeReverseSorted(small3ArrayReverseQ, SMALL3);

        InitializeReverseSorted(mediumArrayReverseQ, MEDIUM);
        InitializeReverseSorted(medium2ArrayReverseQ, MEDIUM2);
        InitializeReverseSorted(medium3ArrayReverseQ, MEDIUM3);

        InitializeReverseSorted(largeArrayReverseQ, LARGE);
        InitializeReverseSorted(large2ArrayReverseQ, LARGE2);
        InitializeReverseSorted(large3ArrayReverseQ, LARGE3);
        InitializeReverseSorted(largestArrayReverseQ, LARGEST);

        // let the sorting begin!!

        // Random
        System.out.print("\nNow Performing Selection Sort on Random Input\n");
        SelectionSort(smallArrayRandomS);
        SelectionSort(small2ArrayRandomS);
        SelectionSort(small3ArrayRandomS);
        SelectionSort(mediumArrayRandomS);
        SelectionSort(medium2ArrayRandomS);
        SelectionSort(medium3ArrayRandomS);
        SelectionSort(largeArrayRandomS);
        SelectionSort(large2ArrayRandomS);
        SelectionSort(large3ArrayRandomS);
        SelectionSort(largestArrayRandomS);

        System.out.print("\nNow Performing Merge Sort on Random Input\n");
        MergeSort(smallArrayRandomM, 0, SMALL - 1);
        MergeSort(small2ArrayRandomM, 0, SMALL2 - 1);
        MergeSort(small3ArrayRandomM, 0, SMALL3 - 1);
        MergeSort(mediumArrayRandomM, 0, MEDIUM - 1);
        MergeSort(medium2ArrayRandomM, 0, MEDIUM2 - 1);
        MergeSort(medium3ArrayRandomM, 0, MEDIUM3 - 1);
        MergeSort(largeArrayRandomM, 0, LARGE - 1);
        MergeSort(large2ArrayRandomM, 0, LARGE2 - 1);
        MergeSort(large3ArrayRandomM, 0, LARGE3 - 1);
        MergeSort(largestArrayRandomM, 0, LARGEST - 1);

        System.out.print("\nNow Performing Quick Sort on Random Input\n");
        QuickSort(smallArrayRandomQ, 0, SMALL - 1);
        QuickSort(small2ArrayRandomQ, 0, SMALL2 -1);
        QuickSort(small3ArrayRandomQ, 0, SMALL3 - 1);
        QuickSort(mediumArrayRandomQ, 0, MEDIUM -1);
        QuickSort(medium2ArrayRandomQ, 0, MEDIUM2 -1);
        QuickSort(medium3ArrayRandomQ, 0, MEDIUM3 - 1);
        QuickSort(largeArrayRandomQ, 0, LARGE -1);
        QuickSort(large2ArrayRandomQ, 0, LARGE2 - 1);
        QuickSort(large3ArrayRandomQ, 0, LARGE3 - 1);
        QuickSort(largestArrayRandomQ, 0, LARGEST -1);

        // Sorted
        System.out.print("\nNow Performing Selection Sort on Sorted Input\n");
        SelectionSort(smallArraySortedS);
        SelectionSort(small2ArraySortedS);
        SelectionSort(small3ArraySortedS);
        SelectionSort(mediumArraySortedS);
        SelectionSort(medium2ArraySortedS);
        SelectionSort(medium3ArraySortedS);
        SelectionSort(largeArraySortedS);
        SelectionSort(large2ArraySortedS);
        SelectionSort(large3ArraySortedS);
        SelectionSort(largestArraySortedS);

        System.out.print("\nNow Performing Merge Sort on Sorted Input\n");
        MergeSort(smallArraySortedM, 0, SMALL - 1);
        MergeSort(small2ArraySortedM, 0, SMALL2 - 1);
        MergeSort(small3ArraySortedM, 0, SMALL3 - 1);
        MergeSort(mediumArraySortedM, 0, MEDIUM - 1);
        MergeSort(medium2ArraySortedM, 0, MEDIUM2 - 1);
        MergeSort(medium3ArraySortedM, 0, MEDIUM3 - 1);
        MergeSort(largeArraySortedM, 0, LARGE - 1);
        MergeSort(large2ArraySortedM, 0, LARGE2 - 1);
        MergeSort(large3ArraySortedM, 0, LARGE3 - 1);
        MergeSort(largestArraySortedM, 0, LARGEST - 1);

        System.out.print("\nNow Performing Quick Sort on Sorted Input\n");
        /*
        QuickSort(smallArraySortedQ, 0, SMALL - 1);
        QuickSort(small2ArraySortedQ, 0, SMALL2 - 1);
        QuickSort(small3ArraySortedQ, 0, SMALL3 - 1);
        QuickSort(mediumArraySortedQ, 0, MEDIUM - 1);
        QuickSort(medium2ArraySortedQ, 0, MEDIUM2 - 1);
        QuickSort(medium3ArraySortedQ, 0, MEDIUM3 - 1);
        QuickSort(largeArraySortedQ, 0, LARGE - 1);
        QuickSort(large2ArraySortedQ, 0, LARGE2 - 1);
        QuickSort(large3ArraySortedQ, 0, LARGE3 - 1);
        QuickSort(largestArraySortedQ, 0, LARGEST - 1);
        */


        // Reverse sorted
        System.out.print("\nNow Performing Selection Sort on Reverse Sorted Input\n");
        SelectionSort(smallArrayReverseS);
        SelectionSort(small2ArrayReverseS);
        SelectionSort(small3ArrayReverseS);
        SelectionSort(mediumArrayReverseS);
        SelectionSort(medium2ArrayReverseS);
        SelectionSort(medium3ArrayReverseS);
        SelectionSort(largeArrayReverseS);
        SelectionSort(large2ArrayReverseS);
        SelectionSort(large3ArrayReverseS);
        SelectionSort(largestArrayReverseS);

        System.out.print("\nNow Performing Merge Sort on Reverse Sorted Input\n");
        MergeSort(smallArrayReverseM, 0, SMALL - 1);
        MergeSort(small2ArrayReverseM, 0, SMALL2 - 1);
        MergeSort(small3ArrayReverseM, 0, SMALL3 - 1);
        MergeSort(mediumArrayReverseM, 0, MEDIUM - 1);
        MergeSort(medium2ArrayReverseM, 0, MEDIUM2 - 1);
        MergeSort(medium3ArrayReverseM, 0, MEDIUM3 - 1);
        MergeSort(largeArrayReverseM, 0, LARGE - 1);
        MergeSort(large2ArrayReverseM, 0,LARGE2 - 1);
        MergeSort(large3ArrayReverseM, 0, LARGE3 - 1);
        MergeSort(largestArrayReverseM, 0, LARGEST - 1);

        System.out.print("\nNow Performing Quick Sort on Reverse Sorted Input\n");
        /*
        QuickSort(smallArrayReverseQ, 0, SMALL - 1);
        QuickSort(small2ArrayReverseQ, 0, SMALL2 - 1);
        QuickSort(small3ArrayReverseQ, 0, SMALL3 - 1);
        QuickSort(mediumArrayReverseQ, 0, MEDIUM - 1);
        QuickSort(medium2ArrayReverseQ, 0, MEDIUM2 - 1);
        QuickSort(medium3ArrayReverseQ, 0, MEDIUM3 - 1);
        QuickSort(largeArrayReverseQ, 0, LARGE - 1);
        QuickSort(large2ArrayReverseQ, 0, LARGE2 - 1);
        QuickSort(large3ArrayReverseQ, 0, LARGE3 - 1);
        QuickSort(largestArrayReverseQ, 0, LARGEST - 1);
        */
    }
}
