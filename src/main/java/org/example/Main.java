package org.example;

import java.util.ArrayList;
//Array 리스트 임포트 되어 있는지 항상 확인.
public class Main {
    public static void main(String[] args) {
        int [] arr = new int[3];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;

        System.out.println(arr[0] + arr[1] + arr[2]);
        System.out.println(arr.length);

        ArrayList<Integer> arr2 = new ArrayList<Integer>();
        arr2.add(10);
        arr2.add(20);
        arr2.add(30);

        System.out.println(arr2.get(0) + arr2.get(1) + arr2.get(2));
        //값을 가져올때는 get 리스트 길이? 가져올때는 size
        //array list는 가변적
        // [] > add / length > size
        System.out.println(arr2.size());
        arr2.add(40);
        System.out.println(arr2.size());

    }
}