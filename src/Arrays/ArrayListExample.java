package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(10);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(1);
        list.add(21);
        list.add(22);
        list.add(24);
        list.add(25);
        list.add(26);

//        System.out.println(list.contains(26));
//        System.out.println(list.set(3,33));
//        System.out.println(list.remove(6));
//        System.out.println(list.get(8));
//
//        System.out.println(list);

        inputScanner(list);
    }

    static void inputScanner (ArrayList<Integer> list) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            list.add(sc.nextInt());
        }

        // print the
        for (int i = 0; i < 6; i++) {
            System.out.print(list.get(i));
        }
        System.out.println();
    }
}
