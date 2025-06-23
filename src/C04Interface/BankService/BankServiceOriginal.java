package C04Interface.BankService;

public class BankServiceOriginal {
    void deposit(long money, BankAccount ba) {
        //현재 얼마있는지 조회
            ba.udpdateBalance(money + ba.getBalance());
        //그 금액과 money와 합산하여 updateBalance

    }
    public static boolean withdraw(long money, BankAccount ba) {
        // 현재 얼마있는지 조회 && 출금금액과 비교
        if(ba.getBalance() < money){
            return false;
        } else { // 그 금액과 money와 차감
            ba.udpdateBalance(ba.getBalance() - money);
            return true;
        }

    }
}
