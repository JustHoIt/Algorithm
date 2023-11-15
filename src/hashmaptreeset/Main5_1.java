package hashmaptreeset;

import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

/*
 * K번째 큰 수(Tree Set)
 * */
public class Main5_1 {
    public int solution(int N, int K, int[] arr) {
        int answer = -1;
        TreeSet<Integer> set = new TreeSet<>(Collections.reverseOrder()); //내림차순으로 자동정렬함
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                for (int l = j + 1; l < N; l++) {
                    set.add(arr[i] + arr[j] + arr[l]);
                }
            }
        }
        int cnt = 0;
        for(int x : set){
            cnt++;
            if(cnt == K){
                return x;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Main5_1 m = new Main5_1();
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(m.solution(N, K, arr));
    }
}
