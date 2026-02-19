package org.example;
import java.util.Scanner;

public class RemoveDuplicatesFromSortedArray {

    // Method to remove duplicates and return new length
    public static int removeDuplicates(int[] array, int n) {
        if (n == 0) return 0;

        int j = 0;

        for (int i = 1; i < n; i++) {
            if (array[i] != array[j]) {
                j++;
                array[j] = array[i];
            }
        }
        return j + 1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the array size:");
        int n = sc.nextInt();

        int[] array = new int[n];

        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        int newLength = removeDuplicates(array, n);

        System.out.println("Length of distinct elements: " + newLength);

        System.out.println("Array after removing duplicates:");
        for (int i = 0; i < newLength; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
