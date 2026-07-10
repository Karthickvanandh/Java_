package OOPS.RentVehicle;
import java.util.*;

class Vehicle{
    private String licensePlate;
    String brand;
    int availableCount;

    Vehicle(String licensePlate, String brand, int availableCount){
        this.licensePlate = licensePlate;
        this.brand = brand;
        this.availableCount = availableCount;
    }

    void calculateRentalCost(int day){

    }

    void isAvailableForRent(){
        if(availableCount <= 0){
            throw new IllegalArgumentException("Not available"); 
        }
        System.out.println(brand + " available for rent");
    }

}

class Car extends Vehicle{
    int cost = 1000;
    Car(String licensePlate, String brand, int availableCount){
        super(licensePlate, brand, availableCount);
    }

    void calculateRentalCost(int day){
        System.out.println("Total cost for the car rents: " + (day * cost));
    }
}

class Bike extends Vehicle{
    int cost = 500;

    Bike(String licensePlate, String brand, int availableCount){
        super(licensePlate, brand, availableCount);
    }
    
    void calculateRentalCost(int day){
        System.out.println("Total cost for the bike rents: " + (day * cost));
    }
}

class Truck extends Vehicle{
    int cost = 2000;

    Truck(String licensePlate, String brand, int availableCount){
        super(licensePlate, brand, availableCount);
    }
    
    void calculateRentalCost(int day){
        System.out.println("Total cost for the truck rents: " + (day * cost));
    }

}

class RentalStore{
    rentVehicle(String licensePlate){
        
        
    }
    returnVehicle(String licensePlate){

    }
}

public class RentVehicle {
    public static void main(String args[]){

    }
}
