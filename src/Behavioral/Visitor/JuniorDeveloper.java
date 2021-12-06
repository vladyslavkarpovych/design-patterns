package Behavioral.Visitor;

public class JuniorDeveloper implements Developer{
    @Override
    public void create(ProjectClass projectClass) {
        System.out.println("Write poor class...");
    }

    @Override
    public void create(Database database) {
        System.out.println("Drop DB...");
    }

    @Override
    public void create(Test test) {
        System.out.println("Write not reliable test...");
    }
}
