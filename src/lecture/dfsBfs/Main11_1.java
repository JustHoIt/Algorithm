package lecture.dfsBfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
/*
* 미로 최소 거리 길찾기*/
class Point {
    public int x, y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class Main11_1 {
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int[][] maze, dis;

    public void BFS(int x, int y) {
        Queue<Point> Q = new LinkedList<>();
        Q.offer(new Point(x, y));
        maze[x][y] = 1;
        while (!Q.isEmpty()) {
            Point tmp = Q.poll();
            for (int i = 0; i < 4; i++) {
                int nx = tmp.x+dx[i];
                int ny = tmp.y+dy[i];
                if(nx >= 1 && nx <= 7 && ny >= 1 && ny <= 7 && maze[nx][ny] == 0){
                    maze[nx][ny] = 1;
                    Q.offer(new Point(nx, ny));
                    dis[nx][ny] = dis[tmp.x][tmp.y]+1;
                }
            }
        }
    }

    public static void main(String[] args) {
        Main11_1 T = new Main11_1();
        Scanner sc = new Scanner(System.in);
        maze = new int[8][8]; //미로 사이즈를 7*7로 고정
        dis = new int[8][8];
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 7; j++) {
                maze[i][j] = sc.nextInt();
            }
        }
        T.BFS(1, 1);
        if (dis[7][7] == 0) {
            System.out.println(-1);
        }else {
            System.out.println(dis[7][7]);
        }
    }
}
