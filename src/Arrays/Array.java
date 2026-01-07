package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter those number you have insert the array");
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }

        // Print the array
        System.out.println(Arrays.toString(arr));
    }
}
