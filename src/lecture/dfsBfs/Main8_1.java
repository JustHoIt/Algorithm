package lecture.dfsBfs;

import java.util.Scanner;
/*수열 추측하기*/
public class Main8_1 {
    static int N, F;
    static int[] B, P, ck;
    boolean flag = false;
    int[][] dy = new int[35][35];

    public int combi(int N, int R) {
        if (dy[N][R] > 0) {
            return dy[N][R];
        }
        if (N == R || R == 0) {
            return 1;
        } else {
            return dy[N][R] = combi(N - 1, R - 1) + combi(N - 1, R);
        }

    }

    public void DFS(int L, int sum) {
        if (flag) {
            return;
        }
        if (L == N) {
            if (sum == F) {
                for (int x : P) {
                    System.out.print(x + " ");
                }
                flag = true;
            }
        } else {
            for (int i = 1; i <= N; i++) {
                if (ck[i] == 0) {
                    ck[i] = 1;
                    P[L] = i;
                    DFS(L + 1, sum + (P[L] * B[L]));
                    ck[i] = 0;
                }
            }
        }

    }

    public static void main(String[] args) {
        Main8_1 T = new Main8_1();
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        F = sc.nextInt();
        B = new int[N];
        P = new int[N];
        ck = new int[N + 1];
        for (int i = 0; i < N; i++) {
            B[i] = T.combi(N - 1, i);
        }
        T.DFS(0, 0);

    }
}
