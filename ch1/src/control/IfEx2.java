package control;

import java.util.Scanner;

public class IfEx2 {
    public static void main(String[] args) {
        // 점수를 입력받아 A,B,C,D 등급 출력
        // >= 90 A, >=80 B, >=70 C, D

        Scanner sc = new Scanner(System.in);
        int jumsu = Integer.parseInt(sc.nextLine());

        // if~else if~else
        // if (jumsu >= 90) {
        // System.out.println("등급 : A");
        // } else if (jumsu >= 80) {
        // System.out.println("등급 : B");
        // } else if (jumsu >= 70) {
        // System.out.println("등급 : C");
        // } else {
        // System.out.println("등급 : D");
        // }

        // 변수 유효범위
        // 선언 위치에 따라 사용 범위가 달라짐
        char grade = ' ';

        if (jumsu >= 90) {
            grade = 'A';
        } else if (jumsu >= 80) {
            grade = 'B';
        } else if (jumsu >= 70) {
            grade = 'C';
        } else {
            grade = 'D';
        }
        System.out.println("등급 : " + grade);
    }
}
