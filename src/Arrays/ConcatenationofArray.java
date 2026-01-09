package Arrays;

import java.util.Arrays;

public class ConcatenationofArray {
    static void main(String[] args) {
        int[] arr = {1,2,3};
        int[] ans = concatenation(arr);
        System.out.println(Arrays.toString(ans));
    }

    static int[] concatenation(int[] arr){
        int[] ans = new int[arr.length * 2];
        for (int i = 0; i < arr.length; i++) {
            ans[i] = arr[i];
            ans[i + arr.length] = arr[i];
        }
        return ans;
    }
}
