package Array;

import java.util.ArrayList;
import java.util.Scanner;

public class Main3_1 {
    public ArrayList<String> solution(int N, int[] A, int[] B) {
        ArrayList<String> answer = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            if(A[i] > B[i]) {
                if(A[i] == 3 && B[i] == 1) {
                    answer.add("B");
                }else{
                    answer.add("A");
                }
            }else if(A[i]< B[i]){
                if(A[i] == 1 && B[i] == 3) {
                    answer.add("A");
                }else{
                    answer.add("B");
                }
            }else{
                answer.add("D");
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Main3_1 T = new Main3_1();
        Scanner kb = new Scanner(System.in);
        int N = kb.nextInt();
        int[] A = new int[N];
        int[] B = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = kb.nextInt();
        }
        for (int i = 0; i < N ; i++) {
            B[i] = kb.nextInt();
        }
        for (String x : T.solution(N, A, B)) {
            System.out.println(x);
        }
    }
}