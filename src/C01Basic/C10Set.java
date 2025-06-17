package C01Basic;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class C10Set {
    public static void main(String[] args) throws IOException {
//      중복이 X 순서 보장 X
//        Set<String> mySet = new HashSet<>();
//        mySet.add("h");
//        mySet.add("h");
//        mySet.add("e");
//        mySet.add("l");
//        mySet.add("l");
//        mySet.add("o");
//        System.out.println(mySet);

        //      백준 : 숫자카드(10815)
//        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
//        br.readLine();
//        String[] nInput = br.readLine().split(" ");
//        br.readLine();
//        String[] mInput =br.readLine().split(" ");
//
//        Set<String> set1 = new HashSet<>();
//        for(String a : nInput) {
//            set1.add(a);
//        }
//        StringBuilder sb = new StringBuilder();
//
//        for(String a : mInput) {
//            if(set1.contains(a)) {
//                sb.append("1 ");
//            } else {
//                sb.append("0 ");
//            }
//        }
//        System.out.println(sb);
//
//    }
//}
/* *****************************************************************
//      프로그래머스 : 폰켓몬
        int[] nums = {3, 1, 2, 3};
        int answer = 0;
        Set<Integer> set = new HashSet<>();
        for (int i : nums) {
            set.add(i);
        }
        if (nums.length / 2  < set.size()) {
            answer = nums.length / 2;
        } else {
            answer = set.size();
        }
        System.out.println(answer);


*************************************************************************/
//        LinkedHashSet : 입력순서 보장
        Set<Integer> linkedset = new LinkedHashSet<>();
        linkedset.add(1);
        linkedset.add(1);
        linkedset.add(0);
        linkedset.add(3);
        linkedset.add(1);
        System.out.println(linkedset);  //  1 0 3
//        TreeSet : 데이터를 오름차순 정렬
        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(1);
        treeSet.add(1);
        treeSet.add(0);
        treeSet.add(3);
        treeSet.add(1);
        System.out.println(treeSet);  // 0 1 3

//        집합 관련 함수 : 교집합(retainAll), 합집합(addAll), 차집합(removeAll)
        Set<String> set1 = new HashSet<>();
        set1.add("java");
        set1.add("python");
        set1.add("c++");
        Set<String> set2 = new HashSet<>();
        set2.add("java");
        set2.add("html");
        set2.add("css");

        //  교집합
//        set1.retainAll(set2);  // set1에는 java만 남음
//        System.out.println(set1)
        // 합집합
//        set1.addAll(set2);
//        System.out.println(set1);   //java, python, c++ html, css
        //  차집합
//        set1.removeAll(set2);
//        System.out.println(set1);  // python, c++







    }
}




