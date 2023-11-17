package lecture.stackQue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/*교육과정설계(Que, Q.contains(x))
* */
public class Main7_1 {
    public String solution(String S1, String S2){
        String answer = "NO";
        Queue<Character> Q = new LinkedList<>();
        for(char x : S1.toCharArray()){
            Q.offer(x);
        }
        for (char x: S2.toCharArray()) {
            if(Q.contains(x)){
                if(x != Q.poll()){
                    return answer;
                }
            }
        }
        if(!Q.isEmpty()){
            return answer;
        }
        answer = "YES";

        return answer;
    }
    public static void main(String[] args) {
        Main7_1 T = new Main7_1();
        Scanner sc = new Scanner(System.in);
        String S1 = sc.next();
        String S2 = sc.next();
        System.out.println(T.solution(S1, S2));
    }
}
