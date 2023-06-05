package org.example.level2;

import java.util.ArrayList;

public class lessons42842 {

    public static void main(String[] args) {
        int brown = 10;
        int yellow = 2;
        solution(brown, yellow);
    }

    public static int[] solution(int brown, int yellow) {


        // brown = 가로 * 2 + 세로 * 2 - 4;
        // 가로 >= 세로

        int[] answer = new int[2];


        double total = brown + yellow;

        for(int i = 1; i < total; i++){
            double garo = i;
            double sero = total / garo ;

            if(garo < sero){
                continue;
            }

            if((garo-2) * (sero-2) == yellow){
                answer[0] = (int) garo;
                answer[1] = (int) sero;
                break;
            }


        }

//        System.out.println(answer[0]);
//        System.out.println(answer[1]);

        return answer;
    }

}
