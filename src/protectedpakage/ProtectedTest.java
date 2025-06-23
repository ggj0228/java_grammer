package protectedpakage;


// 같은 패키지내의 클래스가 아닌 경우에는 import 필요
// 패키지 바로 하위의 모든 클래스는 *로 import가능
// BUT, 패키지 내의 패키지 안 클래스는 *로 import불가
import C03Inheritance.*;

public class ProtectedTest extends C0304ProtectedClass {
    public static void main(String[] args) {
        ProtectedTest p1 = new ProtectedTest();
        // public 접근 제어자는 프로젝트 전역에서 접근 가능
        p1.st1 = "hello python";

        // 패키지가 달라졌으므로 defalut변수는 접근 불가
        //p1.st3 = "hello python";


        // 상속관계가 있을경우, 패키지가 달라도 protected 변수에 접근 가능.
        p1.st4 = "hello python";
    }
}
