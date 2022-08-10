package array;

import java.util.Scanner;

public class Main2_1 {
    public int solution(int[] arr) {
        int answer = 1;
        int idx = arr[0]; //첫번째 아이는 무조건 보이므로 첫번째아이를 첫 기준으로 잡음.
        for (int i = 1; i < arr.length; i++) {
             if (arr[i] > idx) {   //i 번째의 아이가 기준 키보다 크다면 볼수 있는 학생 수 증가 하고 기준으로 i번째의 아이로 변경
                answer++;
                idx = arr[i];
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Main2_1 T = new Main2_1();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }
        System.out.println(T.solution(arr));
    }
}
