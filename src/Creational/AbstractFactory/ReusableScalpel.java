package Creational.AbstractFactory;

public class ReusableScalpel implements Scalpel{
    @Override
    public void cut() {
        System.out.println("Cut by using reusable scalpel");
    }
}
