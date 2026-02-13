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



