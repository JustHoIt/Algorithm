class Solution {
     public String[] solution(int n, int[] arr1, int[] arr2) {
          String[] answer = new String[n];
        for (int i = 0; i < arr1.length; i++) {
            answer[i] = String.valueOf(Long.parseLong(Long.toString(arr1[i], 2)) + Long.parseLong(Long.toString(arr2[i], 2)));
            if (answer[i].length() != n) {
                String v = "";
                for (int j = answer[i].length(); j < n; j++) {
                    v += "0";
                }
                answer[i] = v + answer[i];
            }
        }

        for (int i = 0; i < answer.length; i++) {
            answer[i] = answer[i].replaceAll("[1-9]", "#");
            answer[i] = answer[i].replaceAll("0", " ");
        }
        return answer;
    }
}