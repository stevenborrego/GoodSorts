package com.company;

import java.util.Random;
import java.time.Duration;
import java.time.LocalDateTime;

public class Main {

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
        for(int i = 0; i < 1000; ++i){
           smallArray[i] = rand.nextInt(100);

           //System.out.print(smallArray[i] + "\n");
        }
        System.out.print("The Small array has been initialized with 1,000 randomized integers.\n");

        for(int i = 0; i < 10000; ++i){
            mediumArray[i] = rand.nextInt(100);
        }
        System.out.print("The Medium array has been initialized with 10,000 randomized integers.\n");

        for(int i = 0; i < 100000; ++i){
            largeArray[i] = rand.nextInt(100);
        }
        System.out.print("The Large array has been initialized with 100,000 randomized integers.\n");
    }

    public static void CopyArray(int [] smallSource, int [] medSource, int [] largeSource, int [] smallDest, int [] medDest, int [] largeDest) {
       for (int i = 0; i < 1000; ++i) {
           smallDest[i] = smallSource[i];
       }
        for (int i = 0; i < 10000; ++i) {
           medDest[i] = medSource[i];
        }
        for (int i = 0; i < 100000; ++i) {
           largeDest[i] = largeSource[i];
        }
    }

    public static void main(String[] args) {

        System.out.print("Welcome to ASS\n");

        int [] smallArray = new int [1000];
        int [] mediumArray = new int [10000];
        int [] largeArray = new int [100000];

        int [] smallArrayM = new int [1000];
        int [] mediumArrayM = new int [10000];
        int [] largeArrayM = new int [100000];

        int [] smallArrayQ = new int [1000];
        int [] mediumArrayQ = new int [10000];
        int [] largeArrayQ = new int [100000];

        Initialize(smallArray, mediumArray, largeArray); // selection sort
        CopyArray(smallArray, mediumArray, largeArray, smallArrayM, mediumArrayM, largeArrayM); // Merge Sort
        CopyArray(smallArray, mediumArray, largeArray, smallArrayQ, mediumArrayQ, largeArrayQ); // Quick Sort


        System.out.print("Now Performing Selection Sort\n");
        SelectionSort(smallArray);
        SelectionSort(mediumArray);
        SelectionSort(largeArray);

        System.out.print("Now Performing Merge Sort\n");
        MergeSort(smallArrayM);
        MergeSort(mediumArrayM);
        MergeSort(largeArrayM);

        System.out.print("Now Performing Quick Sort\n");
        QuickSort(smallArrayM);
        QuickSort(mediumArrayM);
        QuickSort(largeArrayM);
    }
}
