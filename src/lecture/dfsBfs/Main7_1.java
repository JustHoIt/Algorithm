package lecture.dfsBfs;

import java.util.Scanner;

/*조합의 겅우수 (메모이제이션)*/
public class Main7_1 {
    int[][] dy = new int[35][35];

    public int DFS(int N, int R) {
        if (dy[N][R] > 0) {
            return dy[N][R];
        }
        if (R == 0 || N == R) {
            return 1;
        } else {
            return dy[N][R] = DFS(N - 1, R - 1) + DFS(N - 1, R);
        }
    }

    public static void main(String[] args) {
        Main7_1 T = new Main7_1();
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int R = sc.nextInt();
        System.out.println(T.DFS(N, R));
    }
}
