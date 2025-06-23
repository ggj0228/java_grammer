package C02ClassBasic;
import java.util.*;
import java.io.*;

// 조합(combination) 순열(permutation)
// 주로 백트래킹 알고리즘 상황에서 사용

public class C13RecursiveCombiPermu {
    public static void main(String[] args) {
        // 2중 for문을 활용하여 helloworld1 helloworld2 ... helloworldn 출력
//        int total = 0;
//        for (int i = 0; i < 3; i++) {
//            for(int j =0 ; j < 3; j++) {
//                System.out.println("hello world" + total);
//                total++;
//            }
//        }
        // 위 for문의 반복횟수는 동적으로 결정되지 않고, 정적으로 코딩할 수 밖에 없는 한계가 존재
//        forRecur(0,2);

        // 재귀함수 예재; 조합
//        List<Integer> myList = new ArrayList<>();
//        myList.add(1);
//        myList.add(2);
//        myList.add(3);
//        myList.add(4);
//        // 숫자 1,2,3,4를 가지고 만들 수 있는 2개짜리 숫자조합을 이중리스트에 담아 출력
//        // [[1,2], [1,3], [1,4], [2,3], [2,4], [3,4]]
//        List<List<Integer>> dualList = new ArrayList<>();
//        int index = 0;
//        for (int i = 0; i < myList.size(); i++) {
//            for (int j = i + 1; j < myList.size(); j++) {
//                dualList.add(new ArrayList<>());
//                dualList.get(index).add(myList.get(i));
//                dualList.get(index).add(myList.get(j));
//                index++;
//            }
//        }
//        System.out.println(dualList);

        //재귀함수를 만들기 위한 for문 변형
        List<Integer> myList = new ArrayList<>();
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);
        List<List<Integer>> dualList = new ArrayList<>();
//        int index = 0;
//        List<Integer> temp = new ArrayList<>();
//        for (int i = 0; i < myList.size(); i++) {
//            temp.add(myList.get(i));
//            for (int j = i + 1; j < myList.size(); j++) {
//                temp.add(myList.get(j));
//                dualList.add(new ArrayList<>(temp));
//                temp.remove(temp.size()-1);
//            }
//            temp.remove(temp.size()-1);
//        }
//        System.out.println(dualList);

//        combi(myList, new ArrayList<>(), dualList , 2, 0);
//        System.out.println(dualList);

/* *********************************************************************************************/

        //1,2,3,4를 n개씩 뽑은 순열구하기
        // [[1,2],[1,3],[1,4],[2,1], ... ,[4,3]]

        permu(myList, new ArrayList<>(), dualList, 2, new boolean[myList.size()]);
        System.out.println(dualList);

        // 백준 15649 - n과 m
        // 백준 로또 6603

    } // main 끝

//    static int staticCount = 0;
//    static void forRecur(int num, int target) {
//        if(num == target) {
//            System.out.println("hello world" + staticCount);
//            staticCount++;
//            return;
//        }
//        for(int i = 0; i < 3; i++) {
//            forRecur(num+1,target);
//        }
//    }
/* *****************************************************************************************************************/
//    static void combi(List<Integer> myList,List<Integer> temp, List<List<Integer>> doubleList , int target , int start) {
//        if(temp.size() == target) {
//            doubleList.add(new ArrayList<>(temp));
//            return;
//        }
//        for(int i = start ; i < myList.size(); i++) {
//            temp.add(myList.get(i));
//            combi(myList, temp,  doubleList, target, i + 1);
//            temp.remove(temp.size()-1);
//        }
//
//    }
    static void permu(List<Integer> myList,List<Integer> temp, List<List<Integer>> doubleList ,int target, boolean[] visited) {
        if(temp.size() == target) {
            doubleList.add(new ArrayList<>(temp));
            return;
        }
        for(int i = 0 ; i < myList.size(); i++) {
            if(!visited[i]) {
                visited[i] = true;
                temp.add(myList.get(i));
                permu(myList, temp, doubleList, target, visited);
                temp.remove(temp.size() - 1);
                visited[i] = false;
            }

        }
    }
}
