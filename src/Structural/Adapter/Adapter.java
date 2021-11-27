package Structural.Adapter;

public class Adapter extends AmericanCharger implements EuropeanCharger {

    @Override
    public void charge() {
        chargeAmerican();
    }
}
