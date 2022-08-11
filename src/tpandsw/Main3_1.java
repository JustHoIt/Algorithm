package tpandsw;

import java.util.Scanner;

public class Main3_1 {
    public int solution(int n, int k, int[] arr) {
        int answer = Integer.MIN_VALUE;  // 10 / 3 / [12, 15, 11, 20, 25, 10, 20, 19, 13, 15] //10
        int index = 0;
        int sum = 0;

        for (int i = 0; i < k; i++) {
            sum += arr[i];
            answer = sum;
        }
        for (int i = k; i < n; i++) {
            sum += (arr[i] - arr[i-k]);
            answer = Math.max(answer, sum);
        }
        return answer;
    }

    public static void main(String[] args) {
        Main3_1 T = new Main3_1();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print(T.solution(n, k, arr));

    }
}