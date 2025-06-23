package C02ClassBasic;

import java.util.*;

public class C11RecursiveBasic {
    public static void main(String[] args) {
       recur1(0, 3);

       recur2(new ArrayList<>(), 0, 3);
    }

    public static void recur0(int count, int repeat) {
        if (count == repeat) {
            return;
        }
        System.out.println("재귀호출 전 count: " + count); // 0(첫번째) -> 1(두번째) -> 2(세번째)
        recur0(count+1, repeat);
        System.out.println("재귀호출 후  count: " + count); //  0(여섯번째) -> 1(다섯번째) -> 2(네번째)
    }

    // 아래함수 출력순서 : 전c:0 > 전c:1 -> 전c:2 -> 후c:3 -> 후c:2 -> 후c:1
    public static void recur1(int count, int repeat) {
        if (count == repeat) {
            return;
        }
        System.out.println("재귀호출 전 count: " + count);
        count  = count + 1;
        recur1(count, repeat);
        System.out.println("재귀호출 후  count: " + count);
    }
    // 객체를 매개변수로 활용한 재귀함수 : 객체는 힙메모리를 통해 원본객체가 벼녁ㅇ될 수 있으므로, 재귀함수 간에 값이 일치되는 현상 발생
    public static void recur2 (List<Integer> myList, int num, int target) {
        if(myList.size() == target) {
            return;
        }
        myList.add(num);
        recur2(myList, num + 1, target);
        System.out.println(myList.get(num));
    }


}
