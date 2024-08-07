package org.example.level2;

import java.util.HashSet;

//문제 설명
//    한자리 숫자가 적힌 종이 조각이 흩어져있습니다. 흩어진 종이 조각을 붙여 소수를 몇 개 만들 수 있는지 알아내려 합니다.
//
//    각 종이 조각에 적힌 숫자가 적힌 문자열 numbers가 주어졌을 때, 종이 조각으로 만들 수 있는 소수가 몇 개인지 return 하도록 solution 함수를 완성해주세요.
//
//    제한사항
//    numbers는 길이 1 이상 7 이하인 문자열입니다.
//    numbers는 0~9까지 숫자만으로 이루어져 있습니다.
//    "013"은 0, 1, 3 숫자가 적힌 종이 조각이 흩어져있다는 의미입니다.
//    입출력 예
//    numbers	return
//    "17"	    3
//    "011"	    2
//    입출력 예 설명
//    예제 #1
//    [1, 7]으로는 소수 [7, 17, 71]를 만들 수 있습니다.
//
//    예제 #2
//    [0, 1, 1]으로는 소수 [11, 101]를 만들 수 있습니다.
//
//    11과 011은 같은 숫자로 취급합니다.

import java.util.ArrayList;

public class findPrimeNumber_42839 {

    public static void main(String[] args) {
        String numbers = "17";
        int result = solution(numbers);
//        System.out.println(result); // 결과 출력
    }

    public static HashSet<Integer> al = new HashSet<>();



    public static int solution(String numbers) {
        // 모든 숫자 조합을 생성하여 HashSet에 저장
        permutation("", numbers);

        int answer = 0;
        for (int num : al) {
            if (isPrimeNumber(num)) {
                answer++;
            }
        }

        System.out.println("answer : " + answer);

        return answer;
    }

    // 주어진 문자열로부터 가능한 모든 순열을 생성하는 재귀 함수
    public static void permutation(String prefix, String str) {
        int n = str.length();
        if (!prefix.isEmpty()) {
            al.add(Integer.parseInt(prefix));
        }
        for (int i = 0; i < n; i++) {
            permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i + 1, n));
        }
    }

    // 주어진 숫자가 소수인지 판별하는 함수
    public static boolean isPrimeNumber(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
