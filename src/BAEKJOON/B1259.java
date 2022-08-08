package BAEKJOON;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class B1259 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> a = new ArrayList<>();
        for (int i = 0; ; i++) {
            int b = sc.nextInt();
            if (b == 0) {
                break;
            } else {
                a.add(i, b);
            }   //121  1 13131 155
        }
        String[] answer = new String[a.size()];
        for (int i = 0; i < a.size(); i++) {
            char[] c = String.valueOf(a.get(i)).toCharArray();  // 1541 = [1,5,4,1] 형식으로 만들어줌

            for (int j = 0; j <= c.length / 2; j++) {  //[1,5,4,1]
                int lt = 0, rt = c.length - 1;  // 1541  lt[0] = 1 : rt[len] = 1 => 1
                String tmp = "yes";
                while (lt < rt) {
                    if (c[lt] != c[rt]) {
                        tmp = "no";
                        break;
                    } else {
                        lt++;
                        rt--;
                    }
                }
                answer[i] = tmp;
            }
        }
        for (int i = 0; i < answer.length; i++) {
            System.out.println(answer[i]);
        }
    }
}