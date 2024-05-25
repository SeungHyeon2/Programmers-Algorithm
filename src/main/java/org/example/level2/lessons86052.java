package org.example.level2;

public class lessons86052 {
    public static void main(String[] args) {
        String[] grid = {"SL, LR"};
//        String[] grid = {"S"};
//        String[] grid = {"R, R"};
        solution(grid);

//        ["SL","LR"]	[16]
//        ["S"]	[1,1,1,1]
//        ["R","R"]	[4,4]
    }

    public static int[] solution(String[] grid) {
        int[] answer = {};
//        손도 못대겠다 ㅋㅋㅋㅋㅋㅋㅋ

        int sizeOfFullGridX = grid[0].length();
        int sizeOfFullGridY = grid.length;
        int[] dr = { -1, 0, 1, 0 }, dc = { 0, -1, 0, 1 }; // 아래, 왼, 위, 오른

        String[][] fullGrid = new String[sizeOfFullGridX][sizeOfFullGridY];

        for (int i = 0; i < sizeOfFullGridX; i++) {
            for (int j = 0; j < sizeOfFullGridY; j++) {
                fullGrid[i][j] = grid[j].substring(i, i+1);
            }
        }



        return answer;

    }
}
