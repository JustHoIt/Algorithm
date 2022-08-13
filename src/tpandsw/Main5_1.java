package tpandsw;

import java.util.Scanner;

public class Main5_1 {

    public int solution(int N) {
        int answer = 0;
        int[] arr = new int[N / 2 + 1];
        int sum = 0, lt = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (sum == N) {
                answer++;
            }
            while (sum >= N) {
                sum -= arr[lt];
                lt++;
                if (sum == N) {
                    answer++;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Main5_1 T = new Main5_1();
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(T.solution(N));
    }
}
