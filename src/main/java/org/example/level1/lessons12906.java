package org.example.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class lessons12906 {
    public static void main(String[] args) {
        int[] arr = {1, 1, 3, 3, 0, 1, 1};
        solution(arr);
    }

    public static int[] solution(int[] arr) {
        ArrayList<Integer> al = new ArrayList<>();
        int former = -1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != former){
                al.add(arr[i]);
            }
            former = arr[i];
        }
        int[] answer = new int[al.size()];
        Iterator<Integer> iterator = al.iterator();
        for(int i = 0; i < answer.length; i++){
            answer[i] = iterator.next();
        }
        return answer;
    }

}
