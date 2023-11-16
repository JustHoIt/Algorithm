package lecture.string;

import java.util.Scanner;

public class Main2_2 {
    public String solution(String str) {

        String answer = "";

        for(char x : str.toCharArray()) {
            if(x>= 65 && x<=90) { //ASCII코드로 하기 대문자 65 ~ 90 소문자 97~122
                answer += (char)(x + 32);
            }else {
                answer += (char)(x - 32);
            }

        }
        return answer;
    }

    public static void main(String[] args) {
        Main2_2 T = new Main2_2();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        System.out.println(T.solution(str));
    }
}
