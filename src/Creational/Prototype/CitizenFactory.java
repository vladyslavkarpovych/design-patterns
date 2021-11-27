package Creational.Prototype;

public class CitizenFactory {
    Citizen citizen;

    public CitizenFactory(Citizen citizen) {
        this.citizen = citizen;
    }

    public void setCitizen(Citizen citizen) {
        this.citizen = citizen;
    }

    Citizen cloneInfo() {
        return (Citizen) citizen.clone();
    }
}
