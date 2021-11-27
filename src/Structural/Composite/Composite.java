package Structural.Composite;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Suitcase {

    private List<Suitcase> components = new ArrayList<>();

    public void addComponent(Suitcase component) {
        components.add(component);
    }

    public void removeComponent(Suitcase component) {
        components.remove(component);
    }

    @Override
    public void things() {
        for (Suitcase suitcase : components) {
            suitcase.things();
        }
    }
}
