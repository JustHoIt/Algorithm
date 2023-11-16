package lecture.string;

import java.util.Scanner;

public class Main3_1 {
    public String solution(String str) {
        String answer="";
        int max = Integer.MIN_VALUE,  pos;

       while ((pos = str.indexOf(' ')) != -1) {
           String tmp = str.substring(0, pos);
           int len  = tmp.length();
           if(len > max) { // 길이가 같다면 앞쪽단어를 출력해야하기 때문에  > 를 사용 >= 사용하면 같은길이의 단어는 뒤에 나오는 단어로 변경됨.
               max = len;
               answer = tmp;
           }
           str = str.substring(pos + 1);
       }
        if(str.length()>max){
            answer = str;
        }
        return answer;
    }

    public static void main(String[] args) {
        Main3_1 T = new Main3_1();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.println(T.solution(str));
    }
}
