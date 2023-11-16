package lecture.tpandsw;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main1_1 {
    public List<Integer> solution(int n, int m, int[] arr, int[] arr2) {
        List<Integer> answer = new ArrayList<>();

        Arrays.sort(arr); //135
        Arrays.sort(arr2); //23679
        int p = 0;
        int p2 = 0;

        while (p < n && p2 < m) {
            if (arr[p] < arr2[p2]) {
                answer.add(arr[p]);
                p++;
            } else if (arr[p] > arr2[p2]) {
                answer.add(arr2[p2]);
                p2++;
            } else { // 두 값이 같을때 이렇게 해결해도 되고 위에 elif문을 else 로 바꾼후 그냥 p2를 넣고 p2증가시켜도 됨
                answer.add(arr2[p2]);
                answer.add(arr[p]);
                p++;
                p2++;
            }
        }
        while(p<n) {
            answer.add(arr[p]);
            p++;
        }
        while(p2<m) {
            answer.add(arr2[p2]);
            p2++;
        }

        return answer;
    }

    public static void main(String[] args) {
        Main1_1 T = new Main1_1();
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
