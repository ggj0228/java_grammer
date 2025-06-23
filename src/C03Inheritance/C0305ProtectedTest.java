package C03Inheritance;

public class C0305ProtectedTest {
    public static void main(String[] args) {
        C0304ProtectedClass p1 = new C0304ProtectedClass();
        p1.st1 = "hello python";  // public
        //C0304ProtectedClass.st2 = "hello python"; -> private
        p1.st3 = "hello pyton";   // default

        C0304ProtectedClass p2 = new C0304ProtectedClass();
        //p2는 부모클래스의 객체이므로, 상속관계가 있는 객체 X
        // 즉, protected 변수에 접근 불가능
        // p2.st4 = "hello python";
    }
}
