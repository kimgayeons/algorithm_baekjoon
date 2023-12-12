package org.example.step02;

import java.util.Scanner;

public class No2753 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        sc.close();

        /*4의 배수
        * 100의 배수가 아니거나 400의 배수 일때
        * */
        if(year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)){
            System.out.println("1");
        }else {
            System.out.println("0");
        }
    }
}
