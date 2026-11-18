public class BankAccount {

    private String accountNumber;
    private String owner;
    private double balance;

    private static int accountsCount = 0;

    public BankAccount(String owner) {
        this(owner, 0.0);
    }

    public BankAccount(String owner, double initialBalance) {

        if (initialBalance < 0) {
            throw new IllegalArgumentException(
                    "Начальный баланс не может быть отрицательным"
            );
        }

        this.owner = owner;
        this.balance = initialBalance;

        accountsCount++;

        this.accountNumber = String.format("UA-%04d", accountsCount);
    }

    public boolean deposit(double amount) {

        if (amount <= 0) {
            System.out.println("Ошибка: сумма должна быть больше 0");
            return false;
        }

        balance += amount;
        return true;
    }

    public boolean withdraw(double amount) {

        if (amount <= 0) {
            System.out.println("Ошибка: сумма должна быть больше 0");
            return false;
        }

        if (amount > balance) {
            System.out.println("Ошибка: недостаточно средств на счёте "
                    + accountNumber);
            return false;
        }

        balance -= amount;
        return true;
    }

    public boolean transfer(BankAccount target, double amount) {

        if (target == null || target == this) {
            System.out.println("Ошибка: неправильный счёт получателя");
            return false;
        }

        if (amount <= 0) {
            System.out.println("Ошибка: сумма должна быть больше 0");
            return false;
        }

        if (withdraw(amount)) {

            target.deposit(amount);

            System.out.printf(
                    "Перевод %.2f с %s на %s выполнен%n",
                    amount,
                    accountNumber,
                    target.accountNumber
            );

            return true;
        }

        return false;
    }


    public String getAccountNumber() {
        return accountNumber;
    }

    public String getOwner() {
        return owner;
    }

    public double getBalance() {
        return balance;
    }

    public static int getAccountsCount() {
        return accountsCount;
    }

    public void printInfo() {

        System.out.printf(
                "%s | %s | баланс: %.2f%n",
                accountNumber,
                owner,
                balance
        );
    }
}
