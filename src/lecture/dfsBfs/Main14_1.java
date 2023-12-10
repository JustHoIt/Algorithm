package lecture.dfsBfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/* 섬나라 아일랜드(BFS) - 지도에서 섬 찾기 */
public class Main14_1 {
    static int N;
    static int answer = 0;
    static int[] dx = {-1, -1, 0, 1, 1, 1, 0, -1};
    static int[] dy = {0, 1, 1, 1, 0, -1, -1, -1};
    Queue<Point> Q = new LinkedList<>();

    public void BFS(int x, int y, int[][] islands) {
        Q.add(new Point(x, y));
        while (!Q.isEmpty()) {
            Point p = Q.poll();
            for (int i = 0; i < 8; i++) {
                int nx = p.x + dx[i];
                int ny = p.y + dy[i];
                if (nx >= 0 && nx < N && ny >= 0 && ny < N && islands[nx][ny] == 1) {
                    islands[nx][ny] = 0;
                    Q.add(new Point(nx, ny));
                }
            }
        }
    }

    public void solution(int[][] islands) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (islands[i][j] == 1) {
                    answer++;
                    islands[i][j] = 0;
                    BFS(i, j, islands);
                }
            }
        }
    }

    public static void main(String[] args) {
        Main14_1 T = new Main14_1();
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        int [][] islands = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                islands[i][j] = sc.nextInt();
            }
        }
        T.solution(islands);
        System.out.println(answer);
    }
}
