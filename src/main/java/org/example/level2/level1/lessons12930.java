package org.example.level2.level1;

import java.util.Objects;

public class lessons12930 {

    public static void main(String[] args) {
        String s = "try hello world ";
        solution(s);
    }

    public static String solution(String n) {
        StringBuilder answer = new StringBuilder();

        String[] sa = n.split("");

        int count = 0;

        for (String s : sa) {
            if (s.equals(" ")) {
                answer.append(" ");
                count = 0;
            } else {
                if (count == 0) {
                    answer.append(s.toUpperCase());
                } else if (count % 2 == 0) {
                    answer.append(s.toUpperCase());
                } else {
                    answer.append(s.toLowerCase());
                }
                count++;
            }
        }

        return answer.toString();
    }
}
