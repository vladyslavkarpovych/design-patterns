package Creational.Builder;

public interface CandidateBuilder {
    CandidateBuilder setName(String name);

    CandidateBuilder setSurname(String surname);

    CandidateBuilder setGender(String gender);

    CandidateBuilder setAge(int age);

    CandidateBuilder setSalaryExpectation(int salaryExpectation);

    CandidateBuilder setExperience(int experience);

    CandidateBuilder setPosition(String position);

    CandidateBuilder setSkills(String skills);

    Candidate build();
}
