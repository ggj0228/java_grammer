package C01Basic;
import com.sun.security.jgss.GSSUtil;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.Map;

public class C09Map {
    public static void main(String[] args) throws IOException {
//      key, value로 이루어진 자료구조
//        key값은 중복이 있으면 value를 덮어쓰기함
//        Map<String, Integer> sports = new HashMap<>();
//        sports.put("농구", 2);
//        sports.put("배구", 1);
//
////        map은 key를 통해 value를 get
////        map에서 key값을 통한 검색 복잡도는 O(1)
//        System.out.println(sports.get("농구"));
//
////        map의 전체데이터 출력
////        map의 key값 접근시에 인덱스 사용 불가능(순서가 없음)
////        keySet() : map의 key목록을 리턴하는 메서드
////        values() : map의 value목록을 리턴하는 메서드
//        int total = 0;
//        for(int v: sports.values()) {
//            total += v;
//        }
//        int total2 = 0;
//        for (String k : sports.keySet()) {
//            total2 += sports.get(k);
//        }
//
//
////        remove : key를 통해 맵의 요소 삭제
//        sports.remove("농구");
//        System.out.println(sports);
//
////        map에서 기존의 key값에 put할 경우 덮어쓰기
//        sports.put("배구", 10);
//        System.out.println(sports);


//        Map<String, String> sports = new HashMap<>();
//        sports.put("soccer", "축구");
//        sports.put("baseball", "야구");
//        sports.put("basketball", "농구");
////        putIfAbsent : key값이 없는 경우에만 put
//        sports.putIfAbsent("soccer", "운동");
//        sports.putIfAbsent("tennis", "테니스");
//        System.out.println(sports);
//
////        containskey : 키가 있으면 true,  없으면 false
//        System.out.println(sports.containsKey("tennis"));
//        System.out.println(sports.containsKey("pingpong"));
//
//
////        map출력방법 2가지   1. for each문 | 2. iterator
////        1.for each문
//        for (String a : sports.keySet()) {  // set의 값을 이용하여 출력
//            System.out.println(a); // key
//            System.out.println(sports.get(a)); // value
//        }
//
//        Set<String> mySet = sports.keySet();
//        for (String a : mySet) {
//            System.out.println(a);
//        }

//        2.iterator를 통한 데이터 소모 -> spring에서 다른 사람이 만든 코드가 Iterator로 쓰여져있는 게 꽤 존재
//        Map<String, String> sports = new HashMap<>();
//        sports.put("soccer", "축구");
//        sports.put("baseball", "야구");
//        sports.put("basketball", "농구");
//        Iterator<String> iterators = sports.keySet().iterator();
//        next메서드는 데이터를 하나씩 소모시키면서 값을 반환
//        System.out.println(iterators.next());

//        hasNext메서드는  iterator안에 그 다음값이 있는지 없는지 boolean 리턴
//        System.out.println(iterators.hasNext());

//        while (iterators.hasNext()) {
//            System.out.println(iterators.next());
//        }

//        map은 key의 value수를 count하는 목적으로 많이 활용
        String[] arr = {"농구", "축구", "농구", "야구", "축구"};
//        농구: 2, 축구: 2, 야구: 1

//        Map<String, Integer> myMap = new HashMap<>();
//        for(int i = 0; i < arr.length; i++) {
////            if(myMap.containsKey(arr[i])) { // arr[i]값이 map에 있을 경우에만
//                myMap.put(arr[i], myMap.get(arr[i]) + 1); // key값에 대응되는 value +1
//            } else {
//                myMap.put(arr[i], + 1); // 없으면 초기값 put
//            }
//        }
//        System.out.println(myMap);
//        getOrDefalut(키값, 초기값) : key값이 없을 경우 초기값 리턴
//            myMap.put(arr[i], myMap.getOrDefault(arr[i], 0) + 1);
//        }
//        System.out.println(myMap);

//        String[] removeArr = {"농구", "농구", "농구", "야구", "축구"};
//        for (String r : removeArr) {
//            if(myMap.containsKey(r)) {
//                if(myMap.get(r) == 1){
//                    myMap.remove(r);
//                }else {
//                    myMap.put(r, myMap.get(r) - 1);
//            }
//            }
//        }
//        System.out.println(myMap);
//        Map<String, Integer> myMap = new HashMap<>();
//        myMap.put("축구", 3);
//        myMap.put("농구", 2);
//        myMap.put("야구", 1);

/* ********************************************************
//        가장 value가 큰 키값 찾기
        int max = Integer.MIN_VALUE;
        String maxStr = "";
        for(String s : myMap.keySet()) {
            if(max < myMap.get(s)) {
                max = myMap.get(s);
                maxStr = s;
            }
        }
        System.out.println(maxStr);
****************************************************************     */


//        백준 : 베스트셀러
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        String[] input = new String[n];
//        Map<String, Integer> inputMap = new HashMap<>();
//        for (int i = 0; i < n; i++) {
//            input[i] = br.readLine();
//        }
//        // map에다가 값 넣어주기
//        for(String i : input) {
//            inputMap.put(i, inputMap.getOrDefault(i, 0) + 1);
//        }
//        int max = Integer.MIN_VALUE;
//        String maxKey = "";
//        for(String s : inputMap.keySet()){
//            if (max == inputMap.get(s)) {  // 최대 값이 같을 경우 사전순
//                if (maxKey.compareTo(s) > 0 ) {
//                    maxKey = s;
//                }
//            }
//            if(max < inputMap.get(s)) { //최대값 구하기
//                max = inputMap.get(s);
//                maxKey = s;
//            }
//        }
//        System.out.println(maxKey);

        // 프로그래머스 : 완주하지 못한 선수
//        String[] participant = {"leo", "kiki", "eden"};
//        String[] completion = {"eden", "kiki"};
//        Map <String, Integer> comMap = new HashMap<>();
//
//        for (String s: participant) {
//            comMap.put(s, comMap.getOrDefault(s, 0) + 1);
//        }
//        for (String s : completion) {
//            if(comMap.get(s) == 1) {
//                comMap.remove(s);
//            } else {
//                comMap.put(s, comMap.get(s) - 1);
//            }
//        }
//        String answer = "";
//        for (String s : comMap.keySet()) {
//            answer = s;
//        }
//
//        System.out.println(answer);


        // 프로그래머스  의상
//        String[][] clothes = {{"crow_mask", "face"}, {"blue_sunglasses", "face"}, {"smoky_makeup", "face"}};
//        Map<String, Integer> map = new HashMap<>();
//        // map으로 종류 별 개수 받기
//        for(int i = 0; i < clothes.length; i++) {
//            map.put(clothes[i][1] , map.getOrDefault(clothes[i][1], 0) + 1);
//        }
//        // list로 개수만 저장
//        List<Integer> list = new ArrayList<>();
//        for (String s : map.keySet()) {
//            list.add(map.get(s));
//        }
//        int answer = 1;
//        for (int k : list) {
//            answer *= (k +1); // 안 입는 경우도 포함해서 곱한 값 합
//        }
//        answer-- ; // 벌거숭이일 순 없음
//        System.out.println(answer);
/* ***************************************************************** */
//          LinkedHashMap : 데이터의 삽입순서를 보장(유지)
//        Map<String,Integer> linkedmap = new LinkedHashMap<>();
//        linkedmap.put("hellow5", 1);
//        linkedmap.put("hellow4", 2);
//        linkedmap.put("hellow3", 3);
//        linkedmap.put("hellow2", 4);
//        linkedmap.put("hellow1", 5);
//       for(String l : linkedmap.keySet()) {
//           System.out.println(l);
//       }

//          TreeMap : key를 정렬(오름차순)하여 map을 저장
//        Map<String,Integer> treeMap = new TreeMap<>();
//        treeMap.put("hellow5", 1);
//        treeMap.put("hellow4", 2);
//        treeMap.put("hellow3", 3);
//        treeMap.put("hellow2", 4);
//        treeMap.put("hellow1", 5);
//
//        for(String l : treeMap.keySet()) {
//            System.out.println(l);
//        }
//

//        백준 : 파일 정리
//        문자열 자르기 : .은 특수문자로 취급되어 "." -> "\\."
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Map<String, Integer> map = new TreeMap<>();

        for(int i = 0; i < n; i++){
            String[] input = br.readLine().split("\\.");
            map.put(input[1], map.getOrDefault(input[1], 0) +1);
        }
        StringBuilder sb = new StringBuilder();
        for(String m : map.keySet()) {
            sb.append(m).append(" ").append(map.get(m)).append("\n");
        }
        System.out.println(sb);
    }
}
