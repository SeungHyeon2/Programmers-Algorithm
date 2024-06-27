package org.example.level2.level1;

import java.util.ArrayList;
import java.util.Collections;

public class lessons138477 {
    public static void main(String[] args) {
        int k = 3;
        int[] score = {10, 100, 20, 150, 1, 100, 200};
        // int[] score = {0, 300, 40, 300, 20, 70, 150, 50, 500, 1000};
        solution(k, score);
    }


    public static int[] solution(int k, int[] score){
        int[] answer = new int[score.length];
        ArrayList<Integer> al = new ArrayList<>();

        for (int i = 0; i < score.length; i++) {
            if(al.size() < k){
                al.add(score[i]);
                Collections.sort(al);
                answer[i] = al.get(0);
                continue;
            }

            if(al.size() == k){
                int minNum = al.get(0);

                if(minNum < score[i]){
                    al.remove(0);
                    al.add(score[i]);
                    Collections.sort(al);
                }

                answer[i] = al.get(0);
            }
        }

        return answer;
    }
}
