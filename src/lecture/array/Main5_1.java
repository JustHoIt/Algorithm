package lecture.array;

import java.util.Scanner;

public class Main5_1 {
    public int solution(int N) {
        int answer = 0;
        int[] arr = new int[N + 1];

        for (int i = 2; i <= N; i++) {
            if (arr[i] == 0) {
                answer++;
                for (int j = i; j <= N; j = j + i) {
                        arr[j] = 1;
                }
            }
        }


        return answer;
    }

    public static void main(String[] args) {
        Main5_1 T = new Main5_1();
        Scanner kb = new Scanner(System.in);
        int N = kb.nextInt();

        System.out.println(T.solution(N));

    }
}
