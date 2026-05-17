package OOPS;
import java.util.*;

class Product{
        String name;
        double price;
        int quantity;
        static int totalProducts = 0;

        Product(String name, double price, int quantity){
            this.name = name;
            this.price = price;
            this.quantity = quantity;
            totalProducts++;
        }

        static void showTotalProduct(){
            System.out.println("Total Product: " + totalProducts);
        }

        void showProduct(){
            System.out.println("Name: " +name );
            System.out.println("Price: " +price);
            System.out.println("Quantity: " +quantity);
        }
}

class Customer{
    String name;
    long phone;
    static int totalCustomers;

    Customer(String name, long phone){
        this.name = name;
        this.phone = phone;
        totalCustomers++;
    }

    void showCustomer(){
        System.out.println("Customer name: " +name );
        System.out.println("Phone: " +phone);
    }

    static void showTotalCustomers(){
        System.out.println("Total Customers: " +totalCustomers);

    }
}


class Bill{
    Customer customer;
    double totalAmount;
    static int totalBill;

    Bill(Customer customer){
        this.customer = customer;
        totalAmount = 0;
        totalBill++;
    }
    void addItem(Product p, int qty){
        totalAmount += (p.price * qty);
        System.out.println("Added: " +p.name);
    }   


    void printBills(){
        this.customer.showCustomer();   
        System.out.println("Total Amount: "+totalAmount);
    }

    static void showTotalBills(){
        System.out.println("Total Bills: "+totalBill);
    }
}

public class RetailStoreEx1 {
    public static void main(String args[]){
        Product p1 = new Product("candy", 10, 2);
        Product p2 = new Product("Egg", 5.2, 10);
        p1.showProduct();
        p2.showProduct();
        Product.showTotalProduct();
        Customer c1 = new Customer("AAA",1234567890);
        Customer c2 = new Customer("BBB",1345678901);
        c1.showCustomer();
        c2.showCustomer();
        Customer.showTotalCustomers();
        Bill b1 = new Bill(c1);
        b1.addItem(p1, 3);
        b1.printBills();
        Bill.showTotalBills();
    }    
}
