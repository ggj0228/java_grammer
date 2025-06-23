package C03Inheritance;

//extends 키워드를 통해 상속을 수행 -> 부모의 변수와 메서드를 자식 클래스에서 물려받는 것.
// java에서는 클래스의 다중상속을 지원하지 않음. -> 어떤 클래스의 어떠한 메서드를 호출하는 것인지에 대한 혼선이 음
public class C0301Inheritance extends Parents {
    public int b = 20;
    public static void main(String[] args) {
        C0301Inheritance c1 =  new C0301Inheritance();
        // 자식클래스에서 부모클래스의 a변수 상속
        System.out.println(c1.a);
        System.out.println(c1.b);
       // System.out.println(c1.c); -> X // private접근제어자는 자식클래스에서도 접근이 불가능

        // 메서드 상속
        c1.m1();
        c1.m2();
// 부모 메서드의 재정의(overriding): 부모클래스의 메서드명과 자식클래스의 메서드명이 동일한 상황
        c1.m1();

    }
    @Override  // 오버라이드된 매서드임을 명시적으로 표현하는 표현식. 성능 최적화를 위해서 해당 키워드 붙여주는 것이 더 좋음.!👍👍
    public void m1() {
        System.out.println("자식클래스입니다.");
    }
    public void m2() {
        System.out.println("자식클래스의 m2메서드");
    }
}

class Parents {
    public int a = 10;
    // private 접근 제어자는 클래스 내부에서만 가능 (자식 클래스에서도 접근이 불가능)
    private int c = 20;
    public void m1() {
        System.out.println("부모클래스입니다");
    }
}