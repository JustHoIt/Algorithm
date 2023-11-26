package lecture.recursiveTreeGraph;

/* Tree 말단 노드 까지의 가장 짧은 경로(BFS)*/

import java.util.LinkedList;
import java.util.Queue;

public class Main10_1 {
    Node root;

    public int BFS(Node root) {
        Queue<Node> Q = new LinkedList<>();
        Q.offer(root);
        int L = 0;
        while (!Q.isEmpty()) {
            int len = Q.size();
            for (int i = 0; i < len; i++) {
                Node cur = Q.poll();
                if (cur.lt == null && cur.rt == null) {
                    return L;
                }
                if (cur.lt != null) {
                    Q.offer(cur.lt);
                }
                if (cur.lt != null) {
                    Q.offer(cur.rt);
                }
            }
            L++;
        }
        return L;
    }

    public static void main(String[] args) {
        Main10_1 T = new Main10_1();
        T.root = new Node(1);
        T.root.lt = new Node(2);
        T.root.rt = new Node(3);
        T.root.lt = new Node(4);
        T.root.rt = new Node(5);
        System.out.println(T.BFS(T.root));
    }
}