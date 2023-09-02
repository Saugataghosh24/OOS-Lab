class Account {
    protected int accountNumber;
    protected String holderName;
    protected double balance;

    public Account(int accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Holder Name: " + holderName);
        System.out.println("Balance: Rs" + balance);
    }
}

class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(int accountNumber, String holderName, double balance, double interestRate) {
        super(accountNumber, holderName, balance);
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public double calculateYearlyInterest() {
        return balance * interestRate / 100;
    }


    public void displayAccountDetails() {
        super.displayAccountDetails();
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}

class CurrentAccount extends Account {
    public CurrentAccount(int accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }
}

class Manager {
    private Account[] accounts;
    private int numAccounts;

    public Manager() {
        accounts = new Account[100];
        numAccounts = 0;
    }

    public void addAccount(Account account) {
        accounts[numAccounts++] = account;
    }

    public void printAllAccounts() {
        System.out.println("List of Accounts:");
        for (int i = 0; i < numAccounts; i++) {
            accounts[i].displayAccountDetails();
            System.out.println("-----------------------------");
        }
    }
}

class Main {
    public static void main(String[] args) {
        Manager manager = new Manager();

        SavingsAccount savingsAccount1 = new SavingsAccount(1001, "Saugata Ghosh", 50000, 3.5);
        SavingsAccount savingsAccount2 = new SavingsAccount(1002, "Hrishav Paul", 60000, 4.0);

        CurrentAccount currentAccount1 = new CurrentAccount(2001, "Arka Roy", 8000);
        CurrentAccount currentAccount2 = new CurrentAccount(2002, "Sayan Das", 12000);
        CurrentAccount currentAccount3 = new CurrentAccount(2003, "Shreya Sarkar", 15000);

        manager.addAccount(savingsAccount1);
        manager.addAccount(savingsAccount2);
        manager.addAccount(currentAccount1);
        manager.addAccount(currentAccount2);
        manager.addAccount(currentAccount3);

        double interest1 = savingsAccount1.calculateYearlyInterest();
        double interest2 = savingsAccount2.calculateYearlyInterest();

        System.out.println("Yearly Interest for Savings Account1 : Rs"+interest1);
        System.out.println("Yearly Interest for Savings Account2 : Rs"+interest2);

        manager.printAllAccounts();
    }
}