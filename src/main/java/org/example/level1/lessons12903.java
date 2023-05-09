package org.example.level1;

public class lessons12903 {
    public static void main(String[] args) {
        String s = "qwer";
        solution(s);
    }

    public static String solution(String s) {
        String answer = "";
        char[] xx = s.toCharArray();
        int yeah = s.length();
        if(s.length()%2==0){
            answer += xx[yeah/2 -1];
            answer += xx[yeah/2];
        }else{
            answer += xx[yeah/2];
        }
        System.out.println(answer);
        return answer;
    }
}
