package Creational.Builder;

public class Candidate {
    String name;
    String surname;
    String gender;
    int age;
    int salaryExpectation;
    int experience;
    String position;
    String skills;

    @Override
    public String toString() {
        return "Candidate{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", salaryExpectation=" + salaryExpectation +
                ", experience=" + experience +
                ", position='" + position + '\'' +
                ", skills='" + skills + '\'' +
                '}';
    }
}
