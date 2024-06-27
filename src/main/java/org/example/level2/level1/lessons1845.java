package org.example.level2.level1;

import java.util.ArrayList;

public class lessons1845 {

    public static void main(String[] args) {
//        int[] nums = {3, 1, 2, 3};
        int[] nums = {3, 3, 3, 2, 2, 4};
//        int[] nums = {3, 3, 3, 2, 2, 2};
        solution(nums);
    }

    public static int solution(int[] nums) {
        int answer = 0;

        int Number = nums.length/2;
        System.out.println(Number);

        ArrayList<Integer> ai = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if(!ai.contains(nums[i]) && ai.size() < Number){
                ai.add(nums[i]);
            }
        }

        System.out.println(ai);

        answer = ai.size();

        return answer;
    }

}
