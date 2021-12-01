package Structural.Decorator;

public class StaffDecorator implements Staff {
    Staff staff;

    public StaffDecorator(Staff staff) {
        this.staff = staff;
    }

    @Override
    public String doJob() {
        return staff.doJob();
    }
}
