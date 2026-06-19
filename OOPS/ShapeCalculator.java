package OOPS;
import java.util.*;

class InvalidDimensionException extends Exception{
    InvalidDimensionException(String message){
        super(message);
    }
}

interface Measurable{
    double getArea() throws InvalidDimensionException;
}

abstract class Shape implements Measurable{
    String color;

    Shape(String color){
        this.color = color;
    }
    
    public abstract double getArea() throws InvalidDimensionException;     
    

}

class Circle extends Shape{
    int radius;

    Circle(String color, int radius){
        super(color);
        this.radius = radius;
    }    

    public double getArea() throws InvalidDimensionException {
        if(radius <= 0){
            throw new InvalidDimensionException("Invalid radius"); 
        }
        else{
            return Math.PI * radius * radius;
        }
    }

}

class Rectangle extends Shape{
    int width;
    int height;

    Rectangle(String color, int width, int height){
        super(color);
        this.width = width;
        this.height = height;
    }

    public double getArea() throws InvalidDimensionException{
        if(width <= 0 || height <= 0){
            throw new InvalidDimensionException("Invalid dimension");
        }else{
            return width * height;
        }
    }
}

public class ShapeCalculator {
    public static void main(String args[]){
        Circle c1 = new Circle("Blue", 12);
        try{
            System.out.println("Circle area: " + c1.getArea());
        }catch(InvalidDimensionException e){
            System.out.println("Error: " + e);
        }finally {
            System.out.println("Calculation done");
        }
        Rectangle r1 = new Rectangle("White", 10, 0);
        try{
            r1.getArea();
        }catch(InvalidDimensionException e){
            System.out.println("Error: " + e);
        }
        finally {
            System.out.println("Calculation done");
        }
    }
   
}
