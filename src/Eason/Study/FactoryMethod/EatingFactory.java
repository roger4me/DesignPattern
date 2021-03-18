package Eason.Study.FactoryMethod;

public class EatingFactory extends SellFactory{
    @Override
    public ISellable createSellMehod() {
        return new EatingSell();
    }
}
