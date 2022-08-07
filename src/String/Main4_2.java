package String;

import java.util.ArrayList;
import java.util.Scanner;

public class Main4_2 {
    public ArrayList<String> solution(int n, String[] str) {
        ArrayList<String> answer = new ArrayList<>();

        for(String x : str) {
            char[] s = x.toCharArray(); //단어를 문자 배열화 시킴 즉,time 이란 단어를 가져오면 char[] s= [t,i,m,e]로 변화시킴
            int lt = 0, rt = x.length() -1;
            while (lt<rt) {
                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;
                lt ++;
                rt --;
            }
            String tmp = String.valueOf(s);
            answer.add(tmp);
        }

        return answer;
    }




    public static void main(String[] args) {
        Main4_2 T = new Main4_2();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] str = new String[n];
        for (int i = 0; i < n; i++) {
            str[i] = sc.next();
        }

        for(String x : T.solution(n, str)) {
            System.out.println(x);
        }

    }
}
