package test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
import java.util.Scanner;

/* 주말 개수 구하기*/
public class A001 {
    public int holidayCount(int N) {
        int count = 0;
        int year = 2023;

        LocalDate startDate = LocalDate.of(year, 1, 1);
        startDate = startDate.with(TemporalAdjusters.nextOrSame(DayOfWeek.of(N))); // 1월 1일을 N번째요일 1 = Mon, 2= Tue

        LocalDate endDate = LocalDate.of(year, 12, 31);

        while (!startDate.isAfter(endDate)) {
            if (startDate.getDayOfWeek() == DayOfWeek.SATURDAY || startDate.getDayOfWeek() == DayOfWeek.SUNDAY) {
                count++;
            }
            startDate = startDate.plusDays(1);
        }

        return count;
    }

    public static void main(String[] args) {
        A001 T = new A001();
        Scanner sc = new Scanner(System.in);
        System.out.println("1월 1일의 요일 입력 : ");
        int N = sc.nextInt();
        System.out.println(T.holidayCount(N));
    }
}
