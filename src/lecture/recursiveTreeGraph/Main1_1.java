package lecture.recursiveTreeGraph;

import java.util.Scanner;

/*재귀함수(StackFrame)*/
public class Main1_1 {
    public void DFS(int N) {
        if (N == 0) {
            return;
        } else {
            DFS(N - 1);
            System.out.print(N + " ");
        }
    }

    public static void main(String[] args) {
        Main1_1 T = new Main1_1();
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        T.DFS(N);
    }
}
