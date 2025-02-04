package adapterDesignPattern;

public class ICICIBankAdapter implements BankApi{
    ICICIBankApi iciciBankApi = new ICICIBankApi();
    @Override
    public double getBalance(String accountNumber) {

        return 0;
    }

    @Override
    public boolean sendMoney(String fromAcc, String toAcc, double amount) {
        System.out.println("ICICI API: Sending " + amount + " rs from " + fromAcc + " to " + toAcc);

        return false;
    }
}
