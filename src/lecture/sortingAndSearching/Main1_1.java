package lecture.sortingAndSearching;

import java.util.Scanner;

/*선택 정렬*/
public class Main1_1 {
    public int[] solutions(int N, int[] nums) {
        for (int i = 0; i < N - 1; i++) {
            int idx = i;
            for (int j = i + 1; j < N; j++) {
                if (nums[j] < nums[idx]) {
                    idx = j;
                }
            }
            int tmp = nums[i];
            nums[i] = nums[idx];
            nums[idx] = tmp;
        }
        return nums;
    }

    public static void main(String[] args) {
        Main1_1 T = new Main1_1();
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] nums = new int[N];
        for (int i = 0; i < N; i++) {
            nums[i] = sc.nextInt();
        }
        for (int x : T.solutions(N, nums)) {
            System.out.print(x + " ");
        }
    }
}
