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
    

}

class Circle extends Shape{
    int radius;

    Circle(String color, int radius){
        super(color);
        this.radius = radius;
    }    

    double getArea(){
        if(radius <= 0){
            throw new InvalidDimensionException(); 
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

    double getArea(){
        if(width <= 0 || height <= 0){
            throw new InvalidDimensionException();
        }else{
            System.out.println("Rectangle color: " + color);
            System.out.println("Rectangle Width: " + width);
            System.out.println("Rectangle Height: " + height);
        }
    }
}

public class ShapeCalculator {
    public static void main(String args[]){
        Circle c1 = new Circle("Blue", 12);
        try{
            c1.getArea();
        }catch(InvalidDimensionException e){
            System.out.println("Error: " + e);
        }
        Rectangle r1 = new Rectangle("White", 10, 0);
        try{
            c1.getArea();
        }catch(InvalidDimensionException e){
            System.out.println("Error: " + e);
        }
    }
   
}
