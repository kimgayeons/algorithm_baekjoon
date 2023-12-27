package org.example.step05;

import java.util.Scanner;

public class No11654 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x = sc.next();
        int result = x.charAt(0);
        /*아스키 코드로 출력하고 싶을때는
        * 아스키코드는 정수로 이루어져 있으므로 String 값으로 받은
        * 변수를 int 타입으로 변환하여 아스키 코드값으로 저장
        *  */
        System.out.println(result);
    }
}
