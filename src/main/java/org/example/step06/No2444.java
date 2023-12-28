package org.example.step06;

import java.util.Scanner;

public class No2444 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*총완성본
        *   oooox
         *  oooxxx
         *  ooxxxxx
         *  oxxxxxxx
         *  xxxxxxxxx
         *  oxxxxxxx
         *  ooxxxxx
         *  oooxxx
         *  oooox
        * */
        /*
         *  oooox
         *  oooxxx
         *  ooxxxxx
         *  oxxxxxxx
         *  xxxxxxxxx
        * 첫번째줄 o:4개 x:1개
        * 두번째줄 o:3개 x:3개
        * 세번째줄 o:2개 x:5개
        * 네번째줄 o:1개 x:7개
        * 다섯번째줄 o:0개 x:9개
        * o은 1씩 감소 f-1
        * x은 2씩 증가 2i+1
        * f는 몇줄 출력 될지 ex:5 총 2f-1
        * */
        int f = sc.nextInt();
        //int f = 5;
        for (int i = 0; i < f; i++) {
            for (int o = (f-1); o > i; o--) {
                //System.out.print("o");
                System.out.print(" ");
            }
            for (int x = 0; x < (2*i+1); x++) {
                System.out.print("*");
            }
            System.out.println("");
        }

       /*  oxxxxxxx
        *  ooxxxxx
        *  oooxxx
        *  oooox
        *  첫번째줄 o:1개 x:7개
        *  두번째줄 o:2개 x:5개
        *  세번째줄 o:3개 x:3개
        *  네번째줄 o:4개 x:1개
        *  줄수는 f-1개
        *  o는 1씩 증가
        *  x는 2씩 감소
        * */

        for (int i = f-1; i > 0; i--) {
            for (int o = 0; o < f-i; o++) {
                System.out.print(" ");
            }
            for (int x = 0; x < 2*i-1; x++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
