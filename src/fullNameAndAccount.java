public class fullNameAndAccount {
    public static void main(String[] args) {
        Account account = new Account("123456789", "John", "Doe", 5000.0);
        account.displayAccountDetails();

        account.deposit(1500.0);
        account.displayAccountDetails();

        account.withdraw(2000.0);
        account.displayAccountDetails();
    }
}
