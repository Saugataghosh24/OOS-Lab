class BankAccount {
    int accountNumber;
    String ownerName;
    double balance;

    BankAccount(int accountNumber, String ownerName, double balance) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = balance;
    }

    void add(double amount) {
        balance += amount;
    }

    void subtract(double amount) {
        balance -= amount;
    }

    
    String tost() {
        return "Account Number: " + accountNumber + "\n" +
                "Owner Name: " + ownerName + "\n" +
                "Balance: " + balance + "\n";
    }
}

class AccountManager {
    BankAccount accounts[];
    int numOfAccounts;

    AccountManager(int numOfAccounts) {
        accounts = new BankAccount[numOfAccounts];
        this.numOfAccounts = 0;
    }

    void create(int accountNumber, String ownerName, double balance) {
        accounts[numOfAccounts] = new BankAccount(accountNumber, ownerName, balance);
        numOfAccounts++;
    }

    void delete(int accountNumber) {
        for (int i = 0; i < numOfAccounts; i++) {
            if (accounts[i].accountNumber == accountNumber) {
                accounts[i] = accounts[numOfAccounts-1];
                accounts[numOfAccounts-1] = null;
                numOfAccounts--;
                System.out.println("Account deleted.");
                return;
            }
        }
        System.out.println("Account not found.");
    }

    void deposit(int accountNumber, double amount) {
        for (int i = 0; i < numOfAccounts; i++) {
            if (accounts[i].accountNumber == accountNumber) {
                accounts[i].add(amount);
                System.out.println("Amount deposited successfully.");
                return;
            }
        }
        System.out.println("Account not found.");
    }

    void withdraw(int accountNumber, double amount) {
        for (int i = 0; i < numOfAccounts; i++) {
            if (accounts[i].accountNumber == accountNumber) {
                if (accounts[i].balance >= amount) {
                    accounts[i].subtract(amount);
                    System.out.println("Amount withdrawn successfully.");
                } else {
                    System.out.println("Insufficient balance.");
                }
                return;
            }
        }
        System.out.println("Account not found.");
    }

    void printAllAccounts() {
        for (int i = 0; i < numOfAccounts; i++) {
            System.out.println(accounts[i].tost());
        }
    }
}

class Bank {
    public static void main(String[] args) {
        AccountManager manager = new AccountManager(5);
        manager.create(101, "Saugata Ghosh", 60000.0);
        manager.create(102, "Hrishav Paul", 10000.0);
        manager.create(103, "Sayan Das", 80000.0);
        manager.create(104, "Shreya Saha", 15000.0);
        manager.create(105, "Tithi Roy", 20000.0);

        manager.printAllAccounts();
    }
}
