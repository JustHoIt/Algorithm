package lecture.recursiveTreeGraph;

/* 송아지 찾기 1 (BFS : 상태 트리 탐색) */

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main8_1 {
    int[] dis = {1, -1, 5}; // 민수가  한번에 이동할 수 있는 거리
    int[] ck; //방문한 노드르 체크
    Queue<Integer> Q = new LinkedList<>();

    public int BFS(int S, int E) {
        int answer = 0;
        ck = new int[10001];
        ck[S] = 1;
        Q.offer(S);
        while (!Q.isEmpty()) {
            int len = Q.size();
            for (int i = 0; i < len; i++) {
                int x = Q.poll();
                for (int j = 0; j < 3; j++) {
                    int nx = x + dis[j];
                    if (nx == E) {
                        return answer + 1;
                    }
                    if (nx >= 1 && nx <= 10000 && ck[nx] == 0) {
                        ck[nx] = 1;
                        Q.offer(nx);

                    }
                }
            }
            answer++;
        }
        return answer;
    }

    public static void main(String[] args) {
        Main8_1 T = new Main8_1();
        Scanner sc = new Scanner(System.in);
        int S = sc.nextInt();
        int E = sc.nextInt();

        System.out.println(T.BFS(S, E));

    }
}