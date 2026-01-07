package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class MultipleArraysList {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter those elements used Array list");
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        // Initialzqtion part
        for (int i = 0; i < 3; i++) {
             list.add(new ArrayList<>());
        }

        // add this part
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                list.get(i).add(sc.nextInt());
            }
        }
        System.out.println(list);
    }
}
