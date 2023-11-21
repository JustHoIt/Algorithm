package lecture.sortingAndSearching;

import java.util.Arrays;
import java.util.Scanner;

/*결정 알고리즘*/
public class Main10_1 {
    public int count(int[] arr, int dist) {
        int cnt = 1; //
        int ep = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] - ep >= dist){
                cnt++;
                ep = arr[i];
            }
        }
        return cnt;
    }

    public int solution(int C, int[] nums) {
        int answer = 0;
        int tmp = 0;
        Arrays.sort(nums);
        int lt = 1;
        int rt = nums[nums.length -1];
        while (lt<= rt){
            int mid = (lt + rt)/ 2;
            if(count(nums, mid) >= C){
                answer = mid;
                lt =mid + 1;
            }else {
                rt = mid - 1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Main10_1 T = new Main10_1();
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int C = sc.nextInt();
        int[] nums = new int[N];
        for (int i = 0; i < N; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println(T.solution(C, nums));
    }
}
