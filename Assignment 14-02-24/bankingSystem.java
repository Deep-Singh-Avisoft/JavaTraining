<<<<<<< HEAD
import java.util.HashMap;
import java.util.Map;

// BankException class for custom exceptions
class BankException extends Exception {
    public BankException(String message) {
        super(message);
    }
}

// NegativeAmountException class for handling negative amounts
class NegativeAmountException extends BankException {
    public NegativeAmountException(String message) {
        super(message);
    }
}

// BankAccount class to represent a bank account
class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    // Method to deposit funds into the account
    public void deposit(double amount) throws NegativeAmountException {
        try {
            if (amount < 0) {
                throw new NegativeAmountException("Cannot deposit a negative amount");
            }
            balance += amount;
        } catch (NegativeAmountException e) {
            System.err.println(e.getMessage());
        }
    }

    // Method to withdraw funds from the account
    public void withdraw(double amount) throws BankException, NegativeAmountException {
        try {
            if (amount < 0) {
                throw new NegativeAmountException("Cannot withdraw a negative amount");
            }
            if (balance < amount) {
                throw new BankException("Insufficient funds for withdrawal");
            }
            balance -= amount;
        } catch (BankException e) {
            System.err.println(e.getMessage());
        }
    }
}

// Transaction class to represent a transaction
class Transaction {
    private String transactionId;
    private String transactionType;
    private double amount;

    public Transaction(String transactionId, String transactionType, double amount) {
        this.transactionId = transactionId;
        this.transactionType = transactionType;
        this.amount = amount;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public double getAmount() {
        return amount;
    }
}

// BankingSystem class to manage bank accounts and transactions
class BankingSystem {
    private Map<String, BankAccount> accounts;

    public BankingSystem() {
        accounts = new HashMap<>();
    }

    // Method to add a new bank account
    public void addAccount(String accountNumber, double initialBalance) {
        accounts.put(accountNumber, new BankAccount(accountNumber, initialBalance));
    }

    // Method to deposit funds into an account
    public void deposit(String accountNumber, double amount) {
        try {
            if (!accounts.containsKey(accountNumber)) {
                throw new BankException("Invalid account number");
            }
            accounts.get(accountNumber).deposit(amount);
        } catch (BankException e) {
            System.err.println(e.getMessage());
        }
    }

    // Method to withdraw funds from an account
    public void withdraw(String accountNumber, double amount) {
        try {
            if (!accounts.containsKey(accountNumber)) {
                throw new BankException("Invalid account number");
            }
            accounts.get(accountNumber).withdraw(amount);
        } catch (BankException e) {
            System.err.println(e.getMessage());
        }
//        } catch (NegativeAmountException e) {
//            System.err.println(e.getMessage());
//        }
    }

    // Method to transfer funds between accounts
    public void transfer(String fromAccount, String toAccount, double amount) {
        try {
            if (!accounts.containsKey(fromAccount) || !accounts.containsKey(toAccount)) {
                throw new BankException("Invalid account number");
            }
            // Withdraw from sender's account
            accounts.get(fromAccount).withdraw(amount);
            // Deposit into receiver's account
            accounts.get(toAccount).deposit(amount);
        } catch (BankException e) {
            System.err.println(e.getMessage());
        }
//        } catch (NegativeAmountException e) {
//            System.err.println(e.getMessage());
//        }
    }
    public double getBalance(String accountNumber){
        try {
            if (!accounts.containsKey(accountNumber)) {
                throw new BankException("Invalid account number");
            }
           return accounts.get(accountNumber).getBalance();
        } catch (BankException e) {
            System.err.println(e.getMessage());
        }
        return -1;
    }
}

public class bankingSystem {
    public static void main(String[] args) throws BankException, NegativeAmountException {
        BankingSystem bankingSystem = new BankingSystem();
        bankingSystem.addAccount("12345", 1000);

        // Test deposit
        bankingSystem.deposit("12345", 500);
        System.out.println("New balance after deposit: " + bankingSystem.getBalance("12345"));

        // Test withdrawal
        bankingSystem.withdraw("12345", 200);
        System.out.println("New balance after withdrawal: " + bankingSystem.getBalance("12345"));

        // Test transfer
        bankingSystem.addAccount("54321", 0);
        bankingSystem.transfer("12345", "54321", 300);
        System.out.println("Balance in sender's account after transfer: " + bankingSystem.getBalance("12345"));
        System.out.println("Balance in receiver's account after transfer: " + bankingSystem.getBalance("54321"));

        // Test negative amount exception
        bankingSystem.deposit("12345", -100); // Should throw NegativeAmountException

    }
}
=======
import java.util.HashMap;
import java.util.Map;

// BankException class for custom exceptions
class BankException extends Exception {
    public BankException(String message) {
        super(message);
    }
}

// NegativeAmountException class for handling negative amounts
class NegativeAmountException extends BankException {
    public NegativeAmountException(String message) {
        super(message);
    }
}

// BankAccount class to represent a bank account
class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    // Method to deposit funds into the account
    public void deposit(double amount) throws NegativeAmountException {
        try {
            if (amount < 0) {
                throw new NegativeAmountException("Cannot deposit a negative amount");
            }
            balance += amount;
        } catch (NegativeAmountException e) {
            System.err.println(e.getMessage());
        }
    }

