package homeWork2;

public class MainForBankAccount { //В main внесите деньги, снимите и выведите баланс.
    public static void main(String[] args) {
        BankAccount newBankAccount = new BankAccount("Tester", 100000);
        newBankAccount.printBalance();

        newBankAccount.deposit(100);
        newBankAccount.printBalance();

        newBankAccount.withdraw(300);
        newBankAccount.printBalance();

        newBankAccount.withdraw(9999999);
        newBankAccount.printBalance();
    }
}
