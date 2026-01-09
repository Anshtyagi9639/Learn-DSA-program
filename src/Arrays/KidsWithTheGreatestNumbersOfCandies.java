package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class KidsWithTheGreatestNumbersOfCandies {
    static void main(String[] args) {
        int[] arr = {2,3,5,1,3};
        int extraCandies = 3;
        ArrayList<Boolean> result =kidsWithCandies(arr, extraCandies);
        System.out.println(result);
    }
    
    static ArrayList<Boolean> kidsWithCandies(int[] arr, int extraCandies){
        ArrayList<Boolean> max = new ArrayList<>();
        int maxCandies = 0;
        for (int i = 0; i < arr.length; i++) {
            maxCandies = Math.max(maxCandies, arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
             max.add(arr[i] + extraCandies >= maxCandies);
        }
        return max;
    }
}