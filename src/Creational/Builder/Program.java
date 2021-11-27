package Creational.Builder;

public class Program {
    public static void main(String[] args) {
        Candidate candidate = new CandidateBuilderImpl().setName("Vladyslav").setAge(19).setGender("male").build();
        System.out.println(candidate);
    }
}
