package org.example.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class lessons12917 {
    public static void main(String[] args) {
        String s = "ABCDabcd";
        solution(s);
    }

    public static String solution(String s) {
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        String answer = new StringBuilder(new String(arr)).reverse().toString();

        System.out.println(answer);
        return answer;
    }
}
