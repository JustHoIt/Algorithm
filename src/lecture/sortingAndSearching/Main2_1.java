package lecture.sortingAndSearching;

import java.util.Scanner;

/*버블 정렬*/
public class Main2_1 {
    public int[] solution(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length - 1 - i; j++) {
                if (nums[j] > nums[j + 1]) {
                    int tmp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = tmp;
                }
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        Main2_1 T = new Main2_1();
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] nums = new int[N];
        for (int i = 0; i < N; i++) {
            nums[i] = sc.nextInt();
        }
        for (int x : T.solution(nums)) {
            System.out.print(x + " ");
        }
    }
}
