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

        System.out.print("Selection Sort has completed in " + duration + "seconds.");
    }

    public static void MergeSort(int [] array) {
        LocalDateTime start = LocalDateTime.now();


        LocalDateTime end = LocalDateTime.now();
        Duration duration = Duration.between(start, end);

        System.out.print("Merge Sort has completed in " + duration + "seconds.");
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

        System.out.print("Quick Sort has completed in " + duration + "seconds.");
    }

    public static void Initialize(int [] smallArray, int [] mediumArray, int [] largeArray) {

        Random rand = new Random();

        // initializes arrays with random int 0-99
        for(int i = 0; i < 100; ++i){
           smallArray[i] = rand.nextInt(100);

           System.out.print(smallArray[i] + "\n");
        }
        System.out.print("The Small array has been initialized with 100 integers.\n");

        for(int i = 0; i < 1000; ++i){
            mediumArray[i] = rand.nextInt(100);
        }
        System.out.print("The Medium array has been initialized with 1,000 integers.\n");

        for(int i = 0; i < 10000; ++i){
            largeArray[i] = rand.nextInt(100);
        }
        System.out.print("The Large array has been initialized with 10,000 integers.\n");
    }

    public static void main(String[] args) {
	// write your code here

        System.out.print("Welcome to ASS\n");

        int [] smallArray = new int [100];
        int [] mediumArray = new int [1000];
        int [] largeArray = new int [10000];

        Initialize(smallArray, mediumArray, largeArray);
    }
}
