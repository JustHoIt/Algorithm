package lecture.sortingAndSearching;

import java.util.Arrays;
import java.util.Scanner;

/*이분 검색 */
public class Main8_1 {
    public int solution(int M, int[] nums) {
        int answer = 0;
        Arrays.sort(nums);
        int lt = 0;
        int rt = nums.length - 1;
        while (lt <= rt) {
            int mid = (lt + rt) / 2;
            if(nums[mid] == M){
                answer = mid + 1;
                break;
            }
            if(nums[mid] > M){
                rt = mid -1;
            }else {
                lt = mid + 1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Main8_1 T = new Main8_1();
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
