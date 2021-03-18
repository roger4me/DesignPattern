package Eason.Study.Builder;

public class BuilderTest {
    public static void main(String[] args) {

        Director d =new Director(new DevilBuilder());
        Actor c= d.createActor();
        System.out.println(c.Sex);
        System.out.println(c.Costume);
        System.out.println(c.Face);
        System.out.println(c.HairStyle);
        System.out.println(c.Type);
    }
}
