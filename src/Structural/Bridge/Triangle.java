package Structural.Bridge;

public class Triangle extends Shape{

    public Triangle(Color color) {
        super(color);
    }

    @Override
    void showDetails() {
        System.out.println("Треугольник");
        color.setColor();
    }
}
