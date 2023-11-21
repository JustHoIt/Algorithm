package lecture.sortingAndSearching;

import java.util.Arrays;
import java.util.Scanner;

/*중복 확인 (정렬로 풀기)*/
public class Main5_1 {
    public String solutions(int N, int[] nums) {
        String answer = "U";
        Arrays.sort(nums);
        for (int i = 0; i < N - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return "D";
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Main5_1 T = new Main5_1();
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] nums = new int[N];
        for (int i = 0; i < N; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println(T.solutions(N, nums));
    }
}
