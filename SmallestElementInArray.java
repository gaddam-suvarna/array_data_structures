package org.example;

import java.util.Scanner;

public class SmallestElementInArray {

    public static void main(String[] args) {

        //Read the array size
        System.out.println("Enter the array size");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //Create an Array
        int[] array = new int[n];

        //Read the array elements
        System.out.println("Enter the array elements:");
        for(int i = 0; i < n; i++) {
            array[i] = sc.nextInt();

        }

        //Assuming first element is small
        int min = array[0];

        //Compare Remaining elements
        for(int i = 1; i < n; i++) {

            if(array[i] < min) {

                min = array[i];

            }

        }
        //Print the smallest element
        System.out.println("the smallest Element in an array is :" +min + " ");

    }
}
