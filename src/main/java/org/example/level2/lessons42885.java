package org.example.level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class lessons42885 {

    public static void main(String[] args) {
        int[] people = {70, 50, 80, 50};
        int limit = 100;
        solution(people, limit);
    }

    public static int solution(int[] people, int limit) {
        int answer = 0;

        Arrays.sort(people);

        int min = 0;

        for(int max = people.length - 1; min <= max; max--){
            if(people[min] + people[max] <= limit){
                min++;
            }
            answer++;
        }

        return answer;
    }

}
