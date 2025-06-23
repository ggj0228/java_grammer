package C02ClassBasic;

import java.util.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class C08ClassPractice {
    public static void main(String[] args) {
        // 객체 선언 및 List에 2개 정도 add
        Account a1 =  new Account("hong1", "12345", 1000000);
        Account a2 =  new Account("hong2", "54321", 1000000);
        List<Account> list = new ArrayList<>();
        list.add(a1);
        list.add(a2);
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(list);

        // 계좌번호 목록조회
        for(Account a : list) {
            System.out.println(a.getAccountNumber());
        }

        // 사용자1이 사용자2에게 송금
        for (Account a : list) {
            if (a.getAccountNumber().equals("213-1223-3242-01")) {
                a.setBalance((a.getBalance()-50000));
            }
            if(a.getAccountNumber().equals("564-6545-8896-57")) {
                a.setBalance((a.getBalance()+50000));
            }
        }

        // 계좌상세조회 : 계좌번호와  잔고조회
        for(Account a : list) {
            System.out.println("계좌번호: " + a.getAccountNumber() + "잔고: " + a.getBalance());
        }
        // Map을 자료구조로 사용
        Map<String, Account> accountMap = new HashMap<>();
        accountMap.put("12345", new Account("hong1", "12345", 1000000));
        accountMap.put("54321", new Account("hong2", "54321", 1000000));
        // 송금
        Account a = accountMap.get("12345");
        Account b = accountMap.get("54321");
        a.setBalance((a.getBalance()-50000));
        b.setBalance((b.getBalance()+50000));

        // 계좌조회
        for(String ac : accountMap.keySet())     {
            System.out.println(accountMap.get(ac).getAccountNumber());
        }

    }
}
// account 클래스

class Account {
    private String name;
    private String accountNumber;
    private long balance;
    public Account(String name, String accountNumber, long balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public Account () {

    }

    public String getName() {
        return this.name;
    }
    public String getAccountNumber() {
        return this.accountNumber;
    }
    public long getBalance() {
        return this.balance;
    }
    public void setBalance(long balance) {
        this.balance = balance;
    }

    public String toString() {
        return "계좌주명: " + this.name + ", 계좌번호: " + accountNumber + ", 잔고: " + this.balance;
    }

}