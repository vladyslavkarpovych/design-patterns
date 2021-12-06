package Behavioral.Visitor;

public class SeniorDeveloper implements Developer{
    @Override
    public void create(ProjectClass projectClass) {
        System.out.println("Rewriting class after Junior");
    }

    @Override
    public void create(Database database) {
        System.out.println("Fixing DB");

    }

    @Override
    public void create(Test test) {
        System.out.println("Writing reliable test");
    }
}
