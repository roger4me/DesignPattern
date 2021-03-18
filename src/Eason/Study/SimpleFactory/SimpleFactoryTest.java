package Eason.Study.SimpleFactory;

import org.junit.jupiter.api.Test;

public class SimpleFactoryTest {
    @Test
    public void test1() {
         Moveable m = SimpleFactory.create("car");
         m.run();
        Moveable m1 = SimpleFactory.create("train");
        m1.run();
    }

}
