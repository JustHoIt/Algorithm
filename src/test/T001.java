package test;

import java.util.Scanner;
/*N 까지의 소수의 개수 구하기
* N을 입력받아 N까지의 소수 개수 구하기
* 조건  0 < N <= 100
* ex) N = 15 : 2, 3, 5, 7, 11 -> 6개*/
public class T001 {
    public int solution(int N) {
        int answer = 1;
        boolean isPrime = true;
        if (N < 3) {
            if (N == 0 || N == 1) {
                return 0;
            } else {
                return 1;
            }
        } else {
            for (int i = 3; i < N; i += 2) { //어차피 짝수는 소수가 아니다.
                isPrime = true;
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        isPrime = false;
                    }
                }
                if (isPrime) {
                    answer++;
                }
            }
        }
        return answer;
    }


    public static void main(String[] args) {
        T001 T = new T001();
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(T.solution(N));
    }
}
