package LinearSearch;

import java.util.Arrays;

public class SearchInString {
    static void main(String[] args) {
        String name = "ansh";
        char ch = 's';
        System.out.println(string1(name,ch));
        System.out.println(Arrays.toString(name.toCharArray()));
    }

    static boolean stringSearch(String name, char ch){
        if (name.length() == 0){
            return false;
        }
        for (int i = 0; i < name.length(); i++) {
            if (ch == name.charAt(i)){
                return true;
            }
        }
        return false;
    }

    static boolean string1(String str, char target){
        if (str.length() == 0){
            return false;
        }
        for (char ch : str.toCharArray()){
            if (ch == target){
                return true;
            }
        }
        return false;
    }
}
