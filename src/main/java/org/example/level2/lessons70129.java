package org.example.level2;

import java.util.StringTokenizer;

public class lessons70129 {

    public static void main(String[] args) {
        String s = "110010101001";
        // String s = "01110";
        // String s = "1111111";
        solution(s);
    }

    public static int[] solution(String s) {
        int[] answer = new int[2];
        int answer0 = 0;
        int answer1 = 0;


        while(!s.equals("1")){
            String temp = "";

            for(int i = 0; i < s.length(); i++){
                if(s.charAt(i) == '0'){
                    answer1++;
                }else if(s.charAt(i) == '1'){
                    temp = temp + "1";
                }
            }

            int c = temp.length();
            s = Integer.toBinaryString(c);

//            System.out.println("s : " + s);
            answer0++;

        }

        answer[0] = answer0;
        answer[1] = answer1;

//        System.out.println("answer[0] : " + answer[0]);
//        System.out.println("answer[1] : " + answer[1]);
        return answer;

    }

}
