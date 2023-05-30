package org.example.level2;

import java.util.ArrayList;
import java.util.Collections;

public class lessons12941 {

    public static void main(String[] args) {
        int[] A = {1, 2};
        int[] B = {3, 4};
        solution(A, B);
    }

    public static int solution(int[] A, int[] B) {
        int answer = 0;

        ArrayList<Integer> alA = new ArrayList<>();
        ArrayList<Integer> alB = new ArrayList<>();

        for(int i = 0; i < A.length; i++){
            alA.add(A[i]);
            alB.add(B[i]);
        }

        Collections.sort(alA);
        Collections.sort(alB);
        Collections.reverse(alB);

         System.out.println("alA : " + alA);
         System.out.println("alB : " + alB);

        for(int i = 0; i < A.length; i++){
            answer += alA.get(i) * alB.get(i);
        }

        System.out.println("answer : " + answer);
        return answer;
    }

}
