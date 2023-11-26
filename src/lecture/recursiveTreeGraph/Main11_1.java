package lecture.recursiveTreeGraph;

/* 입전 행렬 그래프 경로 탐색 (DFS)*/

import java.util.Scanner;

public class Main11_1 {
    static int N, M, answer = 0;
    static int[][] graph;
    static int[] ch;

    public void DFS(int v) {
        if (v == N) {
            answer++;
        } else {
            for (int i = 1; i <= N; i++) {
                if (graph[v][i] == 1 && ch[i] == 0) {
                    ch[i] = 1;
                    DFS(i);
                    ch[i] = 0; //백 한다면 check 0으로 하기
                }
            }
        }
    }

    public static void main(String[] args) {
        Main11_1 T = new Main11_1();
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();

        graph = new int[N + 1][N + 1];
        ch = new int[N + 1];
        for (int i = 0; i < M; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph[a][b] = 1;
        }
        ch[1] = 1;

        T.DFS(1);
        System.out.println(answer);
    }
}