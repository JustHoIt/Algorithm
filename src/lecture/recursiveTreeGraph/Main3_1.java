package lecture.recursiveTreeGraph;

import java.util.Scanner;

/*재귀함수*/
public class Main3_1 {
    public int Factorial(int N) {
        if (N == 1) {
            return 1;
        } else {
            return N * Factorial(N - 1);
        }
    }

    public static void main(String[] args) {
        Main3_1 T = new Main3_1();
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(T.Factorial(N));
    }
}
