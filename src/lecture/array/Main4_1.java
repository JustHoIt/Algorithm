package lecture.array;

import java.util.Scanner;

public class Main4_1 {
    public int[] solution(int n) {
        int[] answer = new int[n];
        answer[0] = 1;
        answer[1] = 1;
        for (int i = 2; i < answer.length; i++) {
            answer[i] = answer[i - 1] + answer[i - 2];
        }

        return answer;
    }

    public static void main(String[] args) {
        Main4_1 T = new Main4_1();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();

        for (int x : T.solution(n)) {
            System.out.print(x +" ");
        }
    }
}
