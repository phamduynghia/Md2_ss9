package bt4;

public class Main {
    public static void main(String[] args) {
        // Tạo đối tượng Rectangle và Circle
        Shape rectangle = new Rectangle(4, 5, "blue");
        Shape circle = new Circle(3, "red");

        // Hiển thị diện tích và màu sắc của các hình
        System.out.println("------ Rectangle ------");
        rectangle.display(); // Hiển thị màu sắc và diện tích của Rectangle

        System.out.println("------ Circle ------");
        circle.display(); // Hiển thị màu sắc và diện tích của Circle
    }
}