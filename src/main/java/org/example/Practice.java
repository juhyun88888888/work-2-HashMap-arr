package org.example;

import java.sql.SQLOutput;
import java.util.*;
import java.util.stream.Collectors;

public class Practice {
    public static void main(String[] args) {
        new Sol1().run();
    }

}
class Sol1 {
    public void run() {
        Scanner sc = new Scanner(System.in);
        //int [] numbers = new int[20];
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);

        int numbersIndex = -1;

        while (true) {
            System.out.println("숫자를 입력해주세요(-1: 종료)");
            int num = sc.nextInt();

            if (num == -1) {
                System.out.println("입력을 종료합니다.");
                break;
            }
            numbers.add(num);
        }

        Collections.sort(numbers);


        System.out.println(numbers);
        sc.close();


        //System.out.println("입력한 숫자(오름차순) : %d, %d\n", num1, num2);
    }
}