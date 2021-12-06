package Behavioral.Observer;

public class Program {
    public static void main(String[] args) {
        JavaDeveloperJobSite jobSite = new JavaDeveloperJobSite();

        jobSite.addVacancy("Junior Java Developer");
        jobSite.addVacancy("Middle Java Developer");

        Observer firstSubscriber = new Subscriber("Karpovych Vladyslav");
        Observer secondSubscriber = new Subscriber("Steve Jobs");

        jobSite.addObserver(firstSubscriber);
        jobSite.addObserver(secondSubscriber);

        jobSite.addVacancy("Senior Java Developer");

        jobSite.removeVacancy("Junior Java Developer");
    }
}
