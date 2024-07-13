package org.example.lecture.section7;

import java.util.Scanner;

//    10진수 N이 입력되면 2진수로 변환하여 출력하는 프로그램을 작성하세요. 단 재귀함수를 이용 해서 출력해야 합니다.
//    ▣ 입력설명
//    첫 번째 줄에 10진수 N(1<=N<=1,000)이 주어집니다.
//    ▣ 출력설명
//    첫 번째 줄에 이진수를 출력하세요.
//    ▣ 입력예제 1 11
//    ▣ 출력예제 1 1011
//    [쉽게 배우는 알고리즘 문제풀이]

public class step2_recursiveBinary {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        DFS(n);
    }

    public static void DFS(int n){
        if(n == 0) return;
        int x = n / 2;
        DFS(x);
        System.out.print(n % 2);
    }
}
