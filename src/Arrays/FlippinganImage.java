package Arrays;

import java.util.Arrays;

public class FlippinganImage {
    public static void main(String[] args) {
        int[][] arr = {
                {1,1,0},
                {1,0,1},
                {0,0,0}
        };

        int[][] ans = flipAndInvertImage(arr);

        // print 2D array
        for (int[] row : ans) {
            System.out.println(Arrays.toString(row));
        }
    }

    static int[][] flipAndInvertImage(int[][] image) {

        for (int i = 0; i < image.length; i++) {
            int left = 0;
            int right = image[i].length - 1;

            while (left <= right) {

                // swap + invert
                int temp = image[i][left] ^ 1;
                image[i][left] = image[i][right] ^ 1;
                image[i][right] = temp;

                left++;
                right--;
            }
        }
        return image;
    }
}
