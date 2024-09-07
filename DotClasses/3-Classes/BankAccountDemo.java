import java.util.Scanner;

class BankAccount {
    String accountNumber, accountHolderName;
    double balance;

    void addData(String accNum, String accHolder, double bal) {
        accountNumber = accNum;
        accountHolderName = accHolder;
        balance = bal;
    }

    void printData() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: $" + balance);
    }
}

public class BankAccountDemo {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.addData("12345678", "John Doe", 5000.00);
        account.printData();
    }
}
