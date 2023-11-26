package lecture.recursiveTreeGraph;

/* Tree 말단 노드 까지의 가장 짧은 경로(DFS)
 * 최단 거리는 BFS 가 맞지만 DFS 풀어 보기 */

import java.util.LinkedList;
import java.util.Queue;

public class Main9_1 {
    Queue<Integer> Q = new LinkedList<>();
    Node root;

    public int DFS(int answer, Node root) {
        if (root.lt == null && root.rt == null) {
            return answer;
        } else {
            return Math.min(DFS(answer + 1, root.lt), DFS(answer + 1, root.rt));
        }
    }

    public static void main(String[] args) {
        Main9_1 T = new Main9_1();
        T.root = new Node(1);
        T.root.lt = new Node(2);
        T.root.rt = new Node(3);
        T.root.lt = new Node(4);
        T.root.rt = new Node(5);
        System.out.println(T.DFS(0, T.root));
    }
}