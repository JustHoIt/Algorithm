package lecture.string;

import java.util.Scanner;

public class Main11_2 {
    public String solution(String str) { //KKHSSSSSSE
        String answer = "";
        str += " ";  // for j 문에서 str.length()값이되면 비교할 i+1이 없어서 오류가 생겨서 임시로 생성하기

        for (int i = 0; i < str.length()-1; i++) {
            char c = str.charAt(i); // i = 0 : c = K /
            int count = 1;
            for (int j = i+ 1; j < str.length(); j++) {
                if(c == str.charAt(j)){
                    count++;
                    i++;
                }else{
                    answer += str.charAt(i) + String.valueOf(count);
                    break;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Main11_2 T = new Main11_2();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));


    }
}