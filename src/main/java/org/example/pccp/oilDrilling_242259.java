package org.example.pccp;

import java.util.*;

public class oilDrilling_242259 {

    static int n, m;
    // 시추관 위치별 석유량
    static int[] oil;

    public static void main(String[] args) {
        int[][] land = new int[][]{{0, 0, 0, 1, 1, 1, 0, 0}, {0, 0, 0, 0, 1, 1, 0, 0}, {1, 1, 0, 0, 0, 1, 1, 0}, {1, 1, 1, 0, 0, 0, 0, 0}, {1, 1, 1, 0, 0, 0, 1, 1}};



        solution(land);
    }


    public static boolean checkRange(int x, int y) {
        return x >= 0 && x < n && y >= 0 && y < m;
    }

    public static void bfs(int[][] land, boolean[][] visited, int x, int y) {
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{x, y});
        visited[x][y] = true;

        // 상, 하, 좌, 우 이동
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};

        // 석유 덩어리 개수
        int count = 1;
        // 석유 덩어리의 열 위치 저장
        Set<Integer> set = new HashSet<>();

        while (!q.isEmpty()) {
            int[] now = q.poll();
            set.add(now[1]);

            for (int i = 0; i < 4; i++) {
                int nx = now[0] + dx[i];
                int ny = now[1] + dy[i];

                // 땅 범위를 넘는 경우 생략
                if (!checkRange(nx, ny)) {
                    continue;
                }

                // 빈 땅이거나, 방문한 적이 있는 경우
                if (land[nx][ny] == 1 && !visited[nx][ny]) {
                    q.add(new int[]{nx, ny});
                    visited[nx][ny] = true;
                    count += 1;
                }
            }
        }

        for (int index : set) {
            oil[index] += count;
        }
    }



    public static int solution(int[][] land) {
        int answer = 0;

        n = land.length;
        m = land[0].length;
        oil = new int[m];

        boolean[][] visited = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (land[i][j] == 1 && !visited[i][j]) {
                    bfs(land, visited, i, j);
                }
            }
        }

        answer = Arrays.stream(oil).max().getAsInt();
        System.out.println(answer);
        return answer;
    }
}