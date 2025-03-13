//code on encapsulation
//class
class BankAccount{
    private double balance;
    public BankAccount(double initialBalance){
        balance = initialBalance;
    }
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }
    public double getBalance() {
        return balance;
    }
//main
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount(500);
        myAccount.deposit(4000);
        myAccount.withdraw(160);
            System.out.println("Final Balance: " + myAccount.getBalance());
        }
    }
