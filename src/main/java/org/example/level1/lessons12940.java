package org.example.level1;

import java.util.Arrays;

public class lessons12940 {

    public static void main(String[] args) {
        int n = 3;
        int m = 12;

        solution(n, m);
    }

    public static int[] solution(int n, int m) {
        int[] answer = new int[2];


        // 최대 공약수
        int minNum = 0;

        for(int i = 1; i <= n; i++){
            if(n%i==0){
//                System.out.println("i :" + i);
//                System.out.println("n :" + n);
                minNum++;
            }
        }
        int[] minN = new int[minNum];

        int q = 0;
        for (int i = 1; i <= n; i++) {
            if(n%i==0){
                minN[q] = i;
                q++;
            }
        }

        minNum = 0;

        for(int i = 1; i <= m; i++){
            if(m%i==0){
//                System.out.println("i :" + i);
//                System.out.println("n :" + n);
                minNum++;
            }
        }
        int[] minM = new int[minNum];

        q = 0;
        for (int i = 1; i <= m; i++) {
            if(m%i==0){
                minM[q] = i;
                q++;
            }
        }


//        for (int i = 0; i < minN.length; i++) {
//            System.out.println(minN[i]);
//        }
//
//        for (int i = 0; i < minM.length; i++) {
//            System.out.println(minM[i]);
//        }

        // n의 약수 배열 -> minN
        // m의 약수 배열 -> minM

        int choiso = 0;

        int i = minN.length-1;
        int j = minM.length-1;

        while(i>=0 && j>=0){
            if(minN[i] == minM[j]){
                choiso = minN[i];
                break;
            }
            if(minN[i] > minM[j]){
                i--;
            } else {
                j--;
            }
        }
        System.out.println("최소공배수 : " + choiso);
        int choiDae = 0;
        choiDae = n * m / choiso;


        answer[0] = choiso;
        answer[1] = choiDae;

        // 최소 공배수

        return answer;
    }

}
