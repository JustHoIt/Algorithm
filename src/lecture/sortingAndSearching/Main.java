package lecture.sortingAndSearching;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public int[] solutions(int[] nums) {
        Arrays.sort(nums);

        return nums;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] nums = new int[N];
        for (int i = 0; i < N; i++) {
            nums[i] = sc.nextInt();
        }
        for (int x : T.solutions(nums)) {
            System.out.print(x+ " ");
        }
    }
}
