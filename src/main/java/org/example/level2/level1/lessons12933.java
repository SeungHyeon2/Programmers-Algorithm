package org.example.level2.level1;

import java.util.ArrayList;
import java.util.Arrays;

public class lessons12933 {
    public static void main(String[] args) {
        long s = 118372;
        solution(s);
    }

    public static long solution(long n) {
        long answer = 0;

        char[] s = String.valueOf(n).toCharArray();
        // ArrayList<String> ss = new ArrayList<String>();
        Arrays.sort(s);
        StringBuilder sb = new StringBuilder(String.valueOf(s));
        answer = Long.parseLong(sb.reverse().toString());
        System.out.println(answer);
        return answer;
    }
}
