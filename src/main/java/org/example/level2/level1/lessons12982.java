package org.example.level2.level1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.IntStream;

public class lessons12982 {
    public static void main(String[] args) {
        int[] d = {2, 2, 3, 3};
        int budget = 10;
        // int[] stages = {4, 4, 4, 4};
        solution(d, budget);
    }

    public static int solution(int[] d, int budget) {
        int answer = 0;

        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < d.length; i++) {
            al.add(d[i]);
        }
        Collections.sort(al);

        int sum = 0;

        for (int i = 0; i < al.size(); i++) {
            if(sum+al.get(i)>budget){
                System.out.println(answer);
                return answer;
            }else{
                sum += al.get(i);
                answer++;
            }
        }
        System.out.println(answer);
        return answer;
    }
}
