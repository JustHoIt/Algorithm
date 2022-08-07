package String;

import java.util.Scanner;

public class Main7_2 {
    public String solution(String str) {
        String answer = "YES";  //seeS

        str = str.toUpperCase(); //SEES
        char[] s = str.toCharArray(); //c = [S,E,E,S]

        for (int i = 0; i < str.length() / 2; i++) {
            int lt = 0, rt = str.length() - 1;
            while (lt < rt) {
                if (s[lt] == s[rt]) {
                    lt++;
                    rt--;
                    if (lt == rt) {
                        break;
                    }
                } else {
                    answer = "NO";
                    break;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Main7_2 T = new Main7_2();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));
    }
}