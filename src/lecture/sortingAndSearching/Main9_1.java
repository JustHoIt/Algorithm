package lecture.sortingAndSearching;

import java.util.Arrays;
import java.util.Scanner;

/*결정 알고리즘*/
public class Main9_1 {
    public int count(int[] arr, int capacity) {
        int cnt = 1; //dvd 장수 무조건 1장은 필요함
        int sum = 0;
        for (int x : arr) {
            if (sum + x > capacity) {
                cnt++;
                sum = x;

            } else {
                sum += x;
            }
        }
        return cnt;
    }

    public int solution(int M, int[] nums) {
        int answer = 0;
        int lt = Arrays.stream(nums).max().getAsInt();
        int rt = Arrays.stream(nums).sum();
        while (lt <= rt) {
            int mid = (lt + rt) / 2;
            if (count(nums, mid) <= M) {
                answer = mid;
                rt = mid - 1;
            } else {
                lt = mid + 1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Main9_1 T = new Main9_1();
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] nums = new int[N];
        for (int i = 0; i < N; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println(T.solution(M, nums));
    }
}
