package adapterDesignPattern;

public class YESBankAdapter implements BankApi {
    @Override
    public double getBalance(String accountNumber) {
        return 0;
    }

    @Override
    public boolean sendMoney(String fromAcc, String toAcc, double amount) {
        System.out.println("YES Bank API: Sending " + amount + " rs from " + fromAcc + " to " + toAcc);
        return false;
    }
}
