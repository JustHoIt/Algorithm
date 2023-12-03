package lecture.dfsBfs;

import java.util.Scanner;
/*조합 구하기(DFS)*/
public class Main9_1 {
    static int N, M;
    static int[] combi;

    public void DFS(int L, int sp) {
        if (L == M) {
            for (int x: combi) {
                System.out.print(x + " ");
            }
            System.out.println();
        } else {
            for (int i = sp; i <= N; i++) {
                combi[L] = i;
                DFS(L+1, i+1);
            }
        }
    }


    public static void main(String[] args) {
        Main9_1 T = new Main9_1();
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        combi = new int[M];
        T.DFS(0, 1);
    }
}
