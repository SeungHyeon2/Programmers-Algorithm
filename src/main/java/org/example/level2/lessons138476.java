package org.example.level2;

import java.util.*;

public class lessons138476 {

    public static void main(String[] args) {
        int k = 6;
        int[] tangerine = {1, 3, 2, 5, 4, 5, 2, 3};
        solution(k, tangerine);
    }

    public static int solution(int k, int[] tangerine) {
        int answer = 0;

        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < tangerine.length; i++) {
            map.put(tangerine[i], map.getOrDefault(tangerine[i], 0) + 1);
        }

        int sum = 0;
        List<Integer> list = new ArrayList<>();
        for(Integer x : map.keySet()){
            list.add(map.get(x));
        }

        Collections.reverse(list);
        list.sort(Collections.reverseOrder());

        for(Integer x : list){
            answer++;
            sum = sum + x;
            if(sum>=k){
                break;
            }
        }

        return answer;
    }

}
