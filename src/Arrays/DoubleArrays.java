package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class DoubleArrays {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the double Array for ->");
        int[][] arr = new int[3][3];
        // Insert the array
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = sc.nextInt();
            }
        }

        // output the array
        for (int[] a : arr){
            System.out.println(Arrays.toString(a));
        }
    }
}
