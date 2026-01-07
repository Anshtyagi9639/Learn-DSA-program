package LinearSearch;

public class FirstProgramLinearSearch {
    static void main(String[] args) {
        int[] arr = {22,33,44,55,66,7,77};
        System.out.println(search(arr,44));
    }

    static int search(int[] arr, int target){
        if (arr.length == 0){
            return -1;
        }
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] == target){
                return index;
            }
        }
        return -1;
    }
}
