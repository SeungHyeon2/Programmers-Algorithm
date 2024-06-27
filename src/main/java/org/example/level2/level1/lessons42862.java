package org.example.level2.level1;

import java.util.ArrayList;

public class lessons42862 {

    public static void main(String[] args) {
        int n = 5;
        int[] lost = {1, 3, 5};
        int[] reverse = {1, 3, 5};
        solution(n, lost, reverse);
    }

    public static int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;

        // 체육복을 도난당하지 않는 학생 수
        ArrayList<Integer> lost_al = new ArrayList<>();
        ArrayList<Integer> reserve_al = new ArrayList<>();

        for (int j : lost) {
            lost_al.add(j);
        }
        for (int i : reserve) {
            reserve_al.add(i);
        }

        for(int a : lost_al){
            if(reserve_al.contains(a)){
                System.out.println("a : " + a);
                reserve_al.remove((Integer)a);
            }
        }

        System.out.println("lost_al : " + lost_al);
        System.out.println("reserve_al : " + reserve_al);

        return answer;
    }

}
