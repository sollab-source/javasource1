package exam;

public class Sub extends Calc {
    // 초기화를 하지 않아도 기본값(null)이 존재
    // Calc calc;
    // String str;
    // int i; //0

    @Override
    int calculate() {
        return a - b;
    }

}
