package org.example.step04;

import java.util.Arrays;
import java.util.Scanner;

public class No10818 {
    public static void main(String[] args) {
        /*
        * n : n개
        * x : 배열로 사용할 리스트
        * 최소값 , 최대값
        * */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] += sc.nextInt();
        }

        sc.close();
        Arrays.sort(arr);
        System.out.println(arr[0]+" "+arr[n-1]);

        /*int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            *//*최대값*//*
            if(max < arr[i]){
                max = arr[i];
            }

            if(min > arr[i]){
                min = arr[i];
            }
        }
        System.out.println(min+" "+max);*/
    }
}
