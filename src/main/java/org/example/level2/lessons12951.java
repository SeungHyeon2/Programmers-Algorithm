package org.example.level2;

import java.util.StringTokenizer;

public class lessons12951 {

    public static void main(String[] args) {
        String s = "3people unFollowed me";
        solution(s);
    }

    public static String solution(String s) {
        s = s.toLowerCase();

        StringTokenizer st = new StringTokenizer(s, " ", true);
        StringBuilder sb = new StringBuilder();

        while(st.hasMoreTokens()){
            String word = st.nextToken();
            System.out.println("word : " + word);
            if(word.equals(" ")){
                sb.append(word);
            }else{
                sb.append(word.substring(0, 1).toUpperCase() + word.substring(1));
                System.out.println("word.substring(0, 1).toUpperCase() : " + word.substring(0, 1).toUpperCase());
                System.out.println("word.substring(1) : " + word.substring(1));
            }
        }

        return sb.toString();

    }
}
