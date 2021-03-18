package Eason.Study.FactoryMethod;

public class EatingSell implements ISellable {
    @Override
    public void sell() {
        System.out.println("I want sell food");
    }
}
