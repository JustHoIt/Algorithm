package string;

import java.util.Scanner;

public class Main7_3 {
    public String solution(String str) {
        String answer = "NO";
        String tmp = new StringBuilder(str).reverse().toString();
        if(str.equalsIgnoreCase(tmp)) {  //ignoreCase
            answer ="YES";
        }

        return answer;
    }

    public static void main(String[] args) {
        Main7_3 T = new Main7_3();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));
    }
}