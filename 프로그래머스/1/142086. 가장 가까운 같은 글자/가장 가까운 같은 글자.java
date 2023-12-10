class Solution {
    public int[] solution(String s) {
         int[] answer = new int[s.length()] ;
        char[] st = s.toCharArray();
        answer[0] = -1;
        for (int i = 1; i <st.length ; i++) {
            int count = 0;
            answer[i] = -1;
            for (int j = i-1; j >= 0 ; j--) {
                count++;
                if(st[i] == st[j]){
                    answer[i] = count;
                    break;
                }
            }
        }


        return answer;
    }
}