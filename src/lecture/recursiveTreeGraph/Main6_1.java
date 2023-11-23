package lecture.recursiveTreeGraph;

/*부분 집합 구하기 (DFS)*/

import java.util.Scanner;

public class Main6_1 {
    static int n;
    static int[] ch;
    public void DFS(int L) {
        if (L == n + 1) {
            String tmp = "";
            for (int i = 1; i <= n; i++) {
                if (ch[i] == 1) {
                    tmp += (i + " ");
                }
            }
            if(tmp.length() > 0){
                System.out.println(tmp);
            }
        } else {
            ch[L] = 1;
            DFS(L + 1);
            ch[L] = 0;
            DFS(L + 1);
        }
    }

    public static void main(String[] args) {
        Main6_1 T = new Main6_1();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ch = new int[n + 1];
        T.DFS(1);
    }
}