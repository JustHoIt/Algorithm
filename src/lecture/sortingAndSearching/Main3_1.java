package lecture.sortingAndSearching;

import java.util.Scanner;

/*삽입 정렬*/
public class Main3_1 {
    public int[] solution(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            int tmp = nums[i];
            int j = 0;
            for (j = i - 1; j >= 0; j--) {
                if (nums[j] > tmp) {
                    nums[j + 1] = nums[j];
                } else {
                    break;
                }
            }
            nums[j + 1] = tmp;
        }
        return nums;
    }

    public static void main(String[] args) {
        Main3_1 T = new Main3_1();
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
