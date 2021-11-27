package Creational.AbstractFactory;

public class ReusableTweezers implements Tweezers{
    @Override
    public void keep() {
        System.out.println("Keep by using reusable tweezers");
    }
}
