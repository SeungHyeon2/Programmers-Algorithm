package org.example.level1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.IntStream;

public class lessons68935 {

    public static void main(String[] args) {
        int n = 125;
        solution(n);
    }

    public static int solution(int n) {
        int answer = 0;
        ArrayList<Integer> ai = new ArrayList<>();

        while(n>0){
            ai.add(n%3);
            n = n/3;
        }

//        StringBuilder sb = new StringBuilder();
//        for(long i : ai){
//            sb.append(i);
//        }

        for(int i = 0; i < ai.size(); i++){
            answer += (Math.pow(3, ai.size()-i-1) * ai.get(i));
        }

        System.out.println(answer);
        return answer;
    }
}
