package lecture.array;

import java.util.Scanner;

public class Main7_1 {
    public int solution(int n, int[] arr) {
        int answer = 0;
        int cnt = 0;
        int dou = 1;

        for (int i = 0; i < n; i++) {
            if(i == 0){
                if(arr[0] == 1){
                    cnt++;
                }else{
                    cnt = 0;
                }
            }else{
                if(arr[i] == 1){
                    if(arr[i-1] == 1){
                        dou++;
                        cnt += dou;
                    }else{
                        cnt++;
                    }
                }else{
                    cnt = 0;
                    dou = 1;
                }
            }
            answer += cnt;
            cnt = 0;
        }


        return  answer;
    }
    public static void main(String[] args) {
        Main7_1 T = new Main7_1();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }
        System.out.println(T.solution(n,arr));
    }
}
