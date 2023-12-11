class Solution {
    public String solution(int[] foods) {
        String answer = "";
        StringBuffer L = new StringBuffer();
        StringBuffer R = new StringBuffer();

        for (int i = 1; i < foods.length ; i++) {
            if(foods[i]%2 != 0){
                foods[i] -= 1;
            }
        }
        for (int i = 1; i < foods.length; i++) {
           int N = foods[i] / 2;
           while (N != 0){
               L.append(i);
               N--;
           }
        }
        String Ls = L.toString();
        for (int i = Ls.length() -1; i >= 0 ; i--) {
            R.append(Ls.charAt(i));
        }
        answer += L;
        answer += 0;
        answer += R;

        return answer;
    }
}