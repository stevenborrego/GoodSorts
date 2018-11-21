package com.company;

import java.util.Random;
import java.time.Duration;
import java.time.LocalDateTime;

public class Main {

    public static int SMALL = 1000;
    public static int MEDIUM = 10000;
    public static int LARGE = 100000;

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

        System.out.print("Selection Sort has completed in " + duration + " seconds.\n");
    }

    public static void MergeSort(int [] array) {
        LocalDateTime start = LocalDateTime.now();


        LocalDateTime end = LocalDateTime.now();
        Duration duration = Duration.between(start, end);

        System.out.print("Merge Sort has completed in " + duration + " seconds.\n");
    }

    public static int HoaresPartition(int [] array, int low, int high){
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

    public static void QuickSort(int [] array) {
        LocalDateTime start = LocalDateTime.now();




        LocalDateTime end = LocalDateTime.now();
        Duration duration = Duration.between(start, end);

        System.out.print("Quick Sort has completed in " + duration + " seconds.\n");
    }

    public static void Initialize(int [] smallArray, int [] mediumArray, int [] largeArray) {

        Random rand = new Random();

        // initializes arrays with random int 0-99
        for(int i = 0; i < SMALL; ++i){
           smallArray[i] = rand.nextInt(100);

           //System.out.print(smallArray[i] + "\n");
        }
        System.out.print("The Small array has been initialized with 1,000 randomized integers.\n");

        for(int i = 0; i < MEDIUM; ++i){
            mediumArray[i] = rand.nextInt(100);
        }
        System.out.print("The Medium array has been initialized with 10,000 randomized integers.\n");

        for(int i = 0; i < LARGE; ++i){
            largeArray[i] = rand.nextInt(100);
        }
        System.out.print("The Large array has been initialized with 100,000 randomized integers.\n");
    }

    public static void CopyArray(int [] smallSource, int [] medSource, int [] largeSource, int [] smallDest, int [] medDest, int [] largeDest) {
       for (int i = 0; i < SMALL; ++i) {
           smallDest[i] = smallSource[i];
       }
        for (int i = 0; i < MEDIUM; ++i) {
           medDest[i] = medSource[i];
        }
        for (int i = 0; i < LARGE; ++i) {
           largeDest[i] = largeSource[i];
        }
    }

    public static void InitializeSorted(int [] smallArray, int [] medArray, int [] largeArray) {
        for(int i = 0; i < SMALL; ++i) {
            smallArray[i] = i;
        }
        for(int i = 0; i < MEDIUM; ++i) {
            medArray[i] = i;
        }
        for(int i = 0; i < LARGE; ++i) {
            largeArray[i] = i;
        }
    }

    public static void InitializeReverseSorted(int [] smallArray, int [] medArray, int [] largeArray) {
        for(int i = SMALL - 1; i > 0; --i) {
            smallArray[i] = i;
        }
        for(int i = MEDIUM - 1; i > 0; --i) {
            medArray[i] = i;
        }
        for(int i = LARGE - 1; i > 0; --i) {
            largeArray[i] = i;
        }
    }

    public static void main(String[] args) {

        System.out.print("Welcome to ASS\n");

        // S = Selection Sort
        // M = Merge Sort
        // Q = Quick Sort

        // random arrays
        int [] smallArrayRandomS = new int [SMALL];
        int [] mediumArrayRandomS = new int [MEDIUM];
        int [] largeArrayRandomS = new int [LARGE];

        int [] smallArrayRandomM = new int [SMALL];
        int [] mediumArrayRandomM = new int [MEDIUM];
        int [] largeArrayRandomM = new int [LARGE];

        int [] smallArrayRandomQ = new int [SMALL];
        int [] mediumArrayRandomQ = new int [MEDIUM];
        int [] largeArrayRandomQ = new int [LARGE];


        // sorted arrays
        int [] smallArraySortedS = new int [SMALL];
        int [] mediumArraySortedS = new int [MEDIUM];
        int [] largeArraySortedS = new int [LARGE];

        int [] smallArraySortedM = new int [SMALL];
        int [] mediumArraySortedM = new int [MEDIUM];
        int [] largeArraySortedM = new int [LARGE];

        int [] smallArraySortedQ = new int [SMALL];
        int [] mediumArraySortedQ = new int [MEDIUM];
        int [] largeArraySortedQ = new int [LARGE];

        // reverse sorted arrays
        int [] smallArrayReverseS = new int [SMALL];
        int [] mediumArrayReverseS = new int [MEDIUM];
        int [] largeArrayReverseS = new int [LARGE];

        int [] smallArrayReverseM = new int [SMALL];
        int [] mediumArrayReverseM = new int [MEDIUM];
        int [] largeArrayReverseM = new int [LARGE];

        int [] smallArrayReverseQ = new int [SMALL];
        int [] mediumArrayReverseQ = new int [MEDIUM];
        int [] largeArrayReverseQ = new int [LARGE];


        // random
        Initialize(smallArrayRandomS, mediumArrayRandomS, largeArrayRandomS); // selection sort
        CopyArray(smallArrayRandomS, mediumArrayRandomS, largeArrayRandomS, smallArrayRandomM, mediumArrayRandomM, largeArrayRandomM); // Merge Sort
        CopyArray(smallArrayRandomS, mediumArrayRandomS, largeArrayRandomS, smallArrayRandomQ, mediumArrayRandomQ, largeArrayRandomQ); // Quick Sort

        // sorted
        InitializeSorted(smallArraySortedS, mediumArraySortedS, largeArraySortedS);
        CopyArray(smallArraySortedS, mediumArraySortedS, largeArraySortedS, smallArraySortedM, mediumArraySortedM, largeArraySortedM);
        CopyArray(smallArraySortedS, mediumArraySortedS, largeArraySortedS, smallArraySortedQ, mediumArraySortedQ, largeArraySortedQ);

        // reverse sorted
        InitializeReverseSorted(smallArrayReverseS, mediumArrayReverseS, largeArrayReverseS);
        CopyArray(smallArrayReverseS, mediumArrayReverseS, largeArrayReverseS, smallArrayReverseM, mediumArrayReverseM, largeArrayReverseM);
        CopyArray(smallArrayReverseS, mediumArrayReverseS, largeArrayReverseS, smallArrayReverseQ, mediumArrayReverseQ, largeArrayReverseQ);

        // let the sorting begin!!

        // Random
        System.out.print("Now Performing Selection Sort on Random Input\n");
        SelectionSort(smallArrayRandomS);
        SelectionSort(mediumArrayRandomS);
        SelectionSort(largeArrayRandomS);

        System.out.print("Now Performing Merge Sort on Random Input\n");
        MergeSort(smallArrayRandomM);
        MergeSort(mediumArrayRandomM);
        MergeSort(largeArrayRandomM);

        System.out.print("Now Performing Quick Sort on Random Input\n");
        QuickSort(smallArrayRandomQ);
        QuickSort(mediumArrayRandomQ);
        QuickSort(largeArrayRandomQ);

        // Sorted
        System.out.print("Now Performing Selection Sort on Sorted Input\n");
        SelectionSort(smallArraySortedS);
        SelectionSort(mediumArraySortedS);
        SelectionSort(largeArraySortedS);

        System.out.print("Now Performing Merge Sort on Sorted Input\n");
        MergeSort(smallArraySortedM);
        MergeSort(mediumArraySortedM);
        MergeSort(largeArraySortedM);

        System.out.print("Now Performing Quick Sort on Sorted Input\n");
        QuickSort(smallArraySortedQ);
        QuickSort(mediumArraySortedQ);
        QuickSort(largeArraySortedQ);


        // Reverse sorted
        System.out.print("Now Performing Selection Sort on Reverse Sorted Input\n");
        SelectionSort(smallArrayReverseS);
        SelectionSort(mediumArrayReverseS);
        SelectionSort(largeArrayReverseS);

        System.out.print("Now Performing Merge Sort on Reverse Sorted Input\n");
        MergeSort(smallArrayReverseM);
        MergeSort(mediumArrayReverseM);
        MergeSort(largeArrayReverseM);

        System.out.print("Now Performing Quick Sort on Reverse Sorted Input\n");
        QuickSort(smallArrayReverseQ);
        QuickSort(mediumArrayReverseQ);
        QuickSort(largeArrayReverseQ);
    }
}
