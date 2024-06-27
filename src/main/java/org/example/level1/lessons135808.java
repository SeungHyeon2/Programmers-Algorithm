package org.example.level1;

import java.util.ArrayList;
import java.util.Collections;

public class lessons135808 {

    public static void main(String[] args) {
        int k = 4;
        int m = 3;
        // int[] score = {1, 2, 3, 1, 2, 3, 1};
        int[] score = {4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2};
        solution(k, m, score);
    }

    // k는 최고점 1점이 최하점
    // m 은 한 상자에 포장하는 수
    // 상자에 담긴 사과 중 가장 낮은 점수는 p
    // 사과 한 상자의 가격은 p * m
    // 사과 한 상자의 가격 = 상자에 담긴 최하점 사과 * 사과 개수
    // score -> 사과들 점수
    // 전략 -> 최하점들을 몰아넣어야 한다

    public static int solution(int k, int m, int[] score) {
        int answer = 0;

        ArrayList<Integer> ai = new ArrayList<>();
        for(int i = 0; i < score.length; i++){
            ai.add(score[i]);
        }
        Collections.sort(ai);
        Collections.reverse(ai);

        int count = 1;
        for (int i = 0; i < ai.size(); i++) {
            if(count == m){
                answer += m*ai.get(i);
                count = 0;
            }
            count++;
        }
        return answer;
    }

}
