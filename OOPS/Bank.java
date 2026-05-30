package OOPS;

class BankAccount{
    String customerName;
    private long accountNumber;
    private String password;
    long phoneNumber;
    private double Balance;

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

    void withdraw(double amount){
        if(getBalance() < 0){
            System.out.println("Invalid Balance");
        }
        else{
            setBalance(getBalance() - amount);
            System.out.println("Amount withdraw: " + amount);
        }
    }

    void displayBalance(){
        System.out.println("Total balance: " + getBalance());
    }
}

public class Bank {
    public static void main(String args[]){
        SavingsAccount s1 = new SavingsAccount("AAA", 12332131, "1234", 1234567890);
        if(s1.login(12332131, "1234")){
            s1.setBalance(1000);
            System.out.println("Total Balance: " + s1.getBalance());
            s1.displayBalance();
            s1.deposite(20000);
            s1.displayBalance();
            s1.withdraw(5000);
            s1.displayBalance();
        }else{
            System.out.println("Invalid credentials!");     
        }
        

    }
    
}
