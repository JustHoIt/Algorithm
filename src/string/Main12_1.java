package string;

import java.util.Scanner;

public class Main12_1 {
    public String solution(int N, String str) { // #****## / #**####/ #**####/ #**##**
        String answer = "";
        for (int i = 0; i < N ; i++) {
            String tmp = str.substring(0, 7).replace("#","1" ).replace("*","0"); //substring으로 0~7까지 뽑은뒤 #과*을 1과 0으로 변환
            int num = Integer.parseInt(tmp,2);// 변환된 tmp를 2진수로 변환해줌
            answer += (char)num; //변환된 2진수를 char형으로 변환
            str= str.substring(7);

        }


        return answer;
    }

    public static void main(String[] args) {
        Main12_1 T = new Main12_1();
        Scanner kb = new Scanner(System.in);
        int N = kb.nextInt();
        String str = kb.next();
        System.out.println(T.solution(N,str));


    }
}