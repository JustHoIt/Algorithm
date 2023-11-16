package lecture.string;

import java.util.Scanner;

public class Main7_1 {
    public String solution(String str) {
        String answer = "YES";  //seeS

        str = str.toUpperCase();

        for (int i = 0; i < str.length() / 2; i++) {
            if(str.charAt(i) != str.charAt(str.length() - i -1)) {
                return "NO";
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Main7_1 T = new Main7_1();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));


    }
}