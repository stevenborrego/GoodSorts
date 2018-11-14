package com.company;

import java.util.Random;

public class Main {

    public static void SelectionSort() {

    }

    public static void MergeSort() {

    }

    public static void QuickSort() {

    }

    public static void Initialize() {

        Random rand = new Random();

        int [] smallArray = new int [100];
        int [] mediumArray = new int [1000];
        int [] largeArray = new int [10000];

        // initializes arrays with random int 0-99
        for(int i = 0; i < 100; ++i){
           smallArray[i] = rand.nextInt(100);
        }

        for(int i = 0; i < 1000; ++i){
            mediumArray[i] = rand.nextInt(100);
        }

        for(int i = 0; i < 10000; ++i){
            largeArray[i] = rand.nextInt(100);
        }
    }

    public static void main(String[] args) {
	// write your code here

        System.out.print("Welcome to ASS");

        Initialize();
    }
}
