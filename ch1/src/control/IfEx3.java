package control;

import java.util.Scanner;

public class IfEx3 {
    public static void main(String[] args) {
        // 중첩 if
        // if 블럭 내에 또 다른 if문 포함(횟수 제한 없음)
        // if (true) {
        // if (condition) {
        // if (condition) {

        // } else if (){

        // } else{}
        // } else {

        // }
        // } else {

        // }

        // 점수 입력받기
        // 90 점보다 크거나 같으면 A 학점
        // 90 점 중에서 98점 이상은 A+ 학점
        // 95 ~ 97 : A0 학점
        // 90 ~ 94점 : A- 학점

        Scanner sc = new Scanner(System.in);
        int jumsu = Integer.parseInt(sc.nextLine());

        char grade = ' ', opt = '0';

        if (jumsu >= 90) {
            grade = 'A';
            if (jumsu >= 98) {
                opt = '+';
            } else if (jumsu < 95) {
                opt = '-';
            }
        } else if (jumsu >= 80) {
            grade = 'B';
            if (jumsu >= 88) {
                opt = '+';
            } else if (jumsu < 85) {
                opt = '-';
            }
        } else {
            grade = 'C';
        }
        // 당신의 학점은 A+ 입니다
        System.out.printf("당신의 학점은 %c%c 입니다.", grade, opt);
    }
}
