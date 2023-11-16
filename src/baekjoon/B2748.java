package baekjoon;

import java.util.Scanner;

/*
 * BAEKJOON-2748
 * 피보나치 수
 * 메모리 12868kb / 시간 108ms / 코드길이 498
 * B2747,B2749,B10826,B10870
 * */

public class B2748 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long [] num = new long[(int) (n+1)];
        if (n < 2) {
            System.out.println(n);
        } else {
            num[0] = 0;
            num[1] = 1;
            for (int i = 2; i <= n; i++) {
                num[i] = num[i - 1] + num[i - 2];
            }
            System.out.println(num[(int) n]);
        }

    }
}


