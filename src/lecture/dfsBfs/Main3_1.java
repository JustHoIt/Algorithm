package lecture.dfsBfs;

import java.util.Scanner;

/*최대점수 구하기*/
public class Main3_1 {
    static int answer = Integer.MIN_VALUE;
    static int N, M;

    public void DFS(int L, int sum, int time, int[] scores, int[] times) {
        if (time > M) {
            return;
        }
        if (L == N) {
            answer = Math.max(answer, sum);
        } else {
            DFS(L + 1, sum + scores[L], time + times[L], scores, times);
            DFS(L + 1, sum, time, scores, times);
        }
    }

    public static void main(String[] args) {
        Main3_1 T = new Main3_1();
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        int[] scores = new int[N];
        int[] times = new int[N];
        for (int i = 0; i < N; i++) {
            scores[i] = sc.nextInt();
            times[i] = sc.nextInt();
        }
        T.DFS(0, 0, 0, scores, times);
        System.out.println(answer);
    }
}
