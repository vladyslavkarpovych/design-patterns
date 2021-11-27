package Creational.Builder;

public class CandidateBuilderImpl implements CandidateBuilder {
    Candidate candidate = new Candidate();

    @Override
    public CandidateBuilder setName(String name) {
        candidate.name = name;
        return this;
    }

    @Override
    public CandidateBuilder setSurname(String surname) {
        candidate.surname = surname;
        return this;
    }

    @Override
    public CandidateBuilder setGender(String gender) {
        candidate.gender = gender;
        return this;
    }

    @Override
    public CandidateBuilder setAge(int age) {
        candidate.age = age;
        return this;
    }

    @Override
    public CandidateBuilder setSalaryExpectation(int salaryExpectation) {
        candidate.salaryExpectation = salaryExpectation;
        return this;
    }

    @Override
    public CandidateBuilder setExperience(int experience) {
        candidate.experience = experience;
        return this;
    }

    @Override
    public CandidateBuilder setPosition(String position) {
        candidate.position = position;
        return this;
    }

    @Override
    public CandidateBuilder setSkills(String skills) {
        candidate.skills = skills;
        return this;
    }

    @Override
    public Candidate build() {
        return candidate;
    }
}
