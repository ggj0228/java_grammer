package C01Basic;
import java.io.*;
import java.util.*;

public class C11QueStackDeque {
    public static void main(String[] args) throws IOException {

//        Queue인터페이스를 Linkedlist가 구현한 아래와 같은 방식을 가장 많이 사용
//        Queue<Integer> myQue = new LinkedList<>();
//        myQue.add(10);
//        myQue.add(20);
//        myQue.add(30);
////          poll : queue에서 데이터를 삭제하면서 동시에 return하는 메서드
//        int temp = myQue.poll();
//        System.out.println(temp);       // 10
//        System.out.println(myQue);      // 20, 30
////          peek : queqe에서 데이터를 삭제하지 않고, 가장 앞의 데이터를 반환
//        int temp2 = myQue.peek();   // 20
//        System.out.println(temp2);
//        System.out.println(myQue);
//
////        LinkedList와 ArrayList의 성능차이 비교
//        LinkedList<Integer> linkedList = new LinkedList<>();
//        long starttime = System.currentTimeMillis();
//        for (int i = 0; i < 10000000; i++) {
//            linkedList.add(0, i);
//        }
//        long endtime = System.currentTimeMillis();
//        System.out.println("Linkedlsit에 값 중간 add시에 소요시간: " + (endtime -starttime));
//
//        long starttime2 = System.currentTimeMillis();
//        ArrayList<Integer> arratList = new ArrayList<>();
//        for (int i = 0; i < 10000000; i++) {
//            arratList.add(0,i);
//        }
//        long endtime2 = System.currentTimeMillis();
//        System.out.println(starttime2);
//        System.out.println("ArrayList 값 중간 add시에 소요시간: " + (endtime2 -starttime2));

//        Queue<String> myQue = new LinkedList<>();
//        myQue.add("문서1");
//        myQue.add("문서2");
//        myQue.add("문서3");
//        myQue.add("문서4");
//        myQue.add("문서5");
//
////        queue는 일반적으로 while을 통해 요소 소모
//        while(!myQue.isEmpty()) {
//            System.out.println(myQue.poll());
//        2개씩 poll을 할 경우에는 queue가 empty가 되지 않도록 유의


        //       백준 : 카드 2
//    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//    int n = Integer.parseInt(br.readLine());
//
//    Queue<Integer> nQueue = new LinkedList<>();
//    for (int i = 1; i < n+1; i++ ){
//        nQueue.add(i);
//    }
//
//    while(nQueue.size() != 1){
//        nQueue.poll();
//        int tmp = nQueue.poll();
//        nQueue.add(tmp);
//    }
//        System.out.println(nQueue.peek());


//        백준 요세푸스 문제 0
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String[] line = br.readLine().split(" ");
//        int n = Integer.parseInt(line[0]);
//        int k = Integer.parseInt(line[1]);
//
//        Queue<Integer> myQueue = new LinkedList<>();
//        for (int i = 1; i < n+1; i++) {
//            myQueue.add(i);
//        }
//        List<Integer> list = new ArrayList<>();
//        while(!myQueue.isEmpty()) {
//          for (int i = 1;  i < k; i++){
//             int tmp = myQueue.poll();
//              myQueue.add(tmp);
//          }
//          list.add(myQueue.poll());
//        }
//        StringBuilder sb = new StringBuilder();
//        sb.append("<");
//        for (int i = 0; i < list.size(); i++){
//            if(i == list.size() -1) {
//                sb.append(list.get(i));
//            } else {
//                sb.append(list.get(i)).append(", ");
//            }
//        }
//        sb.append(">");
//        System.out.println(sb);

//      길이제한큐
//        Queue<String> blockingQueue = new ArrayBlockingQueue<>(3);
//        blockingQueue.add("문서1");
//        blockingQueue.add("문서2");
//        blockingQueue.add("문서3");
//        blockingQueue.add("문서4"); // 길이초과시 error

//      offer : 길이 제한될 경우 제한된 길이까지만 insert
//        blockingQueue.offer("문서1");
//        blockingQueue.offer("문서2");
//        blockingQueue.offer("문서3");
//        blockingQueue.offer("문서4");
//        System.out.println(blockingQueue);

/* ************************************************************************************************
//          우선순위큐:  데이터를 pull할 때 정렬된 데이터결과값(최소값) 보장
//        전체 데이터가 계속해서 변경되면서 지속적으로 최소값을 추출해야하는 경우
//        Queue<Integer> pq = new PriorityQueue<>();
//        pq.add(30);
//        pq.add(20);
//        pq.add(10);
//        pq.add(40);
//        pq.add(50);
//        System.out.println(pq);// add할 때까지는 전체 정렬이 되어있지 않음
//        while (!pq.isEmpty()) {
//            System.out.println(pq.poll());  // 1개씩 poll할 때마다 최소값을 뽑아낸다. log(n)의 복잡도
//        }
*******************************************************************************************************/

/* ************************************************************************************************
//        백준 : 최소힙
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//
//        PriorityQueue<Integer> pq = new PriorityQueue<>();
//        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i < n; i++) {
//            int input = Integer.parseInt(br.readLine());
//
//            if(input == 0) {
//                if (pq.isEmpty()) {
//                    sb.append("0\n");
//                } else {
//                    sb.append(pq.poll()).append("\n");
//                }
//            } else {
//                pq.add(input);
//            }
//
//        }
//        System.out.println(sb);

**************************************************************************************** */


/* **************************************************************************************

//        <최대 힙>
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//
//        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
//        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i < n; i++) {
//            int input = Integer.parseInt(br.readLine());
//
//            if(input == 0) {
//                if (pq.isEmpty()) {
//                    sb.append("0\n");
//                } else {
//                    sb.append(pq.poll()).append("\n");
//                }
//            } else {
//                pq.add(input);
//            }
//
//        }
//        System.out.println(sb);
************************************************************************************/

        // 프로그래머스 더 맵게
//        int[] scoville = {1, 2, 3, 9, 10, 12};
//        int K = 7;
//        PriorityQueue<Integer> pq = new PriorityQueue<>();
//
//        for (int i : scoville){
//            pq.add(i);
//        }
//        int answer =0;
//        while(!pq.isEmpty()) {
//           int testpq =  pq.peek();
//           if(testpq >= K) {
//               break;
//           }
//            int f_pq = pq.poll();
//            if(pq.isEmpty()){       // testpq로 K보다 높은 값이 없음이 확인 됐음에도 불구하고 하나만 poll했을 시 비어있다면,
//                answer = -1;       // 아무리 짱구를 굴려봐도 k보다 크게 만드는 경우의 수x
//                break;
//            }
//            int s_pq = pq.poll();
//            int new_scoville = f_pq + (s_pq * 2);
//            pq.add(new_scoville);
//            answer++;
//
//        }
//
//        System.out.println(answer);

//         stack : 후입선출

//        Stack<Integer> stack = new Stack<>();
//        stack.push(10);
//        stack.push(20);
//        stack.push(30);
//        System.out.println(stack.pop());    // 제거되면서 값 return
//        System.out.println(stack.peek());   //값만 return
//        System.out.println(stack.size());
//        System.out.println(stack.isEmpty());

//        프로그래머스 올바른 괄호

//        deque : addFisrt, addLast, pollLast, pollFirst, peekFirst, peekLast
        Deque<Integer> d1 = new ArrayDeque<>();
        d1.addLast(10);
        d1.addLast(20);
        d1.addFirst(30);
        System.out.println(d1.pollLast());  //20
        System.out.println(d1.pollFirst());  //30
        System.out.println(d1.peekLast());  //10
    }
}

