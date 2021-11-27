package Creational.Prototype;

public class Program {
    public static void main(String[] args) {
        Citizen citizen = new Citizen("Vladyslav", "Karpovych", 358911);
        System.out.println(citizen);

        CitizenFactory citizenFactory = new CitizenFactory(citizen);
        Citizen citizenClone = citizenFactory.cloneInfo();
        System.out.println(citizenClone);
    }
}
