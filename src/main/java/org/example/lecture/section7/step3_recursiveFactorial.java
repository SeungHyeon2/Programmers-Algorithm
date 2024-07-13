package org.example.lecture.section7;

import java.util.Scanner;

//자연수 N이 입력되면 N!를 구하는 프로그램을 작성하세요. 예를 들어 5! = 5*4*3*2*1=120입니다.
//    ▣ 입력설명
//    첫 번째 줄에 자연수 N(1<=N<=10)이 주어집니다.
//    ▣ 출력설명
//    첫 번째 줄에 N팩토리얼 값을 출력합니다.
//    ▣ 입력예제 1 5
//    ▣ 출력예제 1 120

public class step3_recursiveFactorial {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        DFS(n);
    }

    public static int sum = 1;

    public static void DFS(int n){
        if(n == 0) return;
        else if(n == 1) System.out.print(sum);
        else sum *= n;
        DFS(n-1);
    }
}
