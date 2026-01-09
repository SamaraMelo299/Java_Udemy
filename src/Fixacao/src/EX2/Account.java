package Fixacao.src.EX2;

public class Account {
    private int numberAccount;
    private String holder;
    private double balance;

    //Construtores
    public Account( int numberAccount, String holder) {
        this.numberAccount = numberAccount;
        this.holder = holder;
    }

    public Account(int numberAccount, String holder, double initialDeposit) {
        this.numberAccount = numberAccount;
        this.holder = holder;
        deposit(initialDeposit);
    }

    public Account() {
    }

    //Geeter and Setters

    public int getNumberAccount() {
        return numberAccount;
    }
    public void setNumberAccount(int numberAccount) {
        this.numberAccount = numberAccount;
    }

    public String getHolder() {
        return holder;
    }
    public void setHolder(String holder) {
        this.holder = holder;
    }

    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount){
        balance += amount;
    }

    public void withdraw(double amount){
        System.out.println("Updated account data:");
        balance -= amount + 5.0;
    }

    public String toString() {
        return "Account  "
                + numberAccount
                + ", Holder: "
                + holder
                + ", Balance: $ "
                + String.format("%.2f", balance);
    }
}
