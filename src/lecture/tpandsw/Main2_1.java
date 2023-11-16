package lecture.tpandsw;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main2_1 {
    public List<Integer> solution(int n, int m, int[] arr, int[] arr2) {
        List<Integer> answer = new ArrayList<>();

        Arrays.sort(arr);
        Arrays.sort(arr2);
        int p1 = 0, p2 = 0;
        // [1, 2, 3, 5, 9]
        // [2, 3, 5, 7, 8]
        while (p1 < n && p2 < m) {
            if(arr[p1] == arr2[p2]){
                answer.add(arr[p1]);
                p1++;
                p2++;
            }else if(arr[p1] < arr2[p2]) {
                p1++;
            }else {
                p2++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Main2_1 T = new Main2_1();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int[] arr2 = new int[m];
        for (int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();
        }

        for (int x : T.solution(n, m, arr, arr2)) {
            System.out.print(x + " ");
        }

    }
}