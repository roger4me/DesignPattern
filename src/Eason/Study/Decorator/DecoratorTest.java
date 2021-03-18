package Eason.Study.Decorator;

import Eason.Study.FactoryMethod.ProductFactory;
import Eason.Study.FactoryMethod.SellFactory;
import org.junit.jupiter.api.Test;

public class DecoratorTest {
    @Test
    public void test1() {

        Person p=new Person();
        UnderWearing underWearing = new UnderWearing();
        underWearing.SetInComponent(p);
        underWearing.showPower();
        System.out.println("========================================");
        Flying f= new Flying();
        f.SetInComponent(underWearing);
        f.showPower();



    }
}
