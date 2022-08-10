package string;

import java.util.Scanner;

public class Main3_2 {
    public String solution(String str) {
        String answer="";
        int max = Integer.MIN_VALUE;

        String[] s = str.split(" ");
        for (String x : s) {
            int len = x.length();
            if(len > max) {
                max = len;
                answer = x;
            }
        }


        return answer;
    }

    public static void main(String[] args) {
        Main3_2 T = new Main3_2();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.println(T.solution(str));
    }
}