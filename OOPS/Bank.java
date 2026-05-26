package OOPS;

class BankAccount{
    String customerName;
    long accountNumber;
    long phoneNumber;
    private double Balance;

    BankAccount(String customerName, long accountNumber, long phoneNumber){
        this.customerName = customerName;
        this.accountNumber = accountNumber;
        this.phoneNumber = phoneNumber;
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


    SavingsAccount(String customerName, long accountNumber, long phoneNumber){
        super(customerName, accountNumber, phoneNumber);

    }

    
}

public class Bank {
    public static void main(String args[]){
        SavingsAccount s1 = new SavingsAccount("AAA", 12332131, 1234567890);
        System.out.println("Customer Details: " + s1.customerName);
        System.out.println("accountNumber: " + s1.accountNumber);
        System.out.println("phoneNumber: " + s1.phoneNumber);
        System.out.println("Total Balance: " + s1.getBalance());
        s1.setBalance(1000);
        System.out.println("Total Balance: " + s1.getBalance());

    }
    
}
