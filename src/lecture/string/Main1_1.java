package lecture.string;

import java.util.Scanner;

public class Main1_1 {
    public int solution(String str, char t) {
        int answer = 0;
        str = str.toUpperCase(); //UpperCase 대문자로 변환
        t = Character.toUpperCase(t); //charAt 문자나 문자열의 idx를 조회할떄 사용
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == t) {
                answer ++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Main1_1 T = new Main1_1();
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        char c = sc.next().charAt(0); // 문자 1개를 리턴하게
        System.out.println(T.solution(str, c)); //solution 호출하고 넘기기


    }
}