package bt4;

public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle() {
        super();
        this.width = 1.0;
        this.height = 1.0;
    }

    public Rectangle(double width, double height) {
        super();
        this.width = width;
        this.height = height;
    }

    public Rectangle(double width, double height, String color) {
        super(color);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Rectangle area: " + getArea());
    }
}
