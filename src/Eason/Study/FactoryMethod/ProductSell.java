package Eason.Study.FactoryMethod;

public class ProductSell implements ISellable {
    @Override
    public void sell() {
        System.out.println("I want sell product");
    }
}
