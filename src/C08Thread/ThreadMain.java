package C08Thread;

import java.io.*;
import java.util.*;

// 스레드 : 작업의 주체
public class ThreadMain {
    public static void main(String[] args) throws InterruptedException {
//        // 단일 스레드 실행 -> 순차적으로 진행이 되용~
//        for (int i = 0; i < 1000; i++) {
//            Library.borrow();
//        }
//        System.out.println(Library.getBookCount());

        // 멀티스레드 생성
//        // 방법1. 스레드 클래스 상속방식
//        Thread t1 =new MyThread();
//        Thread t2 =new MyThread();
//        Thread t3 =new MyThread();
//        Thread t4 =new MyThread();
//        // Thread 클래스 안에 start메서드 내장되어있고, start매서느든 run메서드를 호출하면서 스레드 생성.
//        // 스레드 각각의 코드 실행순서는 보장되지 않음
//        t1.start();
//        t2.start();
//        t3.start();
//        t4.start();
//        System.out.println("hello world");
//        // 방법2. Runnable을 직접 구현한 객체를 Thread클래스 생성자에 주입하는 방식
//        new Thread(() -> System.out.println("스레드 실행시작(MyThread)1")).start();
//        new Thread(() -> System.out.println("스레드 실행시작(MyThread)2")).start();
//        new Thread(() -> System.out.println("스레드 실행시작(MyThread)3")).start();
//        new Thread(() -> System.out.println("스레드 실행시작(MyThread)4")).start();
//        System.out.println("hello");

        // 멀티스레드 동시성 이슈 테스트 -> 궁극적인 db내 데이터 처리 동시성 해결은 redis사용
        for (int i = 0; i < 1000; i++) {
            Thread t1 = new Thread(() -> Library.borrow());
            t1.start();
                t1.join();  // 한 스레드의 작업이 모두 완료될 떄, 다른 스레드 생성하여 작업 수행 -> 사실상 단일스레드처럼 동작되므로, 성능 저하
        }
        Thread.sleep(20000);
        System.out.println(Library.getBookCount()); // main메서드가 실행


    }
}
