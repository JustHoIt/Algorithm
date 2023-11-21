package lecture.sortingAndSearching;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/*장난 꾸러기 (Arrays.sort(), .clone()) */
public class Main6_1 {
    public ArrayList<Integer> solution(int[] nums) {
        ArrayList<Integer> answer = new ArrayList<>();
        int[] tmp = nums.clone(); //arr 복제 .clone();
        Arrays.sort(tmp);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != tmp[i]) {
                answer.add(i + 1);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Main6_1 T = new Main6_1();
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] nums = new int[N];
        for (int i = 0; i < N; i++) {
            nums[i] = sc.nextInt();
        }
        for (int x : T.solution(nums)
        ) {
            System.out.print(x + " ");
        }
    }
}
