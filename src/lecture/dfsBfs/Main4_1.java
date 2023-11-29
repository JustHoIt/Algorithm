package lecture.dfsBfs;

import java.util.Scanner;
/*중복순열(DFS)*/
public class Main4_1 {
    static int[] pm;
    static int N, M;


    public void DFS(int L) {
        if (L == M) {
            for (int x : pm) {
                System.out.print(x + " ");
            }
            System.out.println();
        } else {
            for (int i = 1; i <= N; i++) {
                pm[L] = i;
                DFS(L + 1);
            }
        }

    }

    public static void main(String[] args) {
        Main4_1 T = new Main4_1();
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        pm = new int[M];
        T.DFS(0);
    }
}
