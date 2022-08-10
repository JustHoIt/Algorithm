package string;

import java.util.*;

public class Main4_1 {
    public ArrayList<String> solution(int n, String[] str) {
        ArrayList<String> answer = new ArrayList<>();

        for(String x : str) {
            String tmp = new StringBuilder(x).reverse().toString(); //문자뒤집고, 다시 단어 만들기
            answer.add(tmp);
        }


        return answer;
    }

    public static void main(String[] args) {
        Main4_1 T = new Main4_1();
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
