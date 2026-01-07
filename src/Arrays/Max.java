package Arrays;

public class Max {
    static void main(String[] args) {
        int[] arr = {22,33,44,55,11,64,76,45,98,33};
        System.out.println(max(arr));
        System.out.println(min(arr));
    }

    static int max(int[] arr) {
       int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]){
                max = arr[i];
            }
        }
        return max;
    }

    static int min(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]){
                min = arr[i];
            }
        }
        return min;
    }


}
