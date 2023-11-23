package lecture.recursiveTreeGraph;

/*이진 트리 순회(BFS - Breadth First Search)
 * 하나의 정점으로부터 시작하여 차례대로 모든 정점들을 한 번씩 방문하는 것 */


import java.util.LinkedList;
import java.util.Queue;

public class Main7_1 {
    Node root;

    public void BFS(Node root) {
        Queue<Node> Q = new LinkedList<>();
        Q.offer(root);
        int L = 0;
        while (!Q.isEmpty()) {
            int len = Q.size(); // len = 1;
            System.out.print(L + " : ");
            for (int i = 0; i < len; i++) {
                Node cur = Q.poll();
                System.out.print(cur.data + " ");
                if (cur.lt != null) {
                    Q.offer(cur.lt);
                }
                if (cur.rt != null) {
                    Q.offer(cur.rt);
                }
            }
            L++;
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Main7_1 tree = new Main7_1();
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        tree.root.rt.lt = new Node(6);
        tree.root.rt.rt = new Node(7);
        tree.root.lt.lt.lt = new Node(8);
        tree.root.lt.lt.rt = new Node(9);
        tree.root.lt.rt.lt = new Node(10);
        tree.root.lt.rt.rt = new Node(11);
        tree.root.rt.lt.lt = new Node(12);
        tree.root.rt.lt.rt = new Node(13);
        tree.root.rt.rt.lt = new Node(14);
        tree.root.rt.rt.rt = new Node(15);
        tree.BFS(tree.root);

    }
}