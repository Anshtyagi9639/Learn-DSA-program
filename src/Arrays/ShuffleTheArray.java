package Arrays;

import java.util.Arrays;

public class ShuffleTheArray {
    static void main(String[] args) {
        int[] arr = {2,5,1,3,4,7};
        int n = 3;
        int[] ans = shuffle(arr, n);
        System.out.println(Arrays.toString(ans));
    }

    static int[] shuffle(int[] arr, int n){
        int[] ans = new int[arr.length];
        int k = 0;
        for (int i = 0; i < n; i++) {
            ans[k++] = arr[i];
            ans[k++] = arr[i + n];
        }
        return ans;

    }
}
