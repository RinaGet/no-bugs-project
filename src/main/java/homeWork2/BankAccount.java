package homeWork2;

public class BankAccount {

    private String owner;
    private double balance;

    public BankAccount(String owner, double balance){
        this.owner = owner;
        this.balance = balance;
    }

    public String getOwner(){
        return this.owner;
    }

    public double getBalance(){
        return this.balance;
    }

    public void setOwner(String newOwner){
        this.owner = newOwner;
    }

    public void deposit(double amount){  // balance + amount
        balance = balance + Math.max(0, amount);
    }

    public void withdraw(double amount){ // balance - amount
        balance = balance - Math.min(balance, amount);
    }

    public void printBalance(){
        System.out.println("Current balance: " + balance);
    }

}
