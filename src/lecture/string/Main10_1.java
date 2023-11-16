package lecture.string;


import java.util.Scanner;

public class Main10_1 {
    public int[] solution(String str, char t) { // 문자거리
        int[] answer = new int[str.length()];
        int p = 1000;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == t) {
                p = 0;
                answer[i] = p;
            } else {
                p++;
                answer[i] = p;

            }
        }
        p = 1000;
        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) == t) {
                p = 0;
            } else {
                p++;
                answer[i] = Math.min(answer[i],p); // answer[i]번째의 p 값과 현재 p값 중 더 작은수를 answer[i]
                }
            }
        return answer;
    }

    public static void main(String[] args) {
        Main10_1 T = new Main10_1();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        char c = kb.next().charAt(0); //char 입력받는법
        for (int x : T.solution(str, c)) {
            System.out.print(x + " ");
        }
    }
}