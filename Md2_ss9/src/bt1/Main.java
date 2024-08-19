package bt1;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

//Kiểm thử Class Shape
//        System.out.println("-------- - SHAPE----------");
//
//        Shape shape = new Shape();
//        System.out.println(shape);
//
//        shape = new Shape("red", false);
//        System.out.println(shape);
//
////kiểm thử Class Circle
//        System.out.println("-------- - CIRCLE----------");
//
//        Circle circle = new Circle();
//        System.out.println(circle);
//
//        circle = new Circle(3.5);
//        System.out.println(circle);
//
//        circle = new Circle(3.5, "indigo", false);
//        System.out.println(circle);
////Kiểm thử RECTANGLE
//        System.out.println("---------RECTANGLE----------");
//        Rectangle rectangle = new Rectangle();
//        System.out.println(rectangle);
//
//        rectangle = new Rectangle(2.3, 5.8);
//        System.out.println(rectangle);
//
//        rectangle = new Rectangle(2.5, 3.8, "orange", true);
//        System.out.println(rectangle);
////Kiểm thử SQUARE
//        System.out.println("---------SQUARE----------");
//
//        Square square = new Square();
//        System.out.println(square);
//
//        square = new Square(2.3);
//        System.out.println(square);
//
//        square = new Square(5.8, "yellow", true);
//        System.out.println(square);




        // Tạo mảng các hình
        Resizable[] shapes = {
                new Circle(5),
                new Rectangle(4, 6),
                new Square(3)
        };

        // Xử lý từng hình
        for (Resizable shape : shapes) {
            if (shape instanceof Circle) {
                Circle circle = (Circle) shape;
                double oldArea = circle.getArea();
                double percent = random.nextDouble() * 100;
                circle.resize(percent);
                double newArea = circle.getArea();
                System.out.printf("Circle: %.2f -> %.2f (%.2f%% increase)%n", oldArea, newArea, percent);
            } else if (shape instanceof Rectangle) {
                Rectangle Rectangle = (Rectangle) shape;
                double oldArea = Rectangle.getArea();
                double percent = random.nextDouble() * 100;
                Rectangle.resize(percent);
                double newArea = Rectangle.getArea();
                System.out.printf("Rectangle: %.2f -> %.2f (%.2f%% increase)%n", oldArea, newArea, percent);
            }
        }
    }
}