package C03Inheritance;


// class에는 public, default 접근 제어자만 존재
public class C0304ProtectedClass {
    // 변수, 매서드에는 4가지 접근제어자가 존재
    // public: 프로젝트 전체에서 접근가능(다른 패키지여도 가능)
    // privaate : 클래스 내에서만 접근 가능
    // default : 생략가능. 패키지 내에서만 접근 가능
    // protected : 패키지를 벗어나더라도 상속관계이면 접근가능.

    public  String st1 =  "hello java1";

    private String st2 = " hello java2";

    String st3 = "hello java3";

    protected String st4  = "hello hava4";

}
