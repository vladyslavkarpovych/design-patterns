package Creational.AbstractFactory;

public class Program {
    private final Scalpel scalpel;
    private final Tweezers tweezers;

    public Program(Factory factory) {
        scalpel = factory.createScalpel();
        tweezers = factory.createTweezers();
    }

    private void create() {
        scalpel.cut();
        tweezers.keep();
    }

    private static Program createSetOfInstruments(String type) {
        Program program;
        Factory factory;
        if (type.equalsIgnoreCase("reusable")) {
            factory = new ReusableFactory();
        } else if (type.equalsIgnoreCase("disposable")) {
            factory = new DisposableFactory();
        } else {
            throw new RuntimeException("Unknown: " + type);
        }
        program = new Program(factory);

        return program;
    }

    public static void main(String[] args) {
        Program program = createSetOfInstruments("reusable");
        program.create();
    }
}
