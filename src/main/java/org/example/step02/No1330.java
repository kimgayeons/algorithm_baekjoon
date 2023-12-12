package org.example.step02;

import java.util.Scanner;

public class No1330 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        sc.close();
        /*if문으로 할경우*/
        /*if (A > B){
            System.out.println(">");
        }else if(A == B){

            System.out.println("==");
        }else if(A < B){
            System.out.println("<");
        }*/

        String str = (A>B) ? ">" : ((A < B) ? "<" : "==");
        System.out.println(str);
    }
}
