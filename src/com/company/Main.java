package com.company;

import jdk.vm.ci.meta.Local;

import java.util.Random;
import java.time.Duration;
import java.time.LocalDateTime;

public class Main {

    public static void SelectionSort(int [] array) {
        LocalDateTime start = LocalDateTime.now();


        LocalDateTime end = LocalDateTime.now();
        Duration duration = Duration.between(start, end);

        System.out.print("Selection Sort has completed in " + duration + "seconds.");
    }

    public static void MergeSort(int [] array) {
        LocalDateTime start = LocalDateTime.now();


        LocalDateTime end = LocalDateTime.now();
        Duration duration = Duration.between(start, end);

        System.out.print("Merge Sort has completed in " + "seconds.");
    }

    public static void QuickSort(int [] array) {
        LocalDateTime start = LocalDateTime.now();


        LocalDateTime end = LocalDateTime.now();
        Duration duration = Duration.between(start, end);

        System.out.print("Quick Sort has completed in " + "seconds.");
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
