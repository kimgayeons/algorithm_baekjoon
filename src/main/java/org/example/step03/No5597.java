package org.example.step03;

import java.util.Arrays;
import java.util.Scanner;

public class No5597 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean studentArray[] = new boolean[31];

        for (int i = 0; i < 28; i++) {
            int num = sc.nextInt();
            studentArray[num] = true;
        }
        sc.close();
        //System.out.println(Arrays.toString(studentArray));
        for (int i = 1; i < 31; i++) {
            if(!studentArray[i]){
                System.out.println(i);
            }
        }
    }
}
