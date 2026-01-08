package LinearSearch;

public class RichestWealth {
    static void main(String[] args) {
        int[][] arr = {
                {12,23,34},
                {22,33,44},
                {55,22,11}
        };
    }

    static int maximum(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            int maxsum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                maxsum += arr[i][j];
            }
            int max = 0;
            if (maxsum > max){
                max = maxsum;
            }
        }
        return
    }
}
