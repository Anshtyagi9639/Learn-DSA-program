package LinearSearch;

import java.util.Arrays;

public class TwoDarraySearch {
    static void main(String[] args) {
        int[][] arr = {
                {22,33,44,55},
                {43,5,4,53},
                {21,34,56,76}
        };
        int target = 53;
        int[] ans = seach2dArray(arr, target);
        System.out.println(Arrays.toString(ans));
        System.out.println(maximumElement(arr));
    }

    static int[] seach2dArray(int[][] arr, int target){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == target){
                    return new int[] {i,j};
                }
            }
        }
        return new int[] {-1, -1};
    }

    static int maximumElement(int[][] arr){
        int max = Integer.MIN_VALUE;
        for (int[] its : arr){
            for (int element : its){
                if (element > max){
                    max = element;
                }
            }
        }
        return max;
    }
}
