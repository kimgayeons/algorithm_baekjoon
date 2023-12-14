package org.example.step03;

import java.util.Scanner;

public class No10807 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();/*총 N개의 갯수*/

        int[] arr = new int[N];/*배열의 크기*/
        for (int i = 0; i < N; i++) {
            arr[i] += sc.nextInt();
        }

        int v = sc.nextInt();/*배열의 찾는 값*/
        int count = 0;

        for (int i = 0; i < N; i++) {
            if(arr[i] == v){
                count++;
            }
        }
        System.out.println(count);
    }
}
