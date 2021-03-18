package Eason.Study.FactoryMethod;

public class ProductFactory extends SellFactory {
    @Override
    public ISellable createSellMehod() {
        return new ProductSell();
    }
}
