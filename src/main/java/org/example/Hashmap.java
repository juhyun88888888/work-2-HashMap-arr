package org.example;

import java.util.ArrayList;
import java.util.HashMap;

public class Hashmap {
    public static void main(String[] arg){


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
        HashMap<String, Integer> arrMap = new HashMap<String,Integer>();
        arrMap.put("영희", 10);
        arrMap.put("철수", 20);
        arrMap.put("길동", 30);

        System.out.println("영희의 나이는" + arrMap.get("영희") + "입니다.");
        System.out.println("철수의 나이는" + arrMap.get("철수") + "입니다.");
        System.out.println("길동의 나이는" + arrMap.get("길동") + "입니다.");
    }
}
