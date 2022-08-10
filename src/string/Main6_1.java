package string;

import java.util.Scanner;

public class Main6_1 {
    public String solution(String str) {
        String answer = "";

        for (int i = 0; i < str.length(); i++) {
            int indexOf = str.indexOf(str.charAt(i));
//            System.out.println(str.charAt(i) + " " + i + " " + indexOf);
            if(indexOf == i) {
                answer += str.charAt(i);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Main6_1 T = new Main6_1();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));
    }
}
