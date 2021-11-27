package Creational.AbstractFactory;

public class DisposableTweezers implements Tweezers{
    @Override
    public void keep() {
        System.out.println("Keep by using disposable tweezers");
    }
}
