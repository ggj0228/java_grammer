package C04Interface.BankService;

public class BankKakaoService implements BankService {

    @Override
    public void deposit(long money, BankAccount ba) {
        ba.udpdateBalance(money + ba.getBalance());
    }

    @Override
    public boolean withdraw(long money, BankAccount ba) {
        if(ba.getBalance() < money){
            return false;
        } else { // 그 금액과 money와 차감
            ba.udpdateBalance(ba.getBalance() - money);
            return true;
        }
    }
}
