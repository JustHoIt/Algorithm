package lecture.stackQue;


import java.util.Scanner;
import java.util.Stack;

/*크레인 인형 뽑기(Stack)*/
public class Main3_1 {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> st = new Stack<>();
        for(int x : moves){
            for (int i = 0; i < board.length; i++) {
                if(board[i][x-1] != 0){
                    int tmp = board[i][x-1];
                    board[i][x-1] = 0;
                    if(!st.isEmpty() && tmp == st.peek()){
                        answer += 2;
                        st.pop();
                    }else {
                        st.push(tmp);
                    }
                    break;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Main3_1 T = new Main3_1();
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[][] board = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                board[i][j] = sc.nextInt();
            }
        }
        int M = sc.nextInt();
        int[] moves = new int[M];
        for (int i = 0; i < M; i++) {
            moves[i] = sc.nextInt();
        }
        System.out.println(T.solution(board, moves));
    }
}
