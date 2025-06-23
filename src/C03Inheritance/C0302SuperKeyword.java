package C03Inheritance;


// 부모 클래스를 상속받을 떄 부모클래스의 기본 생성자가 없으면 자식클래스에서 상속시 기본적으로 에러 발생.
public class C0302SuperKeyword extends SuperParents {
    int a = 10;

    C0302SuperKeyword() {
        //super() : 부모클래스의 생성자를 호출하는 매서드
        super(20);
        this.a = 10;
    }

    public static void main(String[] args) {
        C0302SuperKeyword c2 = new C0302SuperKeyword();
        c2.display();

    } //main 메서드끝
    public void display() {
        System.out.println("자식의 변수 : " + a);
        System.out.println("부모의 변수 : " + super.a);
    }
}
class SuperParents {
    int a = 20;

    public SuperParents(int a) {
        this.a = a;

    }


}