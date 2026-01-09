package Arrays;

import java.util.Arrays;

public class CurrentNumbersCountGreater {
    static void main(String[] args) {
        int[] arr = {8,1,2,2,3};
        int[] ans = currentNumbersCountGreater(arr);
        System.out.println(Arrays.toString(ans));
    }

    static int[] currentNumbersCountGreater(int[] arr){
        int[] ans = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (i != j && arr[j] < arr[i]){
                    count++;
                }
                ans[i] = count;
            }
        }
        return ans;
    }
}
