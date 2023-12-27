package org.example.step04;

import java.util.Scanner;

public class No2562 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[9];
        for (int i = 0; i < 9; i++) {
            arr[i] += sc.nextInt();
        }
        sc.close();

        int maxIndex = 0;
        int max = arr[0];
        for (int i = 0; i < 9; i++) {
            if(max < arr[i]){
                max = arr[i];
                maxIndex = i;
            }
        }
        System.out.println(max);
        System.out.println(maxIndex+1);
    }
}
