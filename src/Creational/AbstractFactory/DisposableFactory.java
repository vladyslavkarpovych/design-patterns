package Creational.AbstractFactory;

public class DisposableFactory implements Factory {
    @Override
    public Scalpel createScalpel() {
        return new DisposableScalpel();
    }

    @Override
    public Tweezers createTweezers() {
        return new DisposableTweezers();
    }
}
