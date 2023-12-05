package test;

import java.util.Arrays;
import java.util.HashSet;

public class T002 {
    public int solution(String[] arr) {
        int answer = 0;
        int result1 = 1;
        int result2 = 1;
        HashSet<String> hs = new HashSet<>(Arrays.asList(arr));
        arr = hs.toArray(new String[0]); //hashset에 arr를 넣었다 다시 담으면 중복이 제거됨
        int l = hs.size();
        int r = 4;

        for (int i = l; i >= l - 3; i--) {
            result1 *= i;
        }
        for (int i = 1; i <= r; i++) {
            result2 *= i;
        }
        answer = result1 / result2;
        return answer;
    }


    public static void main(String[] args) {
        T002 T = new T002();
        String[] arr = {"자바", "파이썬", "C", "C", "C++", "Js", "R", "파이썬", "자바"};
        System.out.println(T.solution(arr));
    }
}
