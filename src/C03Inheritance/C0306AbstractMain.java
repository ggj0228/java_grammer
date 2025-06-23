package C03Inheritance;

//fianl키워드가 붙은 class는 상속 불가, final키워드가 붙은 메서드는 overriding 불가
//public class C0306AbstractMain extends FinalParents {
public class C0306AbstractMain  {
    public static void main(String[] args) {
        AbstractDog d1 = new AbstractDog();
        d1.makeSound1();
        d1.makeSound2();
        // 추상 클래스는 구현체가 없는 메서드가 있으므로, 기본적으로 객체 생성 불가능
       // AbstractAnimal a1 = new AbstractAnimal();

        // 객체의 실체가 Dog클래스를 통해 만들어지므로, 여기서는 d2의 makeSound2를 사용가능
        AbstractAnimal d2 = new AbstractDog();
        d1.makeSound1();
        d1.makeSound2();


        // 모든 메서드가 abstract인 클래스를 인터페이스라 한다.
        // 인터페이스는 구현체가 없으므로, 기본적으로 별도의 객체 생성이 불가
        //List<Integer> list = new List<>();
    }
}

// 추상메서드가 하나라도 있으면 반드시 클래스에도 abstract키워드를 붙이고, 추상클래스가 됨
abstract class AbstractAnimal {
    void makeSound1() {
        System.out.println("동물은 소리를 냅니다.");
    }

    // 메서드를 선언만하고 구현이 없는 메서드 선언시 abstract키워드 사용. -> 자식클래스에게 메서드 구현해야만 함
    abstract void makeSound2();
}

class AbstractDog extends AbstractAnimal {

    @Override
    void makeSound2() {
        System.out.println("멍멍");
    }
}

final class FinalParents {

}