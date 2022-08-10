package array;


import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main8_1 {
    public int[] solution(int n, int[] arr) {
        int[] answer = new int[n];

        Integer[] arr2 = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        Arrays.sort(arr2, Collections.reverseOrder());
//        System.out.println(Arrays.toString(arr2));

        for (int i = 0; i < arr.length; i++) {           //arr  : 87 89 92 100 76
            for (int j = 0; j < arr2.length; j++) {      //arr2 : 100 92 89 87 76
                if (arr[i] == arr2[j]) {
                    answer[i] = j+1;
                    break;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Main8_1 T = new Main8_1();
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
