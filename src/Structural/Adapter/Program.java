package Structural.Adapter;

public class Program {
    public static void main(String[] args) {
        EuropeanCharger europeanCharger = new Adapter();
        europeanCharger.charge();
    }
}
