package Structural.Decorator;

public class Program {
    public static void main(String[] args) {
        Staff staff = new Surgery(new Nurse());
        System.out.println(staff.doJob());
    }
}
