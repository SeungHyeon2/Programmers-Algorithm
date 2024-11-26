package org.example.level2;

import java.util.*;

// 문제 설명
//         정수 n, left, right가 주어집니다. 다음 과정을 거쳐서 1차원 배열을 만들고자 합니다.
//
//         n행 n열 크기의 비어있는 2차원 배열을 만듭니다.
//         i = 1, 2, 3, ..., n에 대해서, 다음 과정을 반복합니다.
//         1행 1열부터 i행 i열까지의 영역 내의 모든 빈 칸을 숫자 i로 채웁니다.
//         1행, 2행, ..., n행을 잘라내어 모두 이어붙인 새로운 1차원 배열을 만듭니다.
//         새로운 1차원 배열을 arr이라 할 때, arr[left], arr[left+1], ..., arr[right]만 남기고 나머지는 지웁니다.
//         정수 n, left, right가 매개변수로 주어집니다. 주어진 과정대로 만들어진 1차원 배열을 return 하도록 solution 함수를 완성해주세요.

// n	left	right	result
// 3	2	5	[3,2,2,3]
// 4	7	14	[4,3,3,3,4,4,4,4]

public class CutnSquaredArray_87390 {

    public static void main(String[] args) {

        int n = 3;
        int left = 2;
        int right = 5;

        // int n = 4;
        // int left = 7;
        // int right = 14;

        solution(n, left, right);
    }

    public static int[] solution(int n, long left, long right) {

        int[] answer = new int[(int) (right - left + 1)];

        for(long index = left; index <= right; index++){
            int row = (int)(index / n);
            int col = (int)(index % n);

            answer[(int)(index-left)] = Math.max(row, col) + 1;
        }

        // int[][] originArray = new int[n][n];
        //
        // for(int i = n; i > 0; i--) {
        //     for(int j = 0; j < i; j++) {
        //         for(int k = 0; k < i; k++) {
        //             originArray[j][k] = i;
        //         }
        //     }
        // }
        //
        // ArrayList<Integer> al = new ArrayList<Integer>();
        //
        // for (int[] ints : originArray) {
        //     for (int j = 0; j < originArray.length; j++) {
        //         al.add(ints[j]);
        //     }
        // }
        //
        // ArrayList<Integer> answerArray = new ArrayList<Integer>();
        //
        // for(int i = 0; i < al.size(); i++){
        //     if(i>= left && i<= right){
        //         answerArray.add(al.get(i));
        //     }
        // }
        //
        //
        // int[] answer = answerArray.stream().mapToInt(i -> i).toArray();

        return answer;
    }



}
