package C04Interface.BankService;

import java.util.Scanner;

public class BankController {
    public static void main(String[] args) {
        System.out.println("계좌번호를 입력");
        Scanner sc = new Scanner(System.in);
        String accountNumber = sc.nextLine();
        BankAccount ba = new BankAccount(accountNumber);
        while (true) {
            System.out.println("입금 -> 1번, 출금 -> 2번");
            String serviceNumber = sc.nextLine();
            BankService bs;
            if (serviceNumber.equals("1")) {
                System.out.println("입금방식을 선택하세요 1.카카오페이 2.토스페이");
                int num = Integer.parseInt(sc.nextLine());
                System.out.println("토스페이 선택");
                System.out.println("입금하실 금액 입력해주세요");
                long money = Long.parseLong(sc.nextLine());
                if (num == 1) {
                    System.out.println("카카오페이 선택");
                    bs = new BankKakaoService();
                    bs.deposit(money, ba);
                } else {
                    bs = new BankTossService();
                    bs.deposit(money, ba);
                }
                System.out.println("입금이 완료되었습니다");
            } else {
                System.out.println("출금방식을 선택하세요 1.카카오페이 2.토스페이");
                int num = Integer.parseInt(sc.nextLine());
                System.out.println("출금하실 금액을 입력하세요");
                long money = Long.parseLong(sc.nextLine());
                if (num == 1) {
                    System.out.println("카카오페이 선택");
                    bs = new BankKakaoService();
                    if (bs.withdraw(money, ba)) {
                        System.out.println("출금이 정상처리됐습니다");
                    } else {
                        System.out.println("출금이 안됐어");
                    }
                } else {
                    bs = new BankTossService();
                    System.out.println("토스페이 선택");
                    if (bs.withdraw(money, ba)) {
                        System.out.println("출금이 정상처리됐습니다");
                    } else {
                        System.out.println("출금이 안됐어");
                    }
                }
            }
        }
    }
}
