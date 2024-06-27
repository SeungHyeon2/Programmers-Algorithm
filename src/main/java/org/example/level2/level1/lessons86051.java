package org.example.level2.level1;

import java.util.ArrayList;
import java.util.Arrays;

public class lessons86051 {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 6, 7, 8, 0};

        solution(numbers);
    }

    public static int solution(int[] numbers) {
        int answer = 0;

        ArrayList<Integer> ai = new ArrayList<>();

        for (int i = 0; i < numbers.length; i++) {
            ai.add(numbers[i]);
        }

        for (int i = 0; i <= 9; i++) {
            if(!ai.contains(i)){
                answer += i;
            }
        }

        return answer;

    }

}
