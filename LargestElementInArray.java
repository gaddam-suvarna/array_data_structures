package org.example;
import java.util.Scanner;
public class LargestElementInArray {
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

        //Assuming first element is large
        int max = array[0];

        //Compare Remaining elements
        for(int i = 1; i < n; i++) {

            if(array[i] > max) {

                max = array[i];

            }

        }
            //Print the largest element
            System.out.println("the largest Element in an array is :" +max + " ");

    }
}
