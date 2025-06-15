package C01Basic;

import java.util.*;

public class C08List {
    public static void main(String[] args) {
//        List선언방법
//        ArrayList<String> myList1 = new ArrayList<String>();
//        ArrayList<String> myList2 = new ArrayList<>();
//
//        List선언방법2  :  가장 일반적인 방법
//        List<String> myList3 = new ArrayList<>();
//
//      초기값 세팅방법1. 개별 data add
//        myList3.add("java");
//        myList3.add("python");
//        myList3.add("c++");
//
//        System.out.println(myList3);        // 기본적으로 list에는 toString() 내장되어있음
//
//      초기값 세팅방법2.  배열을 리스트로 변환
//        String[] arr = {"java, pyton, c++"};
//        List<String> myList4 = new ArrayList<>(Arrays.asList(arr));
//
//
//        int[] intArr = {10,20,30};
//        List<Integer> myIntList = new ArrayList<>();
//        for (int i : intArr) {
//            myIntList.add(i);   // 자동 형변환됨
//        }
//
//        add메서드 : 리스트에 값을 하나씩 추가하는 메서드
//        List<Integer> myList = new ArrayList<>();
//        myList.add(10);
//        myList.add(20);
//        myList.add(0,30);   // list자료구조의 중간 데이터 삽입 삭제는 되도록 피하기 -> 성능 비효율
//        System.out.println(myList);

//        get(index) : 특정 index의 요소 반환
//        System.out.println(myList.get(0));
//
//
//        size() : 리스트의 개수(길이)를 반환
//        System.out.println(myList.size());
//
//        for문을 활용해서 myList의 값 하나씩 모두 출력
//        for (int i = 0; i < myList.size(); i++) {
//            System.out.println(myList.get(i));
//        }
//        for (int i : myList) {
//            System.out.println(i);
//        }
//
//        remove : 요소 삭제
//        List <Integer> myList = new ArrayList<>();
//        myList.add(10);
//        myList.add(20);
//        myList.add(30);
//        1)index를 통한 삭제 2) value를 통한 삭제 (일반적이지 않음)
//        myList.remove(0);
//        myList.remove(Integer.valueOf(30));
//        System.out.println(myList);
//
//      clear : 요소 전체 삭제
//        myList.clear();
//        System.out.println(myList.isEmpty());

//        indexOf : 특정값을 찾아 index return (중복 시: 가장 먼저 나오는 값을 반환)
//        List<Integer> myList2 = new ArrayList<>();
//        myList2.add(10);
//        myList2.add(20);
//        myList2.add(30);
//        myList2.add(30);
//        System.out.println(myList2.indexOf(30));

//      contains : 값이 있는지 없는 여부를 리턴
//        System.out.println(myList2.contains(20));
//
//
//         n의 배수 고르기 -프로그래머스
//
//        int n =3;
//        int[] numlist = {4, 5, 6, 7, 8, 9, 10, 11, 12};
//        List<Integer> myList = new ArrayList<>();
//        for (int i = 0; i < numlist.length; i++ ){
//            if(numlist[i] % n  == 0) {
//                myList.add(numlist[i]);
//            }
//        }
//        int[] answer = new int[myList.size()];
//        for (int i = 0; i < myList.size(); i++) {
//            answer[i] = myList.get(i);
//        }
//

//      정렬 : 방법2가지(Collections클래스 사용, 객체사용)
//        List<Integer> myList = new ArrayList<>();
//        myList.add(5);
//        myList.add(3);
//        myList.add(2);
//        myList.add(1);
//        myList.add(4);
//
//        Collections.sort()
//        Collections.sort(myList);
//        Collections.sort(myList, Comparator.reverseOrder());
//        System.out.println(myList);
//
//        객체(ArrayList클래스).sort
//        myList.sort(Comparator.naturalOrder());
//        myList.sort(Comparator.reverseOrder());
//        이중 리스트 : 리스트 안의 리스트   like 이중배열
//        [[1,2], [3,4], [5,6]]
//        List<List<Integer>> myList = new ArrayList();
//        List<Integer> myList1 = new ArrayList<>();
//        myList.add(myList1);
//        myList.add(new ArrayList<>());
//        myList.get(1).add(1);
//        myList.get(0).add(2); // [[1,2], []]
//        myList.get(1).add(3);
//        myList.get(1).add(4);  // [[1,2], [3,4]]
//        myList.add(new ArrayList<>()); // list[[1,2], [3,4], []]
//        myList.get(2).add(5);
//        myList.get(2).add(6);


//        for문 이용해서 [[1,2,3], [4,5,6], [7,8,9], [10,11,12]] 이중 리스트 생성
//        List<List<Integer>> myList = new ArrayList();
//        int num =1;
//        for (int i = 0; i < 4; i++) {
//            myList.add(new ArrayList<>());
//
//            for (int j = 0; j < 3; j++) {
//                myList.get(i).add(num);
//                num++;
//            }
//        }
//        System.out.println(myList);

//      리스트 안에 배열 만들기
//        [{1,2}, {1,2,3}, {1,2,3,4}]
        List<int[]> myList = new ArrayList<>();
        myList.add(new int[2]);
        myList.get(0)[0]=1;
        myList.get(0)[1]=2;
        myList.add(new int[3]);
        myList.get(1)[0]=1;
        myList.get(1)[1]=2;
        myList.get(1)[2]=3;
        myList.add(new int[]{1,2,3,4});
        System.out.println(myList);     //배열 주소값이 출력 [첫번째 배열주소, 두번째 배열 주소, 세전째 배열 주소]

        for (int i = 0; i < myList.size(); i++) {
            System.out.println(Arrays.toString(myList.get(i)));
        }
        for(int[] m : myList) {
            System.out.println(Arrays.toString(m));
        }



    }
}
