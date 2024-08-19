package bt2;

public class Main {
    public static void main(String[] args) {


//Kiểm thử Class Shape
        System.out.println("-------- - SHAPE----------");

        Shape shape = new Shape();
        System.out.println(shape);

        shape = new Shape("red", false);
        System.out.println(shape);

//kiểm thử Class Circle
        System.out.println("-------- - CIRCLE----------");

        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle(3.5);
        System.out.println(circle);

        circle = new Circle(3.5, "indigo", false);
        System.out.println(circle);
//Kiểm thử RECTANGLE
        System.out.println("---------RECTANGLE----------");
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);

        rectangle = new Rectangle(2.3, 5.8);
        System.out.println(rectangle);

        rectangle = new Rectangle(2.5, 3.8, "orange", true);
        System.out.println(rectangle);
//Kiểm thử SQUARE
        System.out.println("---------SQUARE----------");

        Square square = new Square();
        System.out.println(square);

        square = new Square(2.3);
        System.out.println(square);

        square = new Square(5.8, "yellow", true);
        System.out.println(square);

        Colorable[] shapes = {
                new Circle(5),
                new Rectangle(4, 6),
                new Square(3)
        };

        // Xử lý từng hình
        for (Colorable shape1 : shapes) {
            Shape shapeInstance = (Shape) shape1;
            System.out.printf("Area of %s: %.2f%n", shapeInstance.toString(), shapeInstance instanceof Circle ? ((Circle) shapeInstance).getArea() : shapeInstance instanceof Rectangle ? ((Rectangle) shapeInstance).getArea() : ((Square) shapeInstance).getArea());

            ((Colorable) shape1).howToColor();
        }

    }
}