package lecture.stackQue;

import java.util.Scanner;
import java.util.Stack;
/*쇠 막대기
* for문 으로 index 사용 없이 */
public class Main5_2 {
    public int solution(String s) {
        int answer = 0;
        char c = 's';
        Stack<Character> st = new Stack<>();
        for (int i = 0; i <s.length() ; i++) {
            if (s.charAt(i) == '('){
                st.push(s.charAt(i));
            }else {
                if(s.charAt(i - 1) == ')'){
                    st.pop();
                    answer += 1;
                }else {
                    st.pop();
                    answer += st.size();
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Main5_2 T = new Main5_2();
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        System.out.println(T.solution(s));
    }
}
