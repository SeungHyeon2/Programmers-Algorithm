package org.example.level2.level1;

import java.util.Arrays;
import java.util.stream.IntStream;

public class lessons42889 {

    public static void main(String[] args) {
        int N = 5;
        int[] stages = {2, 1, 2, 6, 2, 4, 3, 3};
        // int[] stages = {4, 4, 4, 4};
        solution(N, stages);
    }

    public static int[] solution(int N, int[] stages) {
        int[] answer = new int [N];
        // stages에는 각 사용자가 도전중인 스테이지의 번호를 나타낸다.
        // N은 스테이지의 개수이고 1이상 500 이하의 자연수이다.
        // 실패율 -> 스테이지에 도달했으나 아직 클리어하지 못한 플레이어의 수 / 스테이지에 도달한 플레이어 수

        int[] before_answer = new int [N];
        int[] stage_not_clear = new int[N];
        int[] reach_stages = new int[N];
        double[] fail_rate = new double[N];


        for (int i = 0; i < stages.length; i++) {
            // System.out.println(stages[i]);
            if(stages[i] > N){
                for(int j = 0; j < N; j++){
                    before_answer[j] += 1;
                    reach_stages[j] += 1;
                }
            }else{
                for(int j = 0; j < stages[i]-1; j++){
                    before_answer[j] += 1;
                }

                for(int j = 0; j < stages[i]; j++){
                    reach_stages[j] += 1;
                }
            }
        }

        for(int i = 0; i < stage_not_clear.length; i++){
            stage_not_clear[i] = reach_stages[i] - before_answer[i];
        }

        for(int i = 0; i < fail_rate.length; i++){
            if(stage_not_clear[i] == 0 & reach_stages[i] ==0){
                fail_rate[i] = 0;
            }else {
                fail_rate[i] = (double) stage_not_clear[i] / reach_stages[i];
            }
        }

        answer = IntStream.range(0, fail_rate.length)
                .boxed()
                .sorted((i, j) -> Double.compare(fail_rate[j],fail_rate[i]) == 0 ? i - j : Double.compare(fail_rate[j], fail_rate[i]))
                .mapToInt(Integer::intValue)
                .toArray();

        for(int i=0; i < answer.length; i++){
            answer[i] = answer[i] + 1;
        }

        return answer;
    }
}
