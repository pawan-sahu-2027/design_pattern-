package adapterDesignPattern;

public interface BankApi {
    double getBalance(String accountNumber);

    boolean sendMoney(String fromAcc,
                      String toAcc,
                      double amount);
}
