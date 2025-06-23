package C04Interface;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class C01InterfaceMain {
    public static void main(String[] args) {
        C01Cat cat1 = new C01Cat();
        cat1.makeSound();
        C01Dog dog1 = new C01Dog();
        dog1.makeSound();


        // 다형성 : 하나의 부모타입으로 여러 자식개체를 다룰 수 있음.
        C01AnimalInterface1 cat2 = new C01Cat();
        cat2.makeSound();
        C01AnimalInterface1 dog2 = new C01Dog();
        dog2.makeSound();

        // 예시
        // 인터페이스의 장점: 개발의 표준을 지정⚠️⚠️
        // 다형성의 장점: 기존의 구현체를 다른 구현체로 변경시 이점.👍
        List<Integer> myList1 = new ArrayList<>();
        List<Integer> myList2 = new LinkedList<>();

        // 다중구현(상속)
        C01AnimalInterface1 cat3 = new C01Cat();
        cat3.makeSound();

        C01AnimalInterfac2 dog3 = new C01Dog();
        System.out.println(dog3.play("푸들", "시바"));

        // 다중구현 예시 -> 인터페이스에 따라 사용가능 메서드가 제한.
        List<Integer> list = new LinkedList<>();
        Queue<Integer> queue = new LinkedList<>();

    }
}
