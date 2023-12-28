package org.example.step06;

import java.util.Scanner;

public class No10988 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        int textLength = text.length();
        boolean p = false;
        for (int i = 0; i < textLength; i++) {
            char first = text.charAt(i);
            char last = text.charAt((textLength-1)-i);

            if(first!=last){
                System.out.println("0");
                return;
            }
        }
        System.out.println("1");

    }
}
