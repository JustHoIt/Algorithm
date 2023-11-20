package lecture.sortingAndSearching;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*좌표 정렬 (Collections.sort(), compareTo) */
class Point implements Comparable<Point> {
    public int x, y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    @Override
    public int compareTo(Point o){
        if(this.x == o.x) {
            return this.y - o.y; //내림차순은 o.y - this.y;
        }else {
            return this.x - o.x; //내림차순은 o.x - this.x;
        }
    }
}

public class Main7_1 {
    public static void main(String[] args) {
        Main7_1 T = new Main7_1();
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        ArrayList<Point> nums =new ArrayList<>();

        for (int i = 0; i < N ; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            nums.add(new Point(x, y));
        }
        Collections.sort(nums);
        for (Point o: nums) {
            System.out.println(o.x +" " +o.y);
        }
    }
}
