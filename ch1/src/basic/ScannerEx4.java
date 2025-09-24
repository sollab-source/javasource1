package basic;

import java.util.Scanner;

public class ScannerEx4 {
    public static void main(String[] args) {
        // ScannerEx3 개선
        Scanner sc = new Scanner(System.in);
        System.out.print("첫번째 숫자입력 : ");

        // 입력받기 : sc.nextLine() ==> ""
        // "" 을 없애야 한다면 : Integer.parseInt or Float.parseFloat or Double.parseDouble
        // String num1 = sc.nextLine(); // 35 엔터
        int input1 = Integer.parseInt(sc.nextLine());
        // float input1 = Float.parseFloat(sc.nextLine());
        // double input1 = Double.parseDouble(sc.nextLine());

        System.out.print("연산자 입력 : "); // +,-,*,/
        String op = sc.nextLine();

        System.out.print("두번째 숫자입력 : ");
        int input2 = Integer.parseInt(sc.nextLine());
        System.out.println(op);
        System.out.println(input1 + input2);
        sc.close();
    }
}
