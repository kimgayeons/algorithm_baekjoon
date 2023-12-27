package org.example.step05;

import java.util.Scanner;

public class No1152 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x = sc.nextLine();
        x = x.trim();
        if(!x.isEmpty()){
            int count = x.split(" ").length;
            System.out.println(count);
        }else{
            System.out.println(0);
        }

    }
}
