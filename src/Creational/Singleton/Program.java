package Creational.Singleton;

public class Program {
    public static void main(String[] args) {
        Singleton noOne = Singleton.getInstance("Hello");
        Singleton noTwo = Singleton.getInstance("How are you doing?");
        System.out.println(noOne.value);
        System.out.println(noTwo.value);
    }
}
