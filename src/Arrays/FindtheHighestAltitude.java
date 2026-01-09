package Arrays;

public class FindtheHighestAltitude {
    static void main(String[] args) {
        int[] arr = {-4,-3,-2,-1,4,3,2};
        int ans = highestAltitude(arr);
        System.out.println(ans);
    }
    static int highestAltitude(int[] arr){
        int altribute = 0;
        for (int i = 0; i < arr.length; i++) {
            altribute += arr[i];
            if (altribute > 0){
                return altribute;
            }
        }
        return 0;
    }
}
