package Structural.Decorator;

public class Nurse implements Staff {
    @Override
    public String doJob() {
        return "Сделать инъекцию.";
    }
}
