package Eason.Study.FactoryMethod;

public class SugarFactory extends SellFactory {

    @Override
    public ISellable createSellMehod() {
        return new SugarSell();
    }
}
