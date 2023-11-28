package lecture.dfsBfs;

import java.util.Scanner;

/*바둑이 승차(DFS)*/
public class Main2_1 {
    static int answer = Integer.MIN_VALUE;
    static int C, N;

    public void DFS(int L, int sum, int[] weight) {
        if (sum > C) {
            return;
        }
        if (L == N) {
            answer = Math.max(answer, sum);
        } else {
            DFS(L + 1, sum + weight[L], weight);
            DFS(L + 1, sum, weight);
        }
    }

    public static void main(String[] args) {
        Main2_1 T = new Main2_1();
        Scanner sc = new Scanner(System.in);

        C = sc.nextInt();
        N = sc.nextInt();
        int[] weight = new int[N];

        for (int i = 0; i < N; i++) {
            weight[i] = sc.nextInt();
        }
        T.DFS(0, 0, weight);
        System.out.println(answer);
    }
}
