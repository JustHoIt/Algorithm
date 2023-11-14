package hashmaptreeset;

import java.util.HashMap;
import java.util.Scanner;

/*
* 아나그램 (HashMap)
* */
public class Main2_1 {
    public String solution(String s1, String s2) {
        String answer = "NO";
        HashMap<Character, Integer> map = new HashMap<>();
        for (char x : s1.toCharArray()) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        for (char x : s2.toCharArray()) {
            if (!map.containsKey(x) || map.get(x) == 0) {
                return answer;
            }
            map.put(x, map.get(x) - 1);
        }
        answer = "YES";
        return answer;
    }

    public static void main(String[] args) {
        Main2_1 M = new Main2_1();
        Scanner kb = new Scanner(System.in);
        String s1 = kb.next();
        String s2 = kb.next();
        System.out.println(M.solution(s1, s2));
    }
}
