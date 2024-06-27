package org.example.level2.level1;

import java.util.ArrayList;

public class lessons81301 {

    public static void main(String[] args) {
        solution("one4seveneight");
    }


    public static int solution(String s){
        int answer = 0;
        String[] array = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        for (int i = 0; i < array.length; i++) {
            if(s.contains(array[i])){
                s = s.replace(array[i], Integer.toString(i));
            }
        }

        answer = Integer.parseInt(s);
        return answer;
    }

}
