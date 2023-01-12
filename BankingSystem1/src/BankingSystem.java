import java.util.Scanner;

public class BankingSystem {
    private String name;
    private int account_Number;
    private double balance;

    public double checkBalance() {
        return balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAccount_Number(int account_Number) {
        this.account_Number = account_Number;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount >= 0) {
            this.balance += amount;
        } else {
            System.out.println("######################## Deposited amount cant be negative. ########################");
        }
    }

    public int getAccount_Number() {
        return account_Number;
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount < balance) {
            this.balance -= amount;
        } else {
            System.out.println("Insufficient Balance, you can withdraw upto  " + this.checkBalance());
        }
    }

    public boolean addAccount() {
        System.out.println("##################### Enter Account details #####################");
        try {
            Scanner new_account = new Scanner(System.in);
            System.out.println("Enter Account Holder Name: ");
            this.name = new_account.nextLine();
            System.out.println("Enter Account Number");
            this.account_Number = new_account.nextInt();
            System.out.println("Enter Initial Balance");
            this.balance = new_account.nextDouble();
            return true;
        } catch (Exception e) {
            System.out.println("Enter Valid Details.");
            return false;
        }
    }

    public boolean Search(int acc_number) {
        return this.account_Number == acc_number;
    }

    @Override
    public String toString() {
        return "\n" + "[" + "  Account_Number= " + account_Number + "   Account_Holder= " + name + "            Balance= " + balance + ']';
    }
}
