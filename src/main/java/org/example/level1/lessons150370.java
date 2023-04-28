package org.example.level1;


import java.util.ArrayList;

// 프로그래머스 Java Lv.1
// 개인정보 수집 유효기간
// 2023 KAKAO BLIND RECRUITMENT
public class lessons150370 {

    public static void main(String[] args) {
        String today = "2022.05.19";
        String[] terms = {"A 6", "B 12", "C 3"};
        String[] privacies = {"2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C"};
        solution(today, terms, privacies);
    }

    public static int[] solution(String today, String[] terms, String[] privacies) {
        int[] answer = {};
        int[] startDate = new int[privacies.length];

        for(int i=0; i<privacies.length; i++){
            String[] splited_1 = privacies[i].split(" "); // privacies에서 시작일, terms 종류 분리
            String[] splited_2 = splited_1[0].split("\\."); // 시작일에서 년/월/일 분리

            int year = (Integer.parseInt(splited_2[0])+1) * 28 * 12 ; // 년
            int month = (Integer.parseInt(splited_2[1])-1) * 28; // 월
            int day = Integer.parseInt(splited_2[2]); // 일

            startDate[i] = year + month + day; // privacies 각 기한을 int 형태의 데이터로 분리

            for(int j=0; j<terms.length; j++) {
                String[] splited_terms = terms[j].split(" ");

                if(splited_1[1].equals(splited_terms[0])){
                    startDate[i] = startDate[i] + Integer.parseInt(splited_terms[1]) * 28;
                }
            }
        }

        int todaySum = 0;
        String todayDate[] = today.split("\\.");
        int todayYear = (Integer.parseInt(todayDate[0]) + 1) * 28 * 12;
        int todayMonth = (Integer.parseInt(todayDate[1])-1) * 28;
        int todayDay = Integer.parseInt(todayDate[2]);
        todaySum = todayYear + todayMonth + todayDay;

        ArrayList<Integer> temp = new ArrayList<>();

        for(int q=0; q<startDate.length; q++){
            if(startDate[q] <= todaySum){
                temp.add(q+1);
            }
        }

        answer = new int[temp.size()];

        for(int i = 0; i < temp.size(); i++){
            answer[i] = temp.get(i);
        }

        return answer;
    }
}

