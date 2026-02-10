import java.util.Scanner;
public class AlternateElements {

    public  static void main(String[] args) {
        //Enter the array size
        System.out.println("Enter the size");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int array[] = new int[n];
        //Enter the array elements
        System.out.println("Enter the elements");
        for(int i = 0; i < n ; i ++) {
            array[i] = sc.nextInt();
        }
        //print the alternate elements
        System.out.println("Alternate elements are");
        for(int i = 0; i < n ; i += 2) {
            System.out.println(array[i]);

        }


        }

    }

//Static allocation
     /*static int arr[] = {10,20,30,40,50};
    // Iterate over all alternate elements
    public static void main(String[] args) {
        System.out.println("Alternate numbers from array");

        System.out.println(arr[0]);
        System.out.println(arr[2]);
        System.out.println(arr[4]);


        }*/

