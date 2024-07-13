package org.example.level2;


// 문제 설명
// n개의 송전탑이 전선을 통해 하나의 트리 형태로 연결되어 있습니다. 당신은 이 전선들 중 하나를 끊어서 현재의 전력망 네트워크를 2개로 분할하려고 합니다.
// 이때, 두 전력망이 갖게 되는 송전탑의 개수를 최대한 비슷하게 맞추고자 합니다.
//
// 송전탑의 개수 n, 그리고 전선 정보 wires가 매개변수로 주어집니다.
// 전선들 중 하나를 끊어서 송전탑 개수가 가능한 비슷하도록 두 전력망으로 나누었을 때,
// 두 전력망이 가지고 있는 송전탑 개수의 차이(절대값)를 return 하도록 solution 함수를 완성해주세요.
//
// 제한사항
// n은 2 이상 100 이하인 자연수입니다.
// wires는 길이가 n-1인 정수형 2차원 배열입니다.
// wires의 각 원소는 [v1, v2] 2개의 자연수로 이루어져 있으며, 이는 전력망의 v1번 송전탑과 v2번 송전탑이 전선으로 연결되어 있다는 것을 의미합니다.
// 1 ≤ v1 < v2 ≤ n 입니다.
// 전력망 네트워크가 하나의 트리 형태가 아닌 경우는 입력으로 주어지지 않습니다.
// 입출력 예
// n	wires	                                                result
// 9	[[1,3],[2,3],[3,4],[4,5],[4,6],[4,7],[7,8],[7,9]]	    3
// 4	[[1,2],[2,3],[3,4]]
// 0
// 7	[[1,2],[2,7],[3,7],[3,4],[4,5],[6,7]]	                1


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class divideElectricalGrid_86971 {

    public static void main(String[] args) {
        int n = 9;
        int [][] wires = {{1,3},{2,3},{3,4},{4,5},{4,6},{4,7},{7,8},{7,9}};

        solution(n, wires);
    }

    public static int solution(int n, int[][] wires) {
        // n ->  전력탑의 갯수
        // wires -> 전력 망 연결
        // 1) 전선을 하나씩 끊어 전력망을 두개로 분리시킨다
        // 2) 두 전력망의 송잔탑 개수의 차이를 구한다(BFS를 사용해 끊어진 전력망 중 하나를 선택하여 연결된 노드의 수를 구한다.)
        // 3) 최솟값을 갱신한다
        int answer = -1;

        for(int i = 0; i < wires.length; i++){
            // 전력망 연결부위를 하나씩 끊는다.
            ArrayList<int[]> divideWires = new ArrayList<>();
            int[] cuttedWire = new int[2];
            int cutPoint1 = 0;
            int cutPoint2 = 0;
            for(int j = 0; j < wires.length; j++){
                if(j!=i){
                    divideWires.add(wires[j]);
                }else{
                    cuttedWire = wires[j];
                }
            }
            // divideWires는 기존 전력망에서 연결부위가 하나씩 끊긴 것
            // divideWires로 나뉘어진 두 전력망의 차이의 절댓값이 가장 적은걸로 업데이트 해야한다.

            cutPoint1 = cuttedWire[0];
            cutPoint2 = cuttedWire[1];
        }

        return answer;
    }

}
