package LinearSearch;

public class RichestWealth {
    static void main(String[] args) {
        int[][] arr = {
                {12,23,34},
                {22,33,44},
                {55,22,11}
        };
        int ans = maximum(arr);
        System.out.println(ans);
    }

    static int maximum(int[][] arr){
        int ans = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int maxsum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                maxsum += arr[i][j];
            }
            if (ans < maxsum){
                ans = maxsum;
            }
        }
        return ans;
    }
}
