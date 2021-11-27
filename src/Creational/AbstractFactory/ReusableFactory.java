package Creational.AbstractFactory;

public class ReusableFactory implements Factory {
    @Override
    public Scalpel createScalpel() {
        return new ReusableScalpel();
    }

    @Override
    public Tweezers createTweezers() {
        return new ReusableTweezers();
    }
}
