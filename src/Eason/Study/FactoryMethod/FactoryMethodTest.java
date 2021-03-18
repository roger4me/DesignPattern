package Eason.Study.FactoryMethod;

import Eason.Study.SimpleFactory.Moveable;
import Eason.Study.SimpleFactory.SimpleFactory;
import org.junit.jupiter.api.Test;

public class FactoryMethodTest {
    @Test
    public void test1() {
        SellFactory sf =new ProductFactory();
        sf.createSellMehod().sell();

    }
}
