public class Main2 {

    public static void main(String[] args) {

        BankAccount account1 =
                new BankAccount("Иван Петров", 1000);

        BankAccount account2 =
                new BankAccount("Анна Сидорова");

        account1.printInfo();
        account2.printInfo();

        account1.transfer(account2, 300);

        account2.withdraw(500);

        account1.printInfo();
        account2.printInfo();

        System.out.println(
                "Всего счетов: " + BankAccount.getAccountsCount()
        );
    }
}

