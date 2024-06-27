package org.example.level1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class lessons131128 {

    public static void main(String[] args) {
        String X = "100";
        String Y = "203045";
        solution(X, Y);
    }


    public static String solution(String X, String Y) {
        StringBuilder answer = new StringBuilder();

        int[] xArr = new int[10];
        int[] yArr = new int[10];

        for(String x : X.split("")){
            xArr[Integer.parseInt(x)]++;
        }
        for(String y : Y.split("")){
            yArr[Integer.parseInt(y)]++;
        }

        for(int i=9; i>=0; i--){
            while(xArr[i] > 0 && yArr[i] > 0){
                answer.append(i);

                xArr[i]--;
                yArr[i]--;
            }
        }

        if("".equals(answer.toString())) return "-1";
        if("0".equals(answer.toString().substring(0, 1))) return "0";


        return answer.toString();
    }

}
