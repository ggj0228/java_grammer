package C06EtcClass;
import java.util.*;

// <> : 제네릭
public class C04GenericMain {
    public static void main(String[] args) {
        String[] stArr = {"java", "python"};
        stChange(stArr,0,1);
        System.out.println(Arrays.toString(stArr)); // 자리가 체인지된 객체 출력

        Integer[] intArr = {10,20,30};
        intChange(intArr, 0, 1);
        System.out.println(Arrays.toString(intArr));


        allChange(intArr, 0 , 1);
        allChange(stArr, 0, 1);

        // 일반 객체 생성시
        Person p1 = new Person("hong");
        GenericPerson<String> p2 = new GenericPerson<>("hong");
        GenericPerson<Integer> p3 = new GenericPerson<>(10);
        // 제네릭 사용예시
        List<String> myList = new ArrayList<>();
    }
    /* **********************************************************************/
    // 제네릭 메서드는 반환타입 왼쪽에 <T>라고 선언
    // ⚠️이때 T에는 참조형변수인 객체타입만을 허용
    static <T> void allChange(T[] arr, int a, int b){
        T tmp = arr[a];
        arr[a] = arr[b];
        arr[b] = tmp;
    }
    static void stChange(String[] arr, int a, int b) {
        String tmp = arr[a];
        arr[a] = arr[b];
        arr[b] = tmp;
    }
    static void intChange(Integer[] arr, int a, int b) {
        Integer tmp = arr[a];
        arr[a] = arr[b];
        arr[b] = tmp;
    }

}
class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }
}

// 제네릭 클래스는 클래스명 옆에 <T> 선언 -> 객체를 만드는 시점에 타입을 지정하는 것임

class GenericPerson <T> {
    private T value;

    public GenericPerson(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "GenericPerson{" +
                "name='" + value + '\'' +
                '}';
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
