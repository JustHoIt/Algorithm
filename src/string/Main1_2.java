package string;

import java.util.Scanner;

public class Main1_2 {
    public int solution(String str, char t) {
        int answer = 0;
        str = str.toUpperCase(); //UpperCase 대문자로 변환
        t = Character.toUpperCase(t); //charAt 문자나 문자열의 idx를 조회할떄 사용
        for(char x : str.toCharArray()) // 문자열을 분해해서 문자 하나하나를 원소로 갖는 배열생성
            if(x == t) {
                answer++;
            }

        return answer;
    }

    public static void main(String[] args) {
        Main1_2 T = new Main1_2();
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        char c = sc.next().charAt(0); // 문자 1개를 리턴하게
        System.out.println(T.solution(str, c)); //solution 호출하고 넘기기


    }
}