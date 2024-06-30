package org.example.free;


//가로 길이가 2이고 세로의 길이가 1인 직사각형 모양의 타일이 있습니다. 이 직사각형 타일을 이용하여 세로의 길이가 3이고 가로의 길이가 n인 바닥을 가득 채우려고 합니다. 타일을 채울 때는 다음과 같이 2가지 방법이 있습니다
//
//타일을 가로로 배치 하는 경우
//타일을 세로로 배치 하는 경우
//예를들어서 n이 8인 직사각형은 다음과 같이 채울 수 있습니다.
//
//
//직사각형의 가로의 길이 n이 매개변수로 주어질 때, 이 직사각형을 채우는 방법의 수를 return 하는 solution 함수를 완성해주세요.

public class free {

    public static void main(String[] args) {
        int n = 50;

        System.out.println(solution(n));
        solution(n);
    }

    public static long solution(int n) {

        long skajwl = 1000000007;

        if (n == 0) return 1;
        else if (n == 1) return 0;
        else if (n == 2) return 3;
        else if (n == 3) return 0;
        else if (n == 4) return 11;
        else if (n == 5) return 0;
        else if (n >= 6) {
            long[] array = new long[n + 1];
            array[0] = 1;
            array[1] = 0;
            array[2] = 3;
            array[3] = 0;
            array[4] = 11;
            array[5] = 0;

            for (int i = 6; i <= n; i++) {
                if (i % 2 == 1) {
                    array[i] = 0;
                } else {
                    array[i] = (array[i - 2]%skajwl * 4) - (array[i - 4]%skajwl);
                }
            }


            return array[n] % skajwl;
        }

        return 0;
    }
}
