package Creational.AbstractFactory;

public class DisposableScalpel implements Scalpel{
    @Override
    public void cut() {
        System.out.println("Cut by using disposable scalpel");
    }
}
