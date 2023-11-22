package lecture.recursiveTreeGraph;

import java.util.Scanner;

/*재귀함수*/
public class Main2_1 {
    public void DFS(int N) {
        if (N == 0) {
            return;
        } else {
            DFS(N / 2);
            System.out.print(N % 2 + " ");
        }
    }

    public static void main(String[] args) {
        Main2_1 T = new Main2_1();
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        T.DFS(N);
    }
}
