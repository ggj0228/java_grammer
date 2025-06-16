package C01Basic;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.SimpleTimeZone;
import java.util.regex.Pattern;

public class C06String {
    public static void main(String[] args) {
//      원시자료형은 스택메모리에 저장되므로, 비교시 값자체를 비교
//        int a = 10;
//        int b = 20;
//        System.out.println(a == b);
//
////      참조자료형의 비교는 기본적으로 메모리 주소값끼리 비교
//        String st1 = new String("hello");
//        String st2 = new String("hello");
//        System.out.println(st1 == st2);          //false
//        System.out.println(st1.equals(st2));    // true
//
////      WapperClass : 기본형 타입을 Wrapping한 클래스
//        int i1 = 10;
////        Integer ig1 = new Integer(10);
////      오토박싱 : 원시자료형 -> Wrapper클래스 자동 형변환
//        Integer ig1 = 10;
////      오토언박싱 : Wrapper클래스 -> 원시자료형으로 자동 형변환
//        int i2 = ig1;
//
////      Wrapper클래스의 기능
//        int i3 = 10;
//        String st3 = Integer.toString(i3);
//        String st4 = String.valueOf(i3);
//        int i4  = Integer.parseInt(st3);
//
// //     배열(참조자료형)에는 원시타입 자료형 세팅 가능
//        int[] arr = {10, 20, 30};
//
////      그외(리스트, set, map) 등에는 참조자료형을 세팅해야함
//        ArrayList<Integer> list1 = new ArrayList<>();
//        list1.add(10);
//        list1.add(20);
//        list1.add(30);

//      String 선언방법 2가지
//      객체선언방식
//        String st1 = new String("hello world");
//        String st2 = new String("hello world");
////      리터럴방식   : 자바에서 추천하는 방식
//        String st3 = "hello world";
//        String st4 = "hello world";
//
//        System.out.println(st1 == st2);
//        System.out.println(st3 == st4);
//        System.out.println(st1 == st3);
//
////      참조자료형의 비교는 ==을 지양
//        System.out.println(st1.equals(st3));

//          equals : 두 문자열 비교
//        String st1 = "hello1";
//        String st2 = "hello1";
//        String st3 = "Hello1";
//        System.out.println(st1.equals(st2));
//        System.out.println(st1.equals(st3));
//        System.out.println(st1.equalsIgnoreCase(st2));

//      length : 문자열의 길이 출력
//        String st1 = "hello World Java2";
//        System.out.println(st1.length());
////      charAt(n): 특정 index의 문자(char)값을 리턴
//        char ch1 = st1.charAt(0);
//        // 위 문자열의 소문자 알파벳 개수 구하기 : for, length, charAt
//        int ct = 0;
//        for (int i= 0; i < st1.length(); i++) {
//            if(st1.charAt(i) >= 'a'  && st1.charAt(i) <= 'z') {
//                ct++;
//            }
//        }
//        System.out.println(ct);
//
//        String st2 = "ahhavjhsavhjdabhbhjahdahsvdjbauwjbhjbahjwbhsbfajsbsa";
////      a의 개수가 몇개인지 출력
//        int ct2 = 0;
//        for (int i =0; i < st2.length(); i++) {
//            if (st2.charAt(i) == 'a') {
//                ct2++;
//            }
//        }
//        System.out.println(ct2);
//        System.out.println(st1.toLowerCase());
////      toCharArray : String문자열릉 char배열로 리턴
//        int count = 0;
//        for(char c : st1.toCharArray()){
//            if (c == 'a') count++;  // 실행문이 1줄밖에 없을 때는 중괄호 생략가능
//        }

        //         indexOf(문자열) : 특정 문자열의 위치(index) 반환. 가장 먼저 나오는 문자열의 위치 반환
//        String st1 = "hello java java";
//        System.out.println(st1.indexOf("java"));    // 6
//
////          contains : 특정 문자열이 포함되어있는지 여부(boolean)를 return
//        System.out.println(st1.contains("hello"));  //true
//        System.out.println(st1.contains("world"));  //false

//          문자열 더하기 : +=
//        String st1 = "hello";
//        st1 += " world";
//        st1 += '1';         // String에 char를 더하면 String으로 더해짐.
//        System.out.println(st1);
//
//
////          프로그래머스-나머지 구하기(플랫폼 사용법)
////          프로그래머스 특정문자 제거하기
//        String my_string =  "absbadjksj";
//        String letter = "j";
//        String answer ="";
//
//        for (int i = 0; i < my_string.length(); i++){
//            if(my_string.charAt(i) != letter.charAt(0))
//            {
//                answer += my_string.charAt(i);
//            }
//        }
//        System.out.println(answer);

//          substring(a,b) : a이상 b미만의 index의 문자열을 잘라 반환
//        String st1 = "hello world";
//        System.out.println(st1.substring(0,5)); // hello
//        System.out.println(st1.substring(6,st1.length())); // world
//
//        // 프로그래머스 특정 문자 제거하기 (substring으로 풀어보기)
//        String letter = "j";
//        String my_string =  "absbadjksj";
//        String answer = "";
//
//        for(int i = 0; i < my_string.length(); i++) {
//            if(!my_string.substring(i, i+1).equals(letter)) {
//                answer += my_string.substring(i, i+1);
//            }
//        }
//        System.out.println(answer);

//          프로그래머스 가운데 글자 가져오기
//        String s = "ajkbsjfnjsaf";
//        String answer = "";
//
//        if(s.length() % 2 == 0) {
//            answer = s.substring(s.length()/2 -1, s.length()/2 +1);
//        } else {
//            answer = s.substring(s.length()/2, s.length()/2 +1);
//        }
//        System.out.println(answer);

//      trim, strip : 문자열 양쪽 끝의 공백 제거
//        String st1 = " hello  world ";
//        String trim1 = st1.trim();
//        String strip1 = st1.strip();
//
//        System.out.println(trim1);
//        System.out.println(strip1);
//
//
////      toUppercase : 모든 문자열을 대문자로 변환, toLowercase : 모든 문자열을 소문자로 변환
//        String s1 = "Hello";
//        String s2 = s1.toLowerCase();
//        String s3 = s1.toUpperCase();
//        System.out.println(s2);
//        System.out.println(s3);


//      replace(a,b) : a문자열을 b문자열로 대체
//        String st1 = "hello world";
//        String st2= st1.replace("world", "java");
//        System.out.println(st2);

//      replaceAll(a,b) : replace와 사용법 동일, 정규표현식을 쓸 수 있는지의 차이점.
//        String st1 = "02nnfd83뮤AKsK엄18aQ2jjsbf";
//      한글 제거
//        String answer1 = st1.replaceAll("[가-힣]", "");
//        String answer2 = st1.replaceAll("[a-z]", "");
//        String answer3 = st1.replaceAll("[A-Za-z]", "");
//        System.out.println(answer1);
//        System.out.println(answer2);
//        System.out.println(answer3);

//      전화번호 검증
//        String number = "010-1234-1234";
//        boolean check = number.matches("^\\d{3}-\\d{4}-\\d{4}$");
//        if (check == false) {
//            System.out.println("다시 입력하세요");
//        }
//
////      이메일 검증
//        String email = "ab1234@naver.com";
//        boolean check_email = Pattern.matches("^[a-z0-9]+@[a-z]+.com$", email);
//        System.out.println(check_email);
//
////      split : 특정문자를 기준으로 잘라서 문자배열로 만드는 것.
//        String a = "a:b:c:d";
//        String[] arr1 = a.split(":");
//        System.out.println(Arrays.toString(arr1));
//
//        String b = "a b  c d";
//        String[] arr2 = b.split(" ");
//        String[] arr3 = b.split("\\s+");        // \s : 공백 \n : 줄바꿈
//        System.out.println(Arrays.toString(arr2));
//        System.out.println(Arrays.toString(arr3));


//      null과 공백의 차이
//        String st1 = null;  // null은 String이 아님
//        String st2 = "";    // 공백은 문자열
//        String st3 = " ";
//
//        System.out.println(st1 == st2); // false
//        System.out.println(st1.isEmpty());   // nullpointer exception 발생
//        System.out.println(st2.isEmpty());  // true
//        System.out.println(st3.isEmpty());  // false
//        System.out.println(st3.isBlank());  // true
//
//        String abc = "hello   world   java";
//        for (int i = 0; i < abc.length(); i++ ) {
//            if (abc.substring(i, i+1).isBlank()){
//                System.out.println(i + "번째는 blank");
//            }
//        }

//      문자열 합치기 -> 문자열을 합칠 때마다 호출 후 합치고 저장, 이 과정을 반복해서 성능 느림
//        String[] arr = {"java", "python","javascript"};
//        String answer1 = "";
//        for (String a : arr) {
//            answer1 += a;
//            answer1 += " ";     // \n을 사용하면 줄바꿈 추가
//        }
//        System.out.println(answer1);
//        String answer2 = String.join(" ", arr);
//        System.out.println(answer2);

//      StringBuffer : 문자열 조립 개체
//        StringBuffer sb = new StringBuffer();
////      append는 맨뒤에 문자열을 더하는 메서드
//        sb.append("java");
//        sb.append("\n");
//        sb.append("python");
//        sb.append("\n");
//        sb.append("javascript");
//        String answer = sb.toString();  // sb 객체를 String 타입으로 변환
//        System.out.println(answer);
//
//        String[] arr = {"java", "python","javascript"};
//        StringBuffer sb2 = new StringBuffer();
//        for (int i = 0; i < arr.length; i++) {
//            sb2.append(arr[i]);
//            sb2.append("\n");
//        }
//        sb2.insert(0, "c++\n");
//        sb2.deleteCharAt(sb2.length()-1);
//        System.out.println(sb2);

        /* **************************************************** */
////      StringBuilder : 문자열 조립 객체(가장 빠름)
//        String st1 = "hello";
////      StringBuilder는 동시성 이슈 발생 -> Thread가 안전하지 않음,  성능은 뛰어남
//        StringBuilder sb = new StringBuilder();
////      StringBuffer는 동시성 이슈 X -> Thread 안전하지 않음, 성능은 떨어짐
//        StringBuffer sb2 = new StringBuffer();

        /* ************************************************************ */
//          문자열 뒤집기
//        String st1 = "hello";
//        StringBuilder sb  = new StringBuilder();
//        for (int i = st1.length() -1; i >= 0; i--) {
//            sb.append(st1.charAt(i));
//        }
//        System.out.println(sb);
        /* *************************************************** */

        // 문자열 비교
        String s1 = "hello";
        String s2 = "dello";
        String s3 = "hello";
        System.out.println(s1.compareTo(s2));   // 양수
        System.out.println(s2.compareTo(s1));   // 음수

//          프로그래머스 문자열 밀기
//        String A = "hello";
//        String B = "ohell";
//        int answer = -1;
//        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i<A.length(); i++) {
//            sb.append(A.charAt(i));
//        }
//            if(A.equals(B)) {
//                answer =0;
//            } else {
//                for (int i = 1; i <= A.length(); i++) {
//                    sb.insert(0, sb.charAt(sb.length() - 1));
//                    sb.deleteCharAt(sb.length() - 1);
//
//                    if (sb.toString().equals(B)) {
//                        answer = i;
//                        break;
//                    }
//                }
//            }
//        System.out.println(answer);
       }



}
