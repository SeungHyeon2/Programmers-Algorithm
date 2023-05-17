package org.example.level1;

import java.util.ArrayList;
import java.util.Collections;

public class lessons68644 {

    public static void main(String[] args) {
        int[] numbers = {2, 1, 3, 4, 1};
//        int[] numbers = {5, 0, 2, 7};
        solution(numbers);
    }

    public static int[] solution(int[] numbers) {

        ArrayList<Integer> ai= new ArrayList<Integer>();
        for(int i = 0; i < numbers.length; i++){
            for (int j = i + 1; j < numbers.length; j++) {
                if(!ai.contains(numbers[i] + numbers[j])){
                    ai.add(numbers[i] + numbers[j]);
                }
            }
        }
        Collections.sort(ai);

        int[] answer = new int[ai.size()];

        for(int k = 0; k < ai.size(); k++){
            answer[k] = ai.get(k);
        }

        return answer;
    }

}
