package org.example.level1;

import java.util.stream.IntStream;

public class lessons17681 {
    public static void main(String[] args) {
        int n = 6;
        int[] arr1 = {46, 33, 33, 22, 31, 50};
        int[] arr2 = {27, 56, 19, 14, 14, 10};

        solution(n, arr1, arr2);
    }

    public static String[] solution(int n, int[] arr1, int[] arr2) {
        int[][] before_answer = new int[n][n];
        String[] answer = new String[n];

        int[][] map1 = new int[n][n];
        int[][] map2 = new int[n][n];

        for (int i = 0; i < n; i++) {
            StringBuilder sb1 = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();

            while(arr1[i]>0){
                if(arr1[i]%2==0){
                    sb1.append("0");
                }else{
                    sb1.append("1");
                }
                arr1[i] = arr1[i]/2;
            }
            while(arr2[i]>0){
                if(arr2[i]%2==0){
                    sb2.append("0");
                }else{
                    sb2.append("1");
                }
                arr2[i] = arr2[i]/2;
            }

            while(sb1.length()<n){
                sb1.append("0");
            }

            while(sb2.length()<n){
                sb2.append("0");
            }

            sb1 = sb1.reverse();
            sb2 = sb2.reverse();

            char[] ca1 = sb1.toString().toCharArray();
            char[] ca2 = sb2.toString().toCharArray();
            for(int j = 0; j < ca1.length; j++){
                map1[i][j] = Integer.parseInt(ca1[j] + "");
                map2[i][j] = Integer.parseInt(ca2[j] + "");
            }
        }

        for(int i = 0; i < map1.length; i++){
            String a = "";
            for(int j = 0; j < map1[i].length; j++){
                if(map1[i][j] == 1 || map2[i][j] == 1){
                    before_answer[i][j] = 1;
                }else{
                    before_answer[i][j] = 0;
                }
                a += before_answer[i][j];
            }

            //System.out.println(a);
            char[] charArray = a.toCharArray();
            String qqqqq = "";
            for (int j = 0; j < charArray.length; j++) {
                if(charArray[j] == '1'){
                    qqqqq += "#";
                }else{
                    qqqqq += " ";
                }
            }
            System.out.println(qqqqq);
            answer[i] = qqqqq;
        }


        return answer;
    }
}
