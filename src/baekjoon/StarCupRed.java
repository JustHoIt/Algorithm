package baekjoon;


import java.util.Scanner;

public class StarCupRed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if(n >= 620){
            System.out.println("Red");
        } else if (n >= 590) {
            System.out.println("Orange");
        }else if (n >= 570 ) {
            System.out.println("Yellow");
        }else if (n >= 495) {
            System.out.println("Green");
        }else if (n >= 450) {
            System.out.println("Blue");
        }else if (n >= 425) {
            System.out.println("Indigo");
        }else {
            System.out.println("Violet");
        }

    }
}