package lecture.tpandsw;

import java.util.Scanner;

public class Main4_1 {
    public int solution(int n, int k, int[] arr) {  // 8 / 6 / [1 2 1 3 1 1 1 2]
        int answer = 0;
        int index = 0;
        int sum = 0;
        int lt = 0, rt = 0;
        for ( rt = 0; rt < arr.length; rt++) {
            sum += arr[rt];
            if (sum == k) {
                answer++;
            }
            while(sum >= k) {
                sum -= arr[lt];
                lt++;
                if(sum == k){
                    answer++;
                }
            }
        }


        return answer;
    }

    public static void main(String[] args) {
        Main4_1 T = new Main4_1();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print(T.solution(n, k, arr));

    }
}
