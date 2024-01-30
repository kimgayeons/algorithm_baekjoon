package org.example.step07;

import java.util.Scanner;

public class No2738 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("n값을 입력해주세요.");
        int n = sc.nextInt();
        System.out.println("m값을 입력해주세요.");
        int m = sc.nextInt();

        int nArr[][] = new int[n][m];
        int mArr[][] = new int[n][m];
        int sumArr[][] = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.println("nArr["+i+"] j의 값을 입력해주세요");
                nArr[i][j] = sc.nextInt();
            }
        }


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.println("mArr["+i+"] j의 값을 입력해주세요");
                mArr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                sumArr[i][j] = nArr[i][j]+mArr[i][j];
                System.out.print(sumArr[i][j] +" ");
            }
            System.out.println("");
        }
    }
}
