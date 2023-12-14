package org.example.step03;

import java.util.Arrays;
import java.util.Scanner;

public class No10871 {
    public static void main(String[] args) {
        /*
        N은 실행할 정수의 모든 값들
        X는 N의 배열에서 X의 값보다 작은값을 찾을때 쓰는 값
        */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();

        /*N의 값들을 넣을 수 있는 배열값*/
        int arr[] = new int[n];

        /*순차적으로 돌면서 N의 값을 넣기*/
        for (int i = 0; i < n; i++) {
            arr[i] += sc.nextInt();
        }
        //System.out.println(Arrays.toString(arr));

        sc.close();
        String arr2 ="";
        for (int j = 0; j < arr.length; j++) {
            if(arr[j] < x){
                arr2+=arr[j]+" ";
            }
        }
        System.out.println(arr2);


    }
}
