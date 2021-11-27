package Creational.Prototype;

public class Citizen implements Cloneble {
    private String name;
    private String surname;
    private int peselNumber;

    public Citizen(String name, String surname, int peselNumber) {
        this.name = name;
        this.surname = surname;
        this.peselNumber = peselNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getPeselNumber() {
        return peselNumber;
    }

    public void setPeselNumber(int peselNumber) {
        this.peselNumber = peselNumber;
    }

    @Override
    public Object clone() {
        Citizen citizenCopy = new Citizen(name, surname, peselNumber);
        return citizenCopy;
    }

    @Override
    public String toString() {
        return "Info{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", peselNumber=" + peselNumber +
                '}';
    }
}
