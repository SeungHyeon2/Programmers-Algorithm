package org.example.level2;

import java.util.*;

public class discountEvent_131127 {

    public static void main(String[] args) {

        String[] want = {"banana", "apple", "rice", "pork", "pot"};
        int[] number = {3, 2, 2, 2, 1};
        String[] discount = {"chicken", "apple", "apple", "banana", "rice", "apple", "pork", "banana", "pork", "rice", "pot", "banana", "apple", "banana"};
        solution(want, number, discount);
    }

    public static int solution(String[] want, int[] number, String[] discount) {
        // 돈내면 10일 회원 -> 회원 대상으로 매일 한가지씩만 구매가능한 상품을 팜
        // 제품과 수량이 할인하는 날짜와 10일 연속으로 일치할 경우에 맞춰서 회원가입 하려고 함
        int answer = 0;

        ArrayList<String> al = new ArrayList<String>();

        for(int i = 0; i < number.length; i++){
            for(int j = 1; j <= number[i]; j++){
                al.add(want[i]);
            }
        }

        for(int index = 0; index <= discount.length - 10; index++) {
            HashMap<String, Integer> map = new HashMap<>();

            for(int i = 0; i < 10; i++) {
                String product = discount[index+i];
                if(map.containsKey(product)){
                    map.put(product, map.get(product) + 1);
                }else{
                    map.put(product, 1);
                }
            }

            for(int i = 0; i < al.size(); i++){
                if(map.containsKey(al.get(i))){
                    map.put(al.get(i), map.get(al.get(i)) - 1);
                    if(map.get(al.get(i)) == 0){
                        map.remove(al.get(i));
                    }
                }
            }

            if(map.isEmpty()) answer++;

        }

        // System.out.println(answer);
        return answer;
    }

}
