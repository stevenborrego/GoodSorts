package com.company;

import java.util.Random;

public class Main {

    public static void SelectionSort(int [] array) {

        int arrayLength = array.length;

        for (int i = 0; i < arrayLength - 1; i++){

            int min = i;

            for(int j = i + 1; j < arrayLength; j++) {
                if(array[j] < array[min])
                    min = j;
            }

            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;

        }

    }

    public static void MergeSort(int [] array) {

    }

    public static void QuickSort(int [] array) {

    }

    public static void Initialize(int [] smallArray, int [] mediumArray, int [] largeArray) {

        Random rand = new Random();

        // initializes arrays with random int 0-99
        for(int i = 0; i < 100; ++i){
           smallArray[i] = rand.nextInt(100);
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
