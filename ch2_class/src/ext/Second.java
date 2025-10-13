package ext;

// 다른 패키지에 있는 클래스 사용
import exam.Parent;

// public class Second{
//     Parent parent = new Parent();

//     public void print(){
//         // default 로 선언된 경우 다른 패키지에서 접근 불가
//         parent.name = "성춘향";
//         // protected : 상속관계가 있으면 다른 패키지라도 허용
//         parent.grade = "A";
//     }
// }

public class Second extends Parent {

    public void info() {
        // default 로 선언된 경우 다른 패키지에서 접근 불가
        // super.name = "성춘향";
        super.grade = "B";
        super.getNum1();
    }

    @Override
    public int getNum1() {

        return super.getNum1();
    }
}
