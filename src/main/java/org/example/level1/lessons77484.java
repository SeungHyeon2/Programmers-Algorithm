package org.example.level1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class lessons77484 {

    public static void main(String[] args) {
        int[] lottos = {1, 2, 3, 4, 5, 6};
        int[] win_nums = {7, 8, 9, 10, 11, 12};

        solution(lottos, win_nums);
    }

    public static int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int zero = 0;
        int good = 0;


        ArrayList<Integer> al = new ArrayList<>();

        for(int i : win_nums){
            al.add(i);
        }

        System.out.println(al);

        for(int i=0; i<al.size(); i++){
            if(al.contains(lottos[i])){
                good++;
            }
        }

        for (int lotto : lottos) {
            if (lotto == 0) {
                zero++;
            }
        }
        // answer[0]이 zero가 다 맞아서 랭크 올라갔을때 랭크
        // answer[1]이 zero가 다 틀려서 랭크 내려갔을때 랭크

        Map<Integer, Integer> rank = new HashMap<>();
        rank.put(6, 1);
        rank.put(5, 2);
        rank.put(4, 3);
        rank.put(3, 4);
        rank.put(2, 5);
        rank.put(1, 6);
        rank.put(0, 6);


        System.out.println("zero : " + zero);
        System.out.println("good : " + good);

        if(zero==lottos.length){
            answer[0] = 1;
            answer[1] = 6;
        }else if(good == lottos.length){
            answer[0] = 1;
            answer[1] = 1;
        }else{
            answer[0] = rank.get(zero+good);
            answer[1] = rank.get(good);
        }


        System.out.println("answer[0] : " + answer[0]);
        System.out.println("answer[1] : " + answer[1]);

        return answer;
    }

}
