package lecture.stackQue;

import java.util.Scanner;
import java.util.Stack;

/*
* 올바른 괄호(Stack)
* */
public class Main1_1 {
    public String solution(String str) {
        String answer = "NO";
        Stack<Character> st = new Stack<>();
        for (char x : str.toCharArray()) {
            if (x == '(') {
                st.push(x);
            } else {
                if (st.isEmpty()) {
                    return answer;
                }
                st.pop(); //제일 상단(마지막 push 삭제
            }
        }
        if (!st.isEmpty()) {
            return answer;
        }
        answer = "YES";

        return answer;
    }

    public static void main(String[] args) {
        Main1_1 M = new Main1_1();
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        System.out.println(M.solution(str));
    }
}
