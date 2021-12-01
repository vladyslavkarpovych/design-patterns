package Structural.Bridge;

public class Square extends Shape {
    public Square(Color color) {
        super(color);
    }

    @Override
    void showDetails() {
        System.out.println("Квадрат");
        color.setColor();
    }
}
