package C02ClassBasic;

import java.util.ArrayList;
import java.util.List;

public class C12RecursivePractice {
    public static void main(String[] args) {
        // for 문 1-10까지 누적합계
        int sum = 0;
        for (int i = 1; i < 11; i ++ ) {
            sum+= i;
        }
        System.out.println(sum);
        // 재귀함수로 1-10 누적합계
        sumAcc(1, 10);
        System.out.println("재귀함수 누적합: " + sumAcc(1,10));

        // 재귀함수로 factorial값 구하기 1-n까지를 모두 곱한 값
        System.out.println(factorial(5));

        // 피보나치 수열 : f(n-1) + f(n-2) = f(n)
        // 1 1 2 3 5 8 13 21 34 ...
        //피보나치 수열의 10번째 값은?
        List<Integer> fiboList = new ArrayList<>();
        fiboList.add(1);
        fiboList.add(1);
        for (int i = 2; i < 10; i++) {
            int fiboSum = 0;
            for (int j = i -2; j < i; j++) {
                fiboSum += fiboList.get(j);
            }
            fiboList.add(fiboSum);
        }
        System.out.println(fiboList.get(9));
/* ********************************************************************************* */
        // 강사님 풀이
        int n1 = 1;
        int n2 =1;
        int n3 = 0;
        for (int i = 2; i < 10; i++) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
        }
        System.out.println(n3);
/* ************************************************************************************* */
        // 풀이2 : dp알고리즘(기억하기(메모이제이션) 알고리즘)을 활용한 풀이법
        int[] arr = new int[10];
        arr[0] = 1;
        arr[1] = 1;
        for (int i = 2; i < 10; i++) {
            arr[i] = arr[i-1] + arr[i-2];
        }
        System.out.println(arr[9]);

        // 풀이3: 재귀함수를 이용한 피보나치

        System.out.println("재귀함수: " + fibonacci(10));

    }
    public static int sumAcc(int n, int target) {
        if(n > target) {
            return 0;
        }
        return n+sumAcc(n+1, target);
    }
    public static int factorial(int n) {
        if(n == 1) {
            return 1;
        }
        return n * factorial(n-1);
    }

    public static int fibonacci (int n) {
        if(n <= 2) {
            return 1;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }


}
