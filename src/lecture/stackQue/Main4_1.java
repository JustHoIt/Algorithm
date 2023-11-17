package lecture.stackQue;

import java.util.Scanner;
import java.util.Stack;

/*후위식 연산(Stack)
* */
public class Main4_1 {
    public int solution(String s) {
        int answer = 0;
        Stack<Integer> st = new Stack<>();
        for (char x : s.toCharArray()) {
                if (Character.isDigit(x)) {
                    st.push(x - 48);
                } else {
                    int rt = st.pop();
                    int lt = st.pop();
                    if (x == '+') {
                        st.push(lt + rt);
                    } else if (x == '-') {
                        st.push(lt - rt);
                    } else if (x == '*') {
                        st.push(lt * rt);
                    } else if (x == '/') {
                        st.push( (lt / rt));
                    }
                }

        }
        answer = st.get(0);
        return answer;
    }

    public static void main(String[] args) {
        Main4_1 T = new Main4_1();
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(T.solution(s));
    }
}
