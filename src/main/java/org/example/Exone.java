package org.example;

import javax.xml.namespace.QName;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Exone {
    public static void main(String[] args) {
        new Sol3().run();
        new Sol2().run();
        new Sol4().run();
    }
}
class Sol3 {
    public void run () {

        Person person1 = new Person("홍길동", 22, 170.5);

    }
}
class Person {
    String name;
    int age;
    double height;
    
    Person (String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }
}


class Sol2 {
    public void run() {
        HashMap<String, Object> person1 = new HashMap<String, Object>();
        person1.put("name", "홍길동");
        person1.put("age", "22");
        System.out.println("제 이름은 " + person1.get("name") + "이고,");
        System.out.println("나이는 " + person1.get("age") + "살 입니다.");
    }
}

class Sol4 {
    void run() {
        ArrayList<Integer> arr = new ArrayList<>();
        //10 - 50 까지 출력
        // 합계출력
        // 평균출력
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);
        arr.add(50);
        int sum = (arr.get(0) + arr.get(1) + arr.get(2) + arr.get(3) + arr.get(4));
        System.out.println(sum);
        System.out.println(sum / arr.size());
    }
}