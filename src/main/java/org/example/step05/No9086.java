package org.example.step05;

import java.util.Arrays;
import java.util.Scanner;

public class No9086 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = Integer.parseInt(sc.nextLine());
        String arr[] = new String[x];

        for (int i = 0; i < x; i++) {
            arr[i] = sc.nextLine();
        }
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < x; i++) {
            System.out.println(arr[i].charAt(0)+""+arr[i].charAt(arr[i].length()-1));
        }
    }
}
