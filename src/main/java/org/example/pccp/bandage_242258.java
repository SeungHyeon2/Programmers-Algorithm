package org.example.pccp;

import java.util.ArrayList;
import java.util.HashSet;

public class bandage_242258 {

    public static int solution(int[] bandage, int health, int[][] attacks) {
        // bandage -> 시전시간, 1초당 회복량, 추가 회복량을 담은 1차원 정수 배열
        // health -> 최대 체력
        // attacks -> 몬스터의 공격시간과 피해량을담은 2차원 정수 배열
        int count = 0; // 시간초
        int healCount = 0; // 힐 상태저장소
        int maxHealth = health;

        while(count <= attacks[attacks.length - 1][0]){
            if(count ==0){
                count++;
                continue;
            }

            int deal = 0;

            // 공격라운드인지 확인하고 몇딜인지 확인
            for(int index = 0; index < attacks.length; index++){
                if(attacks[index][0] == count){
                    deal = attacks[index][1];
                }
            }


            int roundtotalHeal = bandage[1];


            if(deal != 0){
                roundtotalHeal = 0;
            }else{
                healCount++;
                if(healCount >= bandage[0]){
                    roundtotalHeal = roundtotalHeal + bandage[2];
                    healCount = 0;
                }
            }

            if(deal != 0){
                healCount = 0;
            }




            // 힐, 딜 총합계산
            if(health + roundtotalHeal - deal >= maxHealth){
                health = maxHealth;
            }else{
                health = health + roundtotalHeal - deal;
            }

            // System.out.println("health : " + health);
            // System.out.println("roundtotalHeal : " + roundtotalHeal);
            // System.out.println("deal : " + deal);
            // System.out.println("-----------------------");

            if(health <= 0){
                return -1;

            }

            count++;
        }

        return health;
    }

}