    // Method to withdraw funds from the account
    public void withdraw(double amount) throws BankException, NegativeAmountException {
        try {
            if (amount < 0) {
                throw new NegativeAmountException("Cannot withdraw a negative amount");
            }
            if (balance < amount) {
                throw new BankException("Insufficient funds for withdrawal");
            }
            balance -= amount;
        } catch (BankException e) {
            System.err.println(e.getMessage());
        }
    }
}

// Transaction class to represent a transaction
class Transaction {
    private String transactionId;
    private String transactionType;
    private double amount;

    public Transaction(String transactionId, String transactionType, double amount) {
        this.transactionId = transactionId;
        this.transactionType = transactionType;
        this.amount = amount;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public double getAmount() {
        return amount;
    }
}

// BankingSystem class to manage bank accounts and transactions
class BankingSystem {
    private Map<String, BankAccount> accounts;

    public BankingSystem() {
        accounts = new HashMap<>();
    }

    // Method to add a new bank account
    public void addAccount(String accountNumber, double initialBalance) {
        accounts.put(accountNumber, new BankAccount(accountNumber, initialBalance));
    }

    // Method to deposit funds into an account
    public void deposit(String accountNumber, double amount) {
        try {
            if (!accounts.containsKey(accountNumber)) {
                throw new BankException("Invalid account number");
            }
            accounts.get(accountNumber).deposit(amount);
        } catch (BankException e) {
            System.err.println(e.getMessage());
        }
    }

    // Method to withdraw funds from an account
    public void withdraw(String accountNumber, double amount) {
        try {
            if (!accounts.containsKey(accountNumber)) {
                throw new BankException("Invalid account number");
            }
            accounts.get(accountNumber).withdraw(amount);
        } catch (BankException e) {
            System.err.println(e.getMessage());
        }
//        } catch (NegativeAmountException e) {
//            System.err.println(e.getMessage());
//        }
    }

    // Method to transfer funds between accounts
    public void transfer(String fromAccount, String toAccount, double amount) {
        try {
            if (!accounts.containsKey(fromAccount) || !accounts.containsKey(toAccount)) {
                throw new BankException("Invalid account number");
            }
            // Withdraw from sender's account
            accounts.get(fromAccount).withdraw(amount);
            // Deposit into receiver's account
            accounts.get(toAccount).deposit(amount);
        } catch (BankException e) {
            System.err.println(e.getMessage());
        }
//        } catch (NegativeAmountException e) {
//            System.err.println(e.getMessage());
//        }
    }
    public double getBalance(String accountNumber){
        try {
            if (!accounts.containsKey(accountNumber)) {
                throw new BankException("Invalid account number");
            }
           return accounts.get(accountNumber).getBalance();
        } catch (BankException e) {
            System.err.println(e.getMessage());
        }
        return -1;
    }
}

public class bankingSystem {
    public static void main(String[] args) throws BankException, NegativeAmountException {
        BankingSystem bankingSystem = new BankingSystem();
        bankingSystem.addAccount("12345", 1000);

        // Test deposit
        bankingSystem.deposit("12345", 500);
        System.out.println("New balance after deposit: " + bankingSystem.getBalance("12345"));

        // Test withdrawal
        bankingSystem.withdraw("12345", 200);
        System.out.println("New balance after withdrawal: " + bankingSystem.getBalance("12345"));

        // Test transfer
        bankingSystem.addAccount("54321", 0);
        bankingSystem.transfer("12345", "54321", 300);
        System.out.println("Balance in sender's account after transfer: " + bankingSystem.getBalance("12345"));
        System.out.println("Balance in receiver's account after transfer: " + bankingSystem.getBalance("54321"));

        // Test negative amount exception
        bankingSystem.deposit("12345", -100); // Should throw NegativeAmountException

    }
}
>>>>>>> 7ad82ffc657c4a72b792b1c0525534c30609aa10
