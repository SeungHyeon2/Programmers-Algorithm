package org.example.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class lessons12915 {

    public static void main(String[] args) {
        String[] strings = {"sun", "bed", "car"};
        int n = 1;
        solution(strings, n);
        //strings 요소의 n번째 인덱스를 기준으로 strings 정렬
        //n번째 요소의 char문자가 같을 경우 strings[i] 끼리 비교 후 정렬
    }

    public static String[] solution(String[] strings, int n) {
        // String[] answer = {};

        for (int i = 0; i < strings.length; i++) {
           strings[i] = strings[i].charAt(n) + strings[i];
        }

        List<String> ls = new ArrayList<>();
        for (int i = 0; i < strings.length; i++) {
            ls.add(strings[i]);
        }

        Collections.sort(ls);
        String[] answer = ls.toArray(new String[ls.size()]);
        for (int i = 0; i < answer.length; i++) {
            answer[i] = answer[i].substring(1);
        }


        return answer;
    }

}
