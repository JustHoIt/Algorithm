package lecture.recursiveTreeGraph;

import java.util.Scanner;

/*재귀함수*/
public class Main4_1 {
    //재귀 함수를 이용한 피보나치 수열
    public int Fibonacci(int N) {
        if (N == 1 || N == 2) {
            return 1;
        } else {
            return Fibonacci(N - 2) + Fibonacci(N - 1);
        }
    }

    public int Fibonacci2(int N) {
        int answer = 0;
        int[] arr = new int[N];
        if (N == 1 || N == 2) {
            return 1;
        }
        arr[0] = 1;
        arr[1] = 1;
        for (int i = 2; i < N; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        answer = arr[N-1];
        return answer;
    }

    public static void main(String[] args) {
        Main4_1 T = new Main4_1();
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(T.Fibonacci(N));
        System.out.println(T.Fibonacci2(N));
    }
}

/* for 문과 재귀 함수를 이용한 피보나치 수열은 어떤 것이 더 성능이 좋은가
 *  재귀 피보나치는 스텍 프레임이 돌아가기 때문에 메모리 낭비가 늘어나고 무겁고 성능이 나쁘다.  */