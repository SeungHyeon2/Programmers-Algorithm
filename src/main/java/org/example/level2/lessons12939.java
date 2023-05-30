package org.example.level2;

import java.util.HashMap;
import java.util.StringTokenizer;

public class lessons12939 {

    public static void main(String[] args) {
        // String s = "1 2 3 4";
        // String s = "-1 -2 -3 -4";
        String s = "-1 -1";
        solution(s);
    }

    public static String solution(String s) {

        StringTokenizer st = new StringTokenizer(s, " ");
         HashMap<String, Integer> minMap = new HashMap<>();
         HashMap<String, Integer> maxMap = new HashMap<>();
        while(st.hasMoreTokens()){
            int num = Integer.parseInt(st.nextToken());
            // System.out.println("num : " + num);
            //
            if(minMap.isEmpty()){
                minMap.put("Minimum", num);
            }else{
                if(minMap.get("Minimum") > num){
                    minMap.replace("Minimum", num);
                }
            }

            //
            if(maxMap.isEmpty()){
                maxMap.put("Maximum", num);
            }else{
                if(maxMap.get("Maximum") < num){
                    maxMap.replace("Maximum", num);
                }
            }
        }

//        System.out.println("Maximum Value : " + maxMap.get("Maximum"));
//        System.out.println("Minimum Value : " + minMap.get("Minimum"));

        String answer = minMap.get("Minimum") + " " + maxMap.get("Maximum");

        return answer;

    }

}
