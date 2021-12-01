package Structural.Bridge;

public class Program {
    public static void main(String[] args) {
        Shape shape = new Square(new Blue());
        shape.showDetails();
    }
}
