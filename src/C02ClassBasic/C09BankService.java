package C02ClassBasic;
//        계좌개설 및 입출금 서비스 : id(auto_increment), accountNumber(String), balance(long).
//        주의사항1 : main메서드에서 입출력 처리를 하고, deposit, withdraw, transfer 메서드는 BankAccount클래스에 생성.
//        주의사항2 : 프로그램은 항상 실행될수 있도록 전체코드를 while(true)처리
//        서비스번호를 입력하세요. 1.개설 2.조회 3.입금 4.출금 5.송금
//        1.계좌개설 : 계좌번호와 현재가지고 계신돈을 입력하세요. -> 자동으로 id값 증가되어 세팅
//        2.계좌조회 : 계좌조회서비스입니다. 계좌번호를 입력해주세요. -> 잔고출력
//        3.입금 : 계좌입금서비스입니다. 계좌번호와 입금금액을 입력해주세요. -> 현재 계좌에 얼마가 있습니다. 출력.
//        4.출금 : 계좌출금서비스입니다. 계좌번호와 출금금액을 입력해주세요.(잔액검증) -> 남은 금액은 얼마입니다. 또는 잔액이 부족합니다. 출력.
//        5.송금 : 송금서비스입니다. 본인의 계좌번호를 입력해주세요. 보내고자 하는 상대방의 계좌번호를 입력해주세요. 송금금액을 입력해주세요.(잔액검증) -> 남은 금액은 얼마입니다. 또는 잔액이 부족합니다
import java.io.*;
import java.util.*;
import java.util.HashMap;
import java.util.Map;

public class C09BankService {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = {"개설", "조회", "입금", "출금", "송금"};
//        BankAccount객체를 담아둘 자료구조 선언
        Map<String, BankAccount> baMap = new HashMap<>();

        String s;
        while (true) {
           String option = br.readLine();
            switch (option) {
                case "개설":
                    System.out.println("성함 계좌번호 납입금을 입력하시오.");
                    String[] input = br.readLine().split(" ");
                    baMap.put(input[1] ,new BankAccount(input[0], input[1], Long.parseLong(input[2])));
                    System.out.println("개설됨");
                    System.out.println(baMap.get(input[1]));
                    break;
                case "조회":
                    System.out.println("조회할 계좌번호를 입력하시오.");
                    String search = br.readLine();
                    for (String ba : baMap.keySet()) {
                        if(search.equals(ba)) {
                            System.out.println(baMap.get(ba).getBalance());
                        }
                    }

                    break;
                case "입금":
                    System.out.println("입금할 계좌번호를 입력하세요");
                    String deposit_account = br.readLine();
                    System.out.println("입금할 금액을 입력하세요.");
                    long deposit_money = Long.parseLong(br.readLine());
                    for (String ba : baMap.keySet()) {
                        if(deposit_account.equals(ba)) {
                            baMap.get(deposit_account).deposit(deposit_money);
                            System.out.println(ba);
                            break;
                        }
                    }

                    break;
                    case "출금":
                    System.out.println("출금할 게좌번호를 입력하세요");
                    String withdraw_account = br.readLine();
                    System.out.println("출금할 금액 입력하세요");
                    long withdraw_money = Long.parseLong(br.readLine());
                    for (String ba : baMap.keySet()) {
                        if(withdraw_account.equals(ba)) {
                            baMap.get(ba).withdraw(withdraw_money);
                        }
                    }
                    break;
                case "송금":
                    System.out.println("송금할 게좌번호를 입력하세요");
                    String transfer_account = br.readLine();
                    System.out.println("송금할 금액 입력하세요");
                    long transfer_money = Long.parseLong(br.readLine());
                    for (String ba : baMap.keySet()) {
                        if(transfer_account.equals(ba)) {
                            baMap.get(ba).transfer(baMap.get(ba), transfer_money);
                        }
                    }
                    break;

            }
        }
    }
}
    class BankAccount {
        private static int id = 0;
        private int seperateId;
        private String name;
        private String number;
        private long balance;

        public BankAccount(String name, String number, long balance) {
            this.seperateId = id++;
            this.name = name;
            this.number = number;
            this.balance = balance;
        }


        // getter 생성
        public int getId() {
            return this.seperateId;
        }
        public String getName() {
            return this.name;
        }

        public String getNumber() {
            return this.number;
        }

        public long getBalance() {
            return this.balance;
        }

        // setter 생성 -> 의도를 명확히 한 메서드 생성
        public void setBalance(long balance) {
            this.balance = balance;
        }

        /* ************************************************************************* */
/* 1.*/ public void deposit(long money) {
            this.balance += money;
        }
/* 2.*/ public boolean withdraw(long money) {
            //잔고가 있으면 차감 후 true
            if(this.balance > money) {
                this.balance -= money;
                return true;
                //잔고가 없으면 false 리턴
            } else {
                return false;
            }

        }
//        매개변수로 BankAccount 또는 String의 accountNumber 둘다 사용가능

/* 3.*/ public boolean transfer(BankAccount targetAccount, long money) {
            //잔고가 있으면 차감 후 true
            if(this.balance > money) {
                this.balance -= money;
                targetAccount.balance += money;
                return true;
                //잔고가 없으면 false 리턴
            } else {
                return false;
            }
        }

        @Override
        public String toString() {
            return "계좌명: " + name + "계좌번호: '" + number + "잔고: " + balance;
        }
    }

