package org.example.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class lessons12910 {
    public static void main(String[] args) {
        int[] arr = {2, 36, 1, 3};
        int divisor = 1;
        solution(arr, divisor);
    }

    public static int[] solution(int[] arr, int divisor) {

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%divisor == 0){
                list.add(arr[i]);
            }
        }

        if(list.isEmpty()){
            int[] answer = new int[]{-1};
            return answer;
        }else{
            System.out.println(list);
            int[] answer = list.stream().mapToInt(i -> i).sorted().toArray();
            return answer;
        }
    }
}
