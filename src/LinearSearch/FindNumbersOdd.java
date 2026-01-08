package LinearSearch;

public class FindNumbersOdd {
    static void main(String[] args) {
        int[] arr = {12, 344, 555, 65, 76543};
        int ans = findNumbers(arr);
        System.out.println(ans);
    }

    static int findNumbers(int[] arr){
        int count = 0;
        for (int ans : arr){
            if (odd(ans)){
                count++;
            }
        }

        return count;
    }

    static boolean odd(int ans){
        int findDigits = digits1(ans);
        if (findDigits % 2 != 0){
            return true;
        }
        return false;

    }

    static int digits(int num){
        int count = 0;
        while(num > 0){
            count++;
            num = num / 10;
        }
        return count;
    }

    static int digits1(int num){
        return (int)(Math.log10(num)) + 1;

    }
}
