package org.example.level2;

import java.util.*;

//문제 설명
//트럭 여러 대가 강을 가로지르는 일차선 다리를 정해진 순으로 건너려 합니다. 모든 트럭이 다리를 건너려면 최소 몇 초가 걸리는지 알아내야 합니다. 다리에는 트럭이 최대 bridge_length대 올라갈 수 있으며, 다리는 weight 이하까지의 무게를 견딜 수 있습니다. 단, 다리에 완전히 오르지 않은 트럭의 무게는 무시합니다.
//
//예를 들어, 트럭 2대가 올라갈 수 있고 무게를 10kg까지 견디는 다리가 있습니다. 무게가 [7, 4, 5, 6]kg인 트럭이 순서대로 최단 시간 안에 다리를 건너려면 다음과 같이 건너야 합니다.
//
//경과 시간	다리를 지난 트럭	다리를 건너는 트럭	    대기 트럭
//0	        []	            []	                [7,4,5,6]
//1~2	    []	            [7]	                [4,5,6]
//3	        [7]	            [4]	                [5,6]
//4	        [7]	            [4,5]	            [6]
//5	        [7,4]	        [5]	                [6]
//6~7	    [7,4,5]	        [6]	                []
//8	        [7,4,5,6]	    []	                []
//따라서, 모든 트럭이 다리를 지나려면 최소 8초가 걸립니다.
//
//solution 함수의 매개변수로 다리에 올라갈 수 있는 트럭 수 bridge_length, 다리가 견딜 수 있는 무게 weight, 트럭 별 무게 truck_weights가 주어집니다. 이때 모든 트럭이 다리를 건너려면 최소 몇 초가 걸리는지 return 하도록 solution 함수를 완성하세요.
//
//제한 조건
//bridge_length는 1 이상 10,000 이하입니다.
//weight는 1 이상 10,000 이하입니다.
//truck_weights의 길이는 1 이상 10,000 이하입니다.
//모든 트럭의 무게는 1 이상 weight 이하입니다.
//입출력 예
//bridge_length	weight	    truck_weights	                    return
//2	            10	        [7,4,5,6]	                        8
//100	        100	        [10]	                            101
//100	        100	        [10,10,10,10,10,10,10,10,10,10]	    110

public class lessons42583 {

    public static void main(String[] args) {
        int bridege_length = 2;
        int weight = 10;
        int[] truck_weights = {7,4,5,6};
        solution(bridege_length, weight, truck_weights);
    }

    public static int solution(int bridge_length, int weight, int[] truck_weights) {
        // bridge_length : 다리 길이
        // weight : 다리가 견딜 수 있는 무게
        // truck_weights : 트럭 무게

        int time = 0;
        int weightOnBridge = 0;

        Queue<int[]> bridge = new LinkedList<>();
        Queue<Integer> waitingTrucks = new LinkedList<>();

        for (int truck : truck_weights) {
            waitingTrucks.add(truck);
        }

        while (!waitingTrucks.isEmpty() || !bridge.isEmpty()) {
            time++;

            // 다리에서 트럭 제거 (다리를 다 건넌 경우)
            if (!bridge.isEmpty() && bridge.peek()[1] == time) {
                weightOnBridge -= bridge.poll()[0];
            }

            // 새로운 트럭을 다리에 올리기
            if (!waitingTrucks.isEmpty() && weightOnBridge + waitingTrucks.peek() <= weight) {
                int truck = waitingTrucks.poll();
                weightOnBridge += truck;
                bridge.add(new int[]{truck, time + bridge_length});
            }
        }

        return time;
    }

}

