package org.example.step02;

import java.util.Scanner;

public class No2884 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        int minute = sc.nextInt();
        sc.close();

        /*if(minute > 45){
            minute -= 45;
        }else{
            minute = 60 + (minute - 45);
            hour--;
            if(hour<0) {
                hour=23;
            }
        }*/
        if(minute<45){
            minute = 60 + (minute-45);
            hour--;
            if(hour < 0){
                hour = 23;
            }
        }else{
            minute -=45;
        }

        System.out.println(hour +" "+ minute);
    }
}
