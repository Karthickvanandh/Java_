package OOPS;

abstract class BankAccount{
    String customerName;
    private long accountNumber;
    private String password;
    long phoneNumber;
    protected double Balance;

    BankAccount(String customerName, long accountNumber, String password, long phoneNumber){
        this.customerName = customerName;
        this.accountNumber = accountNumber;
        this.password = password;
        this.phoneNumber = phoneNumber;
    }

    boolean login(long accountNo, String pass){
        if(this.accountNumber == accountNo && this.password.equals(pass)){
            return true;
        }else{
            return false;
        }
    }

    abstract void withdraw(double amount);

    void display(String customerName, long accountNumber, long phoneNumber){
        System.out.println("Customer Name: " + customerName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Phone Number: " + phoneNumber);
    }

    void setBalance(double Balance){
        if(Balance < 0){
            System.out.println("Invalid Balance");
        }
        else{
            this.Balance = Balance;
        }
    }

    double getBalance(){
        return Balance;
    }
}

class SavingsAccount extends BankAccount{

    static String accountType = "Saving Account";

    SavingsAccount(String customerName, long accountNumber, String password, long phoneNumber){
        super(customerName, accountNumber, password, phoneNumber);
    }
    

    void deposite(double amount){
        if(getBalance() < 0){
            System.out.println("Invalid Balance");
        }
        else{
            setBalance(getBalance() + amount);
            System.out.println("Amount deposited: " + amount);
        }
    }

    @Override
    void withdraw(double amount){
        if((getBalance() - amount) < 500){
            System.out.println("Invalid Balance");
        }
        else{
            setBalance(getBalance() - amount);
            System.out.println("Balance Amount: " + getBalance());
        }
    }

    void displayBalance(){
        System.out.println("Total balance: " + getBalance());
    }
}

class CurrentAccount extends BankAccount{
    Double creditLimit = 0.0;
    CurrentAccount(String customerName, long accountNumber, String password, long phoneNumber, Double creditLimit){
        super(customerName, accountNumber, password, phoneNumber);
        this.creditLimit = creditLimit;
        this.Balance = creditLimit;
    }

    void deposite(double amount){
        System.out.println("Amount due:" + (creditLimit - getBalance()));
        setBalance(getBalance() + amount);
        
    }

    @Override
    void setBalance(double balance){
        if(balance < -creditLimit){
            System.out.println("Overdraft limit exceeded!");
        }
        else{
            this.Balance = balance;
        }
    }

    @Override
    void withdraw(double amount){
        if((getBalance() - amount < -creditLimit)){
            System.out.println("Overdraft limit exceeded!");
        }else{
            setBalance(getBalance() - amount);
            System.out.println("Balance Amount: " + getBalance());
        }
    }


}

public class Bank {
    public static void main(String args[]){
        SavingsAccount s1 = new SavingsAccount("AAA", 12332131, "1234", 1234567890);
        SavingsAccount s2 = new SavingsAccount("BBB", 45646446, "4567", 1654567890);
        if(s1.login(12332131, "1234")){
            s1.setBalance(1000);
            System.out.println("Total Balance: " + s1.getBalance());
            s1.displayBalance();
            s1.deposite(20000);
            s1.displayBalance();
            s1.withdraw(5000);
            s1.displayBalance();
            s1.display("AAA", 12332131, 1234567890);
        }else{
            System.out.println("Invalid credentials!");     
        }
        if(s2.login(45646446, "1234")){
            s2.setBalance(1000);
            System.out.println("Total Balance: " + s2.getBalance());
            s2.displayBalance();
            s2.deposite(2000);
            s2.displayBalance();
            s2.display("BBB", 45646446, 1654567890);
        }else{
            System.out.println("Invalid credentials!");     
        }
        CurrentAccount c1 = new CurrentAccount("CCC", 46644656, "9874", 1797464875, 10000.0);
        if(c1.login(46644656,"9874")){
            c1.withdraw(2000);
            c1.deposite(1000);
            c1.withdraw(20000);
        }else{
            System.out.println("Invalid credentials!"); 
        }
        
      

    }
    
}
