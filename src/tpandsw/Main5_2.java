package tpandsw;

import java.util.Scanner;

public class Main5_2 {

    public int solution(int N) {
        int answer = 0;
        int cnt = 1;
        N--;
        while (N > 0) {
            cnt++;
            N -= cnt;
            if(N% cnt == 0){
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Main5_2 T = new Main5_2();
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(T.solution(N));
    }
}