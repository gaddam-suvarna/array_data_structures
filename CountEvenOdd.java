package org.example;

import java.util.Scanner;

public class CountEvenOdd {
    public static void main(String[] args) {

        //Read the array size
        System.out.println("Enter the array size");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //Create an array
        int array[] = new int[n];

        //Read the array Elements
        System.out.println("Enter the array Elements");
        for(int i = 0; i < n; i++) {
            array[i] = sc.nextInt();

        }

        //Initializing the count variables
        int evencount = 0;
        int oddcount = 0;
       for(int i = 0; i < n; i++) {

            //Check even or odd Numbers
           if(array[i] %2 == 0) {
               evencount++;

           }
           else {
               oddcount++;
           }
       }
       // Display the Even and Odd counts

        System.out.println("Even count is: "  +evencount);
        System.out.println("Odd count is: "  +oddcount);



    }

}
