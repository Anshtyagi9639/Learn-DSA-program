package Arrays;

import java.util.Arrays;

public class RunningSum {
    static void main(String[] args) {
        int[] arr = {1,2 ,3,4,5};
        int[] ans = runningSum(arr);
        System.out.println(Arrays.toString(ans));
    }

    static int[] runningSum(int[] arr){
        int[] ans = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j <= i; j++) {
                sum += arr[j];
            }
            ans[i] = sum;
        }
        return ans;
    }
}
