package LinearSearch;

public class FindNumbersEver {
    static void main(String[] args) {
      int[] arr = {12, 345, 2, 6, 72896};
      int ans = findNumbers(arr);
        System.out.println(ans);
    }

    static int findNumbers(int[] arr){
        int count = 0;
        for (int ans : arr){
            if (even(ans)){
                count++;
            }
        }
        return count;
    }

    static boolean even(int num){
        int digitOfNumbers = digitNumber(num);
        if (digitOfNumbers % 2 == 0){
            return true;
        }
        return false;
    }

    static int digitNumber(int num){
        int count = 0;
        while (num > 0){
            count++ ;
            num = num / 10;
        }
        return count;
    }

}
