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

public class RetailStoreEx1 {
    public static void main(String args[]){
        Product p1 = new Product("candy", 10, 2);
        Product p2 = new Product("Egg", 5.2, 10);
        p1.showProduct();
        p2.showProduct();
        Product.showTotalProduct();

    }
    
}
