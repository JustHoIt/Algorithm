package lecture.stackQue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/*공주 구하기(Que, offer(), pull()
* */
public class Main6_1 {
    public int solution(int N, int K) {
        int answer = 0;
        Queue<Integer> Q = new LinkedList<>();
        for (int i = 1; i <= N; i++) {
            Q.offer(i);
        }
        while (!Q.isEmpty()) {
            for (int i = 1; i < K; i++) {
                Q.offer(Q.poll()); // 첫번째 꺼낸 값 을 다시 뒤로 Last로 집어 넣음
            }
            Q.poll();
            if (Q.size() == 1) {
                answer = Q.poll();
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Main6_1 T = new Main6_1();
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        System.out.println(T.solution(N, K));
    }
}
