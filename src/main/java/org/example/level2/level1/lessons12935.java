package org.example.level2.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class lessons12935 {
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 1, 1, 1};
        solution(arr);
    }

    public static int[] solution(int[] arr) {
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < min){
                min = arr[i];

            }
        }

        int count = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == min){
                count++;
            }
        }

        int[] answer = new int[arr.length - count];
        int j=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != min){
                answer[j] = arr[i];
                j++;
            }
        }

        for(int x : answer){
            System.out.println(x);
        }

        if(arr.length < 2 ){
            return new int[]{-1};
        }else {
            return answer;
        }
    }
}
