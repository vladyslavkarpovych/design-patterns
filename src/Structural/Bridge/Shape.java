package Structural.Bridge;

public abstract class Shape {
    Color color;

    public Shape(Color c) {
        color = c;
    }

    abstract void showDetails();
}
