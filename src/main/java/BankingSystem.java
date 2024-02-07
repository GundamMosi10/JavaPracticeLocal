import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BankingSystem {
    private Map<String, Double> accounts;

    public class BankingSystem() {
        this.accounts = new HashMap<>();
    }
    public void createAccount(String accountNumber, double initialBalance) {
        if (!accounts.containsKey(accountNumber)) {
            accounts.put(accountNumber, initialBalance);
            System.out.println("Account created successfully.");
        } else {
            System.out.println("Account already exists.");
        }
    }

    public void deposit(String accountNumber, double amount) {
        if (accounts.containsKey(accountNumber)) {
            double currentBalance = accounts.get(accountNumber);
            accounts.put(accountNumber, currentBalance + amount);
            System.out.println("Deposit successful.");
        } else {
            System.out.println("Account does not exist.");
        }
    }

    public void withdraw(String accountNumber, double amount) {
        if (accounts.containsKey(accountNumber)) {
            double currentBalance = accounts.get(accountNumber);
            if (currentBalance >= amount) {
                accounts.put(accountNumber, currentBalance - amount);
                System.out.println("Withdrawal successful.");
            } else {
                System.out.println("Insufficient funds.");
            }
        } else {
            System.out.println("Account does not exist.");
        }
    }

    public void transfer(String fromAccount, String toAccount, double amount) {
        if (accounts.containsKey(fromAccount) && accounts.containsKey(toAccount)) {
            double senderBalance = accounts.get(fromAccount);
            if (senderBalance >= amount) {
                accounts.put(fromAccount, senderBalance - amount);
                accounts.put(toAccount, accounts.get(toAccount) + amount);
                System.out.println("Transfer successful.");
            } else {
                System.out.println("Insufficient funds.");
            }
        } else {
            System.out.println("One or both accounts do not exist.");
        }
    }

    public static void main(String[] args) {
        BankingSystem bankingSystem = new BankingSystem();
        Scanner scanner = new Scanner(System.in);
        boolean isRunning = true;
        while (isRunning) {
            System.out.println("\nBanking System");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Transfer");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1: System.out.print("Enter account number: ");
                String accountNumber = scanner.nextLine();
                System.out.print("Enter initial balance: ");
                double initialBalance = scanner.nextDouble();
                bankingSystem.createAccount(accountNumber, initialBalance);
                break;

                case 2: System.out.print("Enter account number: ");
                String depositAccount = scanner.nextLine();
                System.out.print("Enter amount to deposit: ");
                double depositAmount = scanner.nextDouble();
                bankingSystem.deposit(depositAccount, depositAmount);
                break;

                case 3: System.out.print("Enter account number: ");
                String withdrawAccount = scanner.nextLine();
                System.out.print("Enter amount to withdraw: ");
                double withdrawAmount = scanner.nextDouble();
                bankingSystem.withdraw(withdrawAccount, withdrawAmount);
                break;
            }
        }
    }
}
