package org.example.level2.level1;

import java.util.ArrayList;

public class lessons86491 {
    public static void main(String[] args) {
        int[][] sizes = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};

        solution(sizes);
    }

    public static int solution(int[][] sizes) {
        int answer = 0;

        int[] width = new int[sizes.length];
        int[] height = new int[sizes.length];

        for (int i = 0; i < sizes.length; i++) {
            for (int j = 0; j < sizes[i].length; j++) {
                if(j==0){
                    width[i] = sizes[i][j];
                }else{
                    height[i] = sizes[i][j];
                }
            }

        }

        int longest = 0;
        for (int i = 0; i < sizes.length; i++) {
            if(width[i] > longest){
                longest = width[i];
            }
            if(height[i]> longest){
                longest = height[i];
            }
        }

        int aaaa = 0;
        int bbbb = 0;
        for (int i = 0; i < sizes.length; i++) {
            if(width[i]>=height[i]){
                aaaa = height[i];
            }else{
                aaaa = width[i];
            }
            if(aaaa >= bbbb){
                bbbb = aaaa;
            }
        }
        answer = longest * bbbb;
        return answer;
    }

}
