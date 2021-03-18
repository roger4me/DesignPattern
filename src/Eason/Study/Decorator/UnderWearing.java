package Eason.Study.Decorator;

public class UnderWearing extends Decorator{

    @Override
    public void showPower() {
        System.out.println("Red Underwear");
        component.showPower();
    }
}
