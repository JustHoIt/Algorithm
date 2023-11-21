package lecture.sortingAndSearching;

import java.util.Scanner;

/*Least Recently Used(삽입 정렬)*/
public class Main4_1 {
    public int[] solution(int S, int K, int[] nums) {
        int[] cache = new int[S];

        for (int x : nums) {
            int p = -1;
            for (int i = 0; i < S; i++) {
                if (x == cache[i]) {
                    p = i;
                }
            }
            if (p == -1) {
                for (int i = S - 1; i >= 1; i--) {
                    cache[i] = cache[i - 1];
                }
            } else {
                for (int i = p; i >= 1; i--) {
                    cache[i] = cache[i - 1];
                }
            }
            cache[0] = x;
        }
        return cache;
    }

    public static void main(String[] args) {
        Main4_1 T = new Main4_1();
        Scanner sc = new Scanner(System.in);
        int S = sc.nextInt();
        int K = sc.nextInt();
        int[] nums = new int[K];
        for (int i = 0; i < K; i++) {
            nums[i] = sc.nextInt();
        }
        for (int x : T.solution(S, K, nums)) {
            System.out.print(x + " ");
        }
    }
}
