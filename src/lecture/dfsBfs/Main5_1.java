package lecture.dfsBfs;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/*동전 교환*/
public class Main5_1 {
    static int answer = Integer.MAX_VALUE;
    static int N, M;

    public void DFS(int L, int sum, Integer[] coins) {
        if (sum > M) {
            return;
        }// 이 if문이 없으면 무한루프
        if (L >= answer) {
            return;
        }
        if (sum == M) {
            answer = Math.min(answer, L);
        } else {
            for (int i = 0; i < N; i++) {
                DFS(L + 1, sum + coins[i], coins);
            }
        }
    }

    public static void main(String[] args) {
        Main5_1 T = new Main5_1();
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        Integer[] coins = new Integer[N];
        for (int i = 0; i < N; i++) {
            coins[i] = sc.nextInt();
        }
        Arrays.sort(coins, Collections.reverseOrder());
        M = sc.nextInt();
        T.DFS(0, 0, coins);
        System.out.println(answer);

    }
}
