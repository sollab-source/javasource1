package exam;

import java.util.Scanner;

public class CalcEx2 {
    public static void main(String[] args) {

        // 지역변수는 반드시 초기화 필요함
        // int i = 0;
        // System.out.println(i);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Input Num1 : ");
        int num1 = Integer.parseInt(scanner.nextLine());
        System.out.print("Input Num2 : ");
        int num2 = Integer.parseInt(scanner.nextLine());
        System.out.print("Input operator : ");
        String op = scanner.nextLine();

        Calc calc = null;
        switch (op) {
            case "+":
                calc = new Add();
                break;
            case "-":
                calc = new Sub();
                break;
            case "*":
                calc = new Mul();
                break;
            case "/":
                calc = new Div();
                break;
            default:
                break;
        }
        calc.setValue(num1, num2);
        System.out.println(calc.calculate());
    }
}
