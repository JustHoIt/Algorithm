//package test;
//
//public class Main {
//    public String solution(String new_id) {
//        String answer = "";
//        String str ="";
//        new_id = "  ";
//
//        new_id = new_id.toLowerCase(); //1단계
//        // ------------------------------------------------------------------------
//        new_id = new_id.replace("...",".").replace("..","."); //2단계
//        // ------------------------------------------------------------------------
//        new_id = new_id.replaceAll("[^a-zA-Z0-9-_.]",""); //3단계
//        // ------------------------------------------------------------------------
//        char[] c = new_id.toCharArray();  //4단계
//        System.out.println(c);
//        if(c[0] == '.'){
//            for (int i = 1; i < c.length; i++) {;
//                str += c[i];
//            }
//            new_id = str;
//        }
//        str = "";
//        char[] c2 = new_id.toCharArray();
//        if(c2[c2.length-1] == '.'){
//            for (int i = 0; i <c2.length-1 ; i++) {
//                str += c2[i];
//            }
//            new_id =str;
//        }
//        // ------------------------------------------------------------------------
//        if(new_id == null) {
//            new_id = "a";
//        }
//        System.out.println(new_id);
//
//
//
//        return answer;
//    }
//
//    public static void main(String[] args) {
//        Main t = new Main();
//        String new_id = "=.=";
//        //"...!@BaT#*..y.abcdefghijklm."
//
//        System.out.println(t.solution(new_id));
//    }
//}
