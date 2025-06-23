package C02ClassBasic;

import java.util.*;

public class C03Class {
    public static void main(String[] args) {
//        System.out.println(MyCalculator.sum(10, 20));
//        // A부서의 매출
//        // 20원 매출 발생
//        System.out.println(MyCalculator.sumAcc(20));
//        // 30원 매출 발생
//        System.out.println(MyCalculator.sumAcc(30));
//        // 40원 매출 발생
//        System.out.println(MyCalculator.sumAcc(40));
//        // 누적합 : 90원
///* **************************************************************** */
//
//        // B부서의 매출
//        // 10원 매출 발생
//        System.out.println(MyCalculator.sumAcc(10));  // 100원 - > 10원이 되야 함
//        // 20원 매출 발생
//        System.out.println(MyCalculator.sumAcc(20)); // 120원  -> 20원이 되야 함
//        // 클래스 메서드는 변수의 재활용 x
/* ************************************************************************ */

        // 객체를 활용한 매출 계산
        // A회사 매출 : 10원, 20원
//        MyCalculatorIstance mi1 = new MyCalculatorIstance();
//        // MyCalculator.sumAcc(); static이 없으므로 sumAcc() 호출이 불가. -> 객체로 만들어서 호출해야 함
//        mi1.sumAcc(10);
//        System.out.println(mi1.total);
//        mi1.sumAcc(20);
//        System.out.println(mi1.total);
//        // B회사 매출 : 10원, 20원
//        MyCalculatorIstance mi2 = new MyCalculatorIstance();
//        mi2.sumAcc(10);
//        System.out.println(mi2.total);
//        mi2.sumAcc(10);
//        System.out.println(mi2.total);
//
//        System.out.println(MyCalculatorIstance.total_count);
//
//        // 자료구조에서 객체 사용 예시
//        /* ************************** */
//        // 배열
//        String[] arr1 = {"hello", "java", "pthon"};
//        Arrays.sort(arr1); // 클래스 메서드
//        System.out.println(arr1.length); // 객체(인스턴스) 메서드
//
//        // 리스트
//        List<String> myList = new ArrayList<>();
//        Collections.sort(myList); // 클래스 메서드
//        myList.sort(Comparator.naturalOrder()); //객체 메서드

    }
}

class  MyCalculator {
    static int total = 0;

    public static int sum(int a, int b) {

        return a + b;
    }
    //  static이 붙어있으면 클래스 변수 static이 붙어있지 않으면 객체 변수
    public static int sumAcc(int a) {

        total += a;
        return total;
    }
}

class MyCalculatorIstance {
    int total = 0;
    // 클래스 변수는 모든 인스턴스(객체) 간 상태 공유 목적으로 주로 사용
    static int total_count  = 0;
    // 클래스를 만들면, 아래와 같은 클래스명의 이름을 가진 메서드(생성자)가 기본으로 만들어짐
    // 생성자의 주된 목적은 객체 생성시 실행되면서 객체 변수를  초기화하기위한 목적으로 주로 사용
    public MyCalculatorIstance() {
        total_count++;
    }


    // 클래스 메서드는 객체의 상태와 상관없는 독립적인 로직 수행시에 사용 가능
    public static int sum(int a, int b) {  // 객체 변수의 값을 지속적으로 할당시키지 않고 연산만 해서 ㄱㅊ
     return a + b;
    }

    public  void sumAcc(int total) {
    // this는 객체 그 자신을 의미
    // 일반적으로 매개변수와 객체변수를 구분짓기 위해 사용. (ex)(매개변수명도 total, 객체변수명도 total일 경우)
        this.total += total;
    }
}
