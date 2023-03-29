package org.example;

import java.util.ArrayList;

public class test {
    public static void main(String[] args) {
        int [] arr = new int[3];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;

        System.out.println(arr[0] + arr[1] + arr[2]);
        System.out.println(arr.length);

        ArrayList<Integer> arr2 = new ArrayList<>();
        arr2.add(10);
        arr2.add(20);
        arr2.add(30);
        arr2.add(40);
        arr2.add(50);
        arr2.add(60);
        arr2.add(70);

        System.out.println(arr2.size());
        System.out.println(arr2.get(1) + arr2.get(2) + arr2.get(3) + arr2.get(4) + arr2.get(5) + arr2.get(6));
        System.out.println(arr2.size());
        System.out.println(arr2.get(5));
        System.out.println(arr2.size());

    }

}
