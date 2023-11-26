package lecture.recursiveTreeGraph;

/* 입전 리스트 경로 탐색 (DFS)*/

import java.util.ArrayList;
import java.util.Scanner;

public class Main12_1 {
    static int N, M, answer = 0;
    static ArrayList<ArrayList<Integer>> graph;
    static int[] ch;

    public void DFS(int v) {
        if (v == N) {
            answer++;
        } else {
            for (int nv : graph.get(v)) {
                if (ch[nv] == 0) {
                    ch[nv] = 1;
                    DFS(nv);
                    ch[nv] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        Main12_1 T = new Main12_1();
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();

        graph = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i <= N; i++) {
            graph.add(new ArrayList<Integer>()); //객체 생성
        }
        ch = new int[N + 1];
        for (int i = 0; i < M; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph.get(a).add(b); // a번 ArrayList에 접근 후 b를 추가 ex)a = 3, b =2 | 1:{}, 2:{}, 3:{2}, 4:{}, 5:{}
        }
        ch[1] = 1;

        T.DFS(1);
        System.out.println(answer);
    }
}