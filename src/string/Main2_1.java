package string;

import java.util.Scanner;

public class Main2_1 {
    public String solution(String str) {

        String answer = "";

        for(char x : str.toCharArray()) {
            if(Character.isLowerCase(x)) {
                answer += Character.toUpperCase(x);
            }else {
                answer += Character.toLowerCase(x);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Main2_1 T = new Main2_1();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        System.out.println(T.solution(str));
    }
}
