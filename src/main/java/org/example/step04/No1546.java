package org.example.step04;

import java.util.Arrays;
import java.util.Scanner;

public class No1546 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        * 첫번째 줄은 과목수 : count
        * 각각 과목수별 점수 : int score[] = new int[count]
        * 최고 점수 구하기 : max
        * score[i] / max * 100
        * */
        int count = sc.nextInt();
        int score[] = new int[count];
        double sum = 0;

        for (int i = 0; i < count; i++) {
            score[i] += sc.nextInt();
        }
        double max = Arrays.stream(score).max().getAsInt();
        sc.close();

        for (int i = 0; i < count; i++) {
            sum += (score[i]/max) * 100;
            System.out.println("sum:"+sum);
        }
        System.out.println(sum/count);


    }
}
