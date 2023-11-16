package baekjoon;

import java.util.Scanner;

public class B10773 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt();
        int [] arr = new int [k];
        for (int i = 0; i <= k; i++) {
            int n = sc.nextInt();
            if(n == 0){
                arr[i - 1] = 0;
            }
        }
    }
}
