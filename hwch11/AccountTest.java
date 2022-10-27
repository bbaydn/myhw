package hwch11;
public class AccountTest {
    public static void main(String[] args) {
        AccountClient accountClient = new AccountClient();
        Account from = new Account();
        Account to = new Account();

        accountClient.withDraw(from, 200.0);
        accountClient.deposit(from, 650.0);
        accountClient.deposit(to, 200.0);
        accountClient.transfer(to, from, 650.0);
    }
}
