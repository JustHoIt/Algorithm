package array;

import java.util.ArrayList;
import java.util.Scanner;

public class Main1_1 {
    public ArrayList<Integer> solution(int n, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if(i == 0) {
                answer.add(0,arr[i]);
            }else{
                if(arr[i] > arr[i-1]) {
                    answer.add(arr[i]);
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Main1_1 T = new Main1_1();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }
        for (int x : T.solution(n, arr)) {
            System.out.print(x + " ");
        }
    }
}