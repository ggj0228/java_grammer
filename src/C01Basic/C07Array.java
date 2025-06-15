package C01Basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class C07Array {
    public static void main(String[] args) throws IOException {
//      배열 표현식1. 배열 선언 후 할당 방식
//      배열은 반드시 사전에 길이가 결정되어야 함
//        int[] arr1 = new int[5];
//        arr1[0] = 10;
//        arr1[1] = 20;
//        arr1[3] = 40;
//        arr1[4] = 50;
//        arr1[5] = 10;  // index out of bounds 예외 발생. 배열의 길이가 동적으로 늘어날 수 없음.
//        System.out.println(arr1[2]);  // int 배열일 경우 0으로 초기화, String 배열의 경우 null로 초기화.

/* ************************************************************************************************* */
//      배열 표현식2. 리터럴 방식
//        int[] arr2 = {10, 20, 30, 40, 50};
//
//
///* ****************************************************************************************** */
////      배열 표현식3.
//        int[] arr3 = new int[]{10, 20, 30, 40, 50};
//
////      배열 표현식3.Ex)
//        ArrayList<int[]> list = new ArrayList<>();
//        list.add(new int[5]);
//        list.add(new int[]{1, 3, 5, 7});
//
////      배열표현식4. 불가 -> 배열의 길이를 반드시 확정시켜야함.
//        int[] arr4 = new int[]; // XX

//        Arrays.fill : 배열의 모든 값을 변경 -> 배열의 기본값을 원하는 걸 할당 하고 싶을 때
//        String[] arr = new String[5];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = "";
//        }
//        Arrays.fill(arr, "");


/* ************************************************************************************** */
        // 85, 65, 90으로 이루어진 int배열을 선언하고, 총합과 평균 구하시오.
//        int[] arr = new int[]{85, 65, 90};
//        int sum = 0;
//
//        for (int i =0; i < arr.length; i++) {
//            sum += arr[i];
//        }
//        System.out.println(sum);
//        System.out.println((double)sum / arr.length);
//
//
////      배열의 최댓값과 최소값
//        int arr2[] = {10, 20, 30, 12, 8, 17};
//        int max = arr2[0];
//        int min = arr2[0];
//        for (int i = 0; i < arr2.length; i++) {
//            if (max < arr2[i]) {
//                max = arr2[i];
//            }
//            if (min > arr2[i]) {
//                min = arr2[i];
//            }
//        }
//        System.out.println("최댓값: " +  max + " 최소값: " + min );
//        System.out.println(Arrays.stream(arr2).max());

/* ***************************************************************** */
//      배열의 자리 바꾸기
//        int[] arr = {20,10,30};
//            int temp = 0;
//            temp = arr[0];
//            arr[0] = arr[1];
//            arr[1] = temp;
//        System.out.println(Arrays.toString(arr));

/* ********************************************************************* */
//        배열 뒤집기
//        int[] arr = {10,20,30,40,50};
//        int[] newArr = new int[arr.length];
//
//        for (int i = 0; i < arr.length ; i++) {
//            newArr[arr.length -1 -i] = arr[i];
//        }
//        System.out.println(Arrays.toString(newArr));
//
/* *********************************************************************** */


//        배열의 정렬
//        int[] arr = {17,12,20,10,15};
//        Arrays.sort(arr); //  오름차순 정렬
// //       Arrays.sort(arr, Comparator.reverseOrder()); //불가능 원시자료형은 Comparator 사용 불가능
//        System.out.println(Arrays.toString(arr));
//        String[] stArr = {"abc", "aaa", "acb", "abb"};
//        Arrays.sort(stArr, Comparator.reverseOrder()); // 내림차순 -> Comparator클래스는 클래스참조형 객체만 사용가능
//        System.out.println(Arrays.toString(stArr));

/* ************************************************************************************************************* */
//        선택정렬 알고리즘 직접구현
//        int[] arr = {17,12,20,10,15};
//        for (int i = 0; i < arr.length; i++) {
//           int min = arr[i];
//            for (int j = i + 1; j < arr.length; j++) {
//                if(min > arr[j]) {
//                    min = arr[j];
//                    arr[j] = arr[i];
//                    arr[i] = min;
//                }
//            }
//
//        }
//        System.out.println(Arrays.toString(arr));
//         int[] arr = {17,12,20,10,15};
////        자리를 결정
//        for (int i = 0; i < arr.length - 1; i++) {
//            // min값을 찾기 위한 for문
//            for (int j = i + 1; j < arr.length; j++) {
//                if (arr[j] < arr[i]) {
//                    int temp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = temp;
//                }
//            }
//        }
//        System.out.println(Arrays.toString(arr));///정답


////        조합문제 : 모두 각기 다른 숫자의 배열이 있을 때, 만들어질 수 있는 두 숫자의 조합을 문자열 형태로 출력
////        ex) (10,20) (10,30)
//        int[] intArr = {10,20,30,40,50};
//
//        for (int i = 0; i < intArr.length-1; i++) {
//
//            for (int j = i+1; j < intArr.length; j++) {
//                System.out.println("(" + intArr[i] + ", " + intArr[j] +")");
//            }
//        }
//

////        배열의 중복제거 : set자료구조(중복 X, 순서X)를 활용하여 중복제거
//        int[] arr = {10,10,20,30,40,40};
//        Set<Integer> mySet = new HashSet<>();
//        for (int a : arr) {
//            mySet.add(a);
//        }
//        System.out.println(mySet);
//        int[] answer = new  int[mySet.size()];
//        int index = 0;
//        for (int a : mySet) {
//         answer[index] = a;
//         index++;
//        }
//        Arrays.sort(answer);
//        System.out.println(Arrays.toString(answer));

////        배열의 검색
//        int[] arr = {5,3,1,8,7};
//        int target = 8;
////        8이 몇번째 index에 있는지 출력
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i]==target){
//                System.out.println(i);
//                break;
//            }
//        } //복잡도가 O(n)이다.

//        이분탐색 | 이진검색 | binary search
////        사전에 데이터가 오름차순 정렬돼 있을 경우, 이분탐색 가능
//        int[] arr = {1,3,6,8,9,11,15};
////        값이 있으면 해당 index 출력
////        값이 없으면 마이너스 값 리턴
//        System.out.println(Arrays.binarySearch(arr,15));
////        백준 - 수찾기
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        String[] nInput =  br.readLine().split(" ");
//        int[] nArr = new int[nInput.length];
//        for (int i = 0 ; i < nInput.length; i++) {
//            nArr[i] = Integer.parseInt(nInput[i]);
//        }
//
//        int m = Integer.parseInt(br.readLine());
//        String[] mInput = br.readLine().split(" ");
//        int[] mArr = new int[mInput.length];
//        for (int i = 0; i < mInput.length; i++) {
//            mArr[i] = Integer.parseInt(mInput[i]);
//        }
//
//
//        Arrays.sort(nArr);
//        for (int i = 0; i < m; i++) {
//            if(Arrays.binarySearch(nArr, mArr[i]) < 0) {
//                System.out.println("0");
//            }   else {
//                System.out.println("1");
//            }
//        }

////        배열값 비교
//        int[] arr1 = {10,20,30};
//        int[] arr2 = {10,20,30};
//        System.out.println(arr1==arr2); //false
//        System.out.println(Arrays.equals(arr1,arr2));

////        2차원배열의 선언과 값 할당
//        int[][] arr = new int[3][2];
//        arr[0][0] = 1;
//        arr[0][1] = 2;
//        arr[1][0] = 3;
//        arr[1][1] = 4;
//        arr[2][0] = 5;
//        arr[2][1] = 6;
////        리터럴 방식
//        int[][] arr2 = {{1,2},{3,4},{5,6}};
//
////        가변배열 : 배열의 전체길이는 반드시 할당.
//        int[][] arr3 = {{1,2},{1,2,3},{1,2,3,4}};///리터럴 방식
////        2차원 배열의 출력
//        System.out.println(arr3); ///2차원 배열의 주소값
//        System.out.println(Arrays.toString(arr3));///각 1차원 배열의 주소값 모음
//        System.out.println(Arrays.deepToString(arr3)); ///각 1차원 배열의 값을 출력

//        int[][] arr4 = new int[3][];
////        arr4[0][0] =10; /// 이런식으로 값 대입은 불가
//        arr4[0] = new int[2];
//        arr4[1] = new int[3];
//        arr4[2] = new int[4];

////        [3][4] 사이즈 선언하고 1~12까지 숫자값을 각 배열에 순차적으로 할당
////        {1,2,3,4},{5,6,7,8},{9,10,11,12}
//        int[][] arr = new int[3][4];
//        int num = 1;
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length ; j++) { /// 범위 다시 생각해보고 넣어볼 것
//                arr[i][j]= num;
//                num++;
//            }
//        }
//        System.out.println(Arrays.deepToString(arr));///정답

//        가변배열 값 채우기
//        int[][] arr2 = new int[3][];///내부에 값이 몇칸인지 정확히 안나와있음 가변길이의 값을 선언해줘야돼.
//        int num = 1;
//        for (int i = 0; i < arr2.length; i++) {
//            arr2[i] = new int[4];
//            for (int j = 0; j < arr2[i].length; j++) {
//                arr2[i][j] = num;
//                num++;
//            }
//        }
//        System.out.println(Arrays.deepToString(arr2));

////        행렬의 덧셈 - 프로그래머스
//        int[][] arr1 = {{1,2}, {2,3}};
//        int[][] arr2 = {{3,4}, {5,6}};
//        int[][] answer = new int [arr1.length][];
//        for (int i = 0; i < arr1.length; i++) {
//            answer[i] = new int[arr1[i].length];
//            for (int j = 0; j < arr1[i].length; j++) {
//                answer[i][j] += arr1[i][j] + arr2[i][j];
//            }
//        }
//        System.out.println(Arrays.deepToString(answer));
//        k번째 수 - 프로그래머스
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands ={{2, 5, 3},{4, 4, 1}, {1, 7, 3}};
        int[] answer = new int[commands.length];

        for (int i = 0; i < commands.length; i ++) {
            int[] tmpArray = new int[commands[i][1] - commands[i][0] + 1];
            int index = 0;
            for (int j = commands[i][0] - 1 ; j< commands[i][1]; j++) {
                tmpArray[index++] = array[j];
            }
            Arrays.sort(tmpArray);
            answer[i] = tmpArray[commands[i][2] - 1];
        }
        System.out.println(Arrays.toString(answer));


//        배열복사
//        Arrays.copyOf(배열명, length), Arrays.copyOfRange(배열명, start, end)
//        int[] arr = {1,4,6,7,8,1,2,4,6};
//        int[] arr1 = Arrays.copyOf(arr, 4);
//        System.out.println(Arrays.toString(arr1));
//        int[] arr2 = Arrays.copyOfRange(arr, 3, 6);
//        System.out.println(Arrays.toString(arr2));

        int[] answer2 = new int[commands.length];

        for (int i = 0 ; i < commands.length; i++) {
            int[] tmp =  new int[commands[i][1] - commands[i][0] +1];
            tmp = Arrays.copyOfRange(array, commands[i][0] -1, commands[i][1]);
            Arrays.sort(tmp);
            answer2[i] = tmp[commands[i][2] - 1];
        }
        System.out.println(Arrays.toString(answer2));



    }
}
