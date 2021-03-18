package Eason.Study.Decorator;

public class Flying extends Decorator {
    @Override
    public void showPower() {
        System.out.println("Flying");
        component.showPower();

    }
}
