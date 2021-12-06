package Behavioral.Iterator;

public class JavaDeveloperRunner {
    public static void main(String[] args) {
        String[] skills = {"Java", "Maven", "MySQL", "Spring"};

        JavaDeveloper javaDeveloper = new JavaDeveloper("Vladyslav Karpovych", skills);

        Iterator iterator = javaDeveloper.getIterator();
        System.out.println("Developer: " + javaDeveloper.getName());
        System.out.print("Skills: ");

        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }
}
