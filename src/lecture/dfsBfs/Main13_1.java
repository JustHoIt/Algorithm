package lecture.dfsBfs;

import java.util.Scanner;
/* 섬나라 아일랜드(DFS) - 지도에서 섬 찾기 */
public class Main13_1 {
    static int N;
    static int[][] islands;
    static int[] dx = {-1, -1, 0, 1, 1, 1, 0, -1};
    static int[] dy = {0, 1, 1, 1, 0, -1, -1, -1};
    static int answer = 0;

    public void DFS(int x, int y, int[][] islands) {
        for (int i = 0; i < 8; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if (nx >= 0 && nx < N && ny >= 0 && ny < N && islands[nx][ny] == 1) {
                islands[nx][ny] = 0;
                DFS(nx, ny, islands);
            }
        }
    }

    public void solution(int[][] islands) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (islands[i][j] == 1) {
                    answer++;
                    islands[i][j] = 0;
                    DFS(i, j, islands);
                }
            }
        }
    }

    public static void main(String[] args) {
        Main13_1 T = new Main13_1();
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        islands = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                islands[i][j] = sc.nextInt();
            }
        }
        T.solution(islands);
        System.out.println(answer);


    }
}
