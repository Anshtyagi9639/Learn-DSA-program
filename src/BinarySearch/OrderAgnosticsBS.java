package BinarySearch;

public class OrderAgnosticsBS {
    static void main(String[] args) {
      int[] arr = {22, 11, 6, 2};
      int target = 6;
      int ans = orderAgnostics(arr , target);
        System.out.println(ans);
    }

    static int orderAgnostics(int[] arr, int target){
        int s = 0;
        int e = arr.length - 1;

        boolean isAsc = arr[s] < arr[e];

        while (s <= e){
            int mid = s + (e - s) / 2;

            if (target == arr[mid]){
                return mid;
            }

            if (isAsc){
                if (target < arr[mid]){
                    e = mid - 1;
                } else if (target > arr[mid]) {
                    s = mid + 1;
                }
            }else{
                if (target > arr[mid]){
                    e = mid - 1;
                } else if (target < arr[mid]) {
                    s = mid + 1;
                }
            }
        }
        return -1;
    }
}
