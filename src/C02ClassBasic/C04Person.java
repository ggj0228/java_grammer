package C02ClassBasic;

public class C04Person {

    // private 접근 제어자는 해당 클래스 내에서만 접근 가능
    // 클래스에서 객체변수는 일반적으로 변수의 안정성을 위해 private으로 설정
    private String name;

    private String email;

    private int age;

    // 메서드는 public하게 별도로 만들고 의도를 명확히 하여, 변수의 안정성을 향상시킨다.


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

// 객체 메서드들끼리의 호출은 객체가 만들어져있다라는 것을 가정하고 있으므로, 문제없이 호출 가능
    public String printPerson() {
        return "이름: " + this.name + ", 이메일: " + this.email + ", 나이: " + this.age;
    }
    public String printPerson2() {
        String tmp = this.printPerson();
       return tmp;
    }
    // 클래스메서드는 기본적으로 객체생성을 가정하지 않으므로, 클래스메서드내에서 객체메서드를 호출하는 것은 논리적 모순.
    public static String printPerson3() {
//        String temp = this.printPerson();  // 불가능
        return null;
    }
}
