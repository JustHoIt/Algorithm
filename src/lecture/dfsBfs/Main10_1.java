package lecture.dfsBfs;

import java.util.Scanner;
/* 미로 찾기(DFS)*/
public class Main10_1 {
    static int[] dx = {-1, 0, 1, 0};    // ↑, →, ↓, ←
    static int[] dy = {0, 1, 0, -1};    // ↑, →, ↓, ←
    static int[][] maze;
    static int answer;

    public void DFS(int x, int y) {
        if (x == 7 && y == 7) {
            answer++;
        } else {
            for (int i = 0; i < 4; i++) {
                    int nx = x + dx[i];
                    int ny = y + dy[i];
                    if(nx >= 1 && nx <=7 && ny >= 1 && ny <=7 && maze[nx][ny] == 0){
                        maze[nx][ny] = 1;
                        DFS(nx, ny);
                        maze[nx][ny] = 0;
                    }
            }
        }
    }

    public static void main(String[] args) {
        Main10_1 T = new Main10_1();
        Scanner sc = new Scanner(System.in);
        maze = new int[8][8]; // size를 입력 받는게 아니라 7 * 7 고정 1번부터 사용 하기 위해 8 size

        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 7; j++) {
                maze[i][j] = sc.nextInt();
            }
        }
        maze[1][1] = 1;
        T.DFS(1, 1);
        System.out.println(answer);

    }
}
