package C04Interface.BankService;

public class BankAccount {

    private String accountNumber;
    private Long balance;

    public Long getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public BankAccount(String accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0L;
    }

    // 최종 금액을 통해 update : 아래 매서드를 입/출금 모두에 활용
    public void udpdateBalance(long balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber='" + accountNumber + '\'' +
                ", balance=" + balance +
                '}';
    }
}

