package lecture.stackQue;

import java.util.Scanner;
import java.util.Stack;

/*
 * 괄호 문자 제거(Stack)
 * */
public class Main2_1 {
    public String solution(String str) {
        String answer = "";
        Stack<Character> st = new Stack<>();
        for (char x : str.toCharArray()) {
            if (x == ')') {
                while (st.pop() != '(') ;
            } else {
                st.push(x);
            }
        }
        for (int i = 0; i < st.size(); i++) {
            answer += st.get(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        Main2_1 M = new Main2_1();
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        System.out.println(M.solution(str));
    }
}
