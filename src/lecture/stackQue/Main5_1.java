package lecture.stackQue;

import java.util.Scanner;
import java.util.Stack;
/*
* 쇠 막대기
* for each문 index사용 */
public class Main5_1 {
    public int solution(String s) {
        int answer = 0;
        char c = 's';
        Stack<Character> st = new Stack<>();
        for (char x : s.toCharArray()) {
            if (x == '(') {
                st.push(x);
                c = x;
            } else {
                if(c == ')'){
                    st.pop();
                    c = x;
                    answer += 1;
                }else{
                    st.pop();
                    answer += st.size();
                    c = x;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Main5_1 T = new Main5_1();
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        System.out.println(T.solution(s));
    }
}
