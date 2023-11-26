package lecture.recursiveTreeGraph;

/* 그래프 최단거리(BFS)*/

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main13_1 {
    static int N, M, answer = 0;
    static ArrayList<ArrayList<Integer>> graph;
    static int[] ch, dis; //ch(check), dis(distance) = 최소 간선 수

    public void BFS(int v) {
        ch[v] = 1;
        dis[v] = 0;
        Queue<Integer> Q = new LinkedList<>();
        Q.offer(v);
        while (!Q.isEmpty()) {
            int cv = Q.poll();
            for (int nv : graph.get(cv)) {
                if (ch[nv] == 0) {
                    ch[nv] = 1;
                    Q.offer(nv);
                    dis[nv] = dis[cv] + 1;
                }
            }
        }
    }

    public static void main(String[] args) {
        Main13_1 T = new Main13_1();
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();

        graph = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i <= N; i++) {
            graph.add(new ArrayList<Integer>()); //객체 생성
        }
        ch = new int[N + 1];
        dis = new int[N + 1];
        for (int i = 0; i < M; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph.get(a).add(b); // a번 ArrayList에 접근 후 b를 추가 ex)a = 3, b =2 | 1:{}, 2:{}, 3:{2}, 4:{}, 5:{}
        }

        T.BFS(1);
        for (int i = 2; i <= N; i++) {
            System.out.println(i + " : " + dis[i]);
        }
    }
}