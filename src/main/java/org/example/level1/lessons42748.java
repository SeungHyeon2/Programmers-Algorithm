package org.example.level1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class lessons42748 {
    public static void main(String[] args) {
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};

        solution(array, commands);
    }

    public static int[] solution(int [] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for (int i = 0; i < commands.length; i++) {
            int[] tempArray = new int[commands[i][1] - commands[i][0] +1];
            int ee = 0;
            for(int j = commands[i][0]; j < commands[i][0] + (commands[i][1] - commands[i][0] + 1); j++){
                tempArray[ee] = array[j-1];
                ee = ee + 1;
            }
            List<Integer> tempList = new ArrayList<Integer>();
            for (int j : tempArray) {
                tempList.add(j);
            }
            Collections.sort(tempList);
            int x = commands[i][2];
            answer[i] = tempList.get(x-1);
        }
        return answer;
    }

}
