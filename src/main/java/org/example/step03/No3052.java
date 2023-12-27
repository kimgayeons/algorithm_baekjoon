package org.example.step03;

import java.util.Arrays;
import java.util.Scanner;

public class No3052 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        * 자연수 X -> int x[] = new int[10]
        * X%42 = y
        * y는 총 몇개가 올지 모름 min1 ~ max 10
        * */
        int x[] = new int[10];
        for (int i = 0; i < 10; i++) {
            x[i] = sc.nextInt()%42;
        }
        System.out.println("b:"+Arrays.toString(x));
        x = Arrays.stream(x).distinct().toArray();
        System.out.println("a:"+Arrays.toString(x));
        System.out.println("size:"+Arrays.stream(x).count());
    }
}
