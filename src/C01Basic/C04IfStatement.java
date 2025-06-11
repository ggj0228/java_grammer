package C01BASIC;

import java.util.Scanner;

public class C04IfStatement {
    public static void main(String[] args) {
//        코드의 흐름을 제어하기 때문에 제어문이라고 부름
////        도어락
//        int answer = 877001;
//        Scanner sc = new Scanner(System.in);
//        String input = sc.nextLine();
//        int inputNumber = Integer.parseInt(input);
//        if(inputNumber == answer) {
//            System.out.println("문이 열립니다.");
//        }
//        else {
//            System.out.println("비밀번호가 틀린데요???");
//        }
//
//        버스카드
//        현재 가지고 있는 돈은 얼마인지 묻는다
//        입력값을 받아서 10000원 이상이면 택시를 타시오라고 출력
//        10000미만~3000원이상이면 버스를 타시오라고 출력
////        그렇지 않으면 걸어 가라고 출력
//        Scanner sc = new Scanner(System.in);
//        System.out.println("얼마 갖고 있슈?");
//        String input = sc.nextLine();
//        int busCard = Integer.parseInt(input);
//        if (busCard >= 10000) {
//            System.out.println("돈도 많은데 택시 타셔유");
//        }
////        if, else if 구문에서 조건식은 택1로서, 한 조건에 해당하면 실행 후 구문 밖으로 빠져나감.
//        else if (busCard >= 3000){
//            System.out.println("버스 타셔유");
//        }
//        else {
//            System.out.println("어디 걸뱅이가 버스를 탈라고!");
//        }
////          if문이 독립적으로 존재할 경우, 정확한 범위지정을 하지 않으면 모든 if문이 중복되어 실행될 가능성이 존재
//        if (busCard >= 10000) {
//            System.out.println("돈도 많은데 택시 타셔유");
//        }
//        if (busCard >= 3000 && busCard < 10000) {
//            System.out.println("버스 타셔유");
//        }
//        if (busCard <3000) {
//            System.out.println("어디 걸뱅이가 버스를 탈라고!");
//        }// 이런 식으로 코딩하면 if문에 해당하는 조건 두개가 충족될 때 두 문구가 다 나와서 문제가 된다.

//        삼항연산자 : 결과값=조건식? 반환값1:반환값2
//        조건식이 참인 경우 반환값 1이 결과값에 담기고 거짓인 경우 반환값2가 결과값에 담김.
//        int answer = 877001;
//        Scanner sc = new Scanner(System.in);
//        int input = sc.nextInt();
//        String result = (answer == input)? "문이 열립니다.":"비밀번호가 틀린데요???";
//        System.out.println(result);

//        switch문 : if, else if, else if 등 여러 조건식이 있을 때 조건문을 가독성 있게 표현한 구문
//        원하시는 서비스 번호를 입력해 주세요
//        1: 대출 업무입니다. 2: 예금업무 입니다. 3: 적금업무입니다. 0:상담사연결됩니다. 그 외 : 잘못된 입력입니다.

        System.out.println("원하시는 서비스 번호를 입력해주세요.");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        switch (input) {
            case 1 :
                System.out.println("대출 업무입니다.");
                break;
            case 2 :
                System.out.println("예금업무입니다.");
                break;
            case 3 :
                System.out.println("적금업무입니다.");
                break;
            default:
                System.out.println("잘못된 입력입니다.");
                break;
        }


//
//        if (input == 1) {
//                System.out.println("대출 업무입니다.");
//        }
//        else if (input == 2) {
//                System.out.println("예금업무입니다.");
//        }
//        else if (input == 3) {
//                System.out.println("적금업무입니다");
//        }else {
//                System.out.println("잘못된 입력입니다.");
//        }

    }
}