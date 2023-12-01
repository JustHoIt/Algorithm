package lecture.dfsBfs;

import java.util.Scanner;
/*순열 구하기*/
public class Main6_1 {
    static int N, M;
    static int[] arr, pm, ch;

    public void DFS(int L) {
        if (L == M) {
            for (int x : pm) {
                System.out.print(x + " ");
            }
            System.out.println();
        } else {
            for (int i = 0; i < N; i++) {
                if (ch[i] == 0) {
                    ch[i] = 1;
                    pm[L] = arr[i];
                    DFS(L + 1);
                    ch[i] = 0;
                }
            }
        }

    }

    public static void main(String[] args) {
        Main6_1 T = new Main6_1();
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        ch = new int[N];
        pm = new int[M];
        T.DFS(0);
    }
}
