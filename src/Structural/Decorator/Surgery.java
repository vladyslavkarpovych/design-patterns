package Structural.Decorator;

public class Surgery extends StaffDecorator {
    public Surgery(Staff staff) {
        super(staff);
    }

    public String makeCut() {
        return "Сделать разрез.";
    }

    @Override
    public String doJob() {
        return super.doJob() + makeCut();
    }
}
