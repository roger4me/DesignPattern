package Eason.Study.Builder;

public class AngelBuilder extends ActorBuilder {
    @Override
    public void buildType() {
        this.Type ="天使";
    }

    @Override
    public void buildSex() {
        this.Sex ="必须是妞儿";

    }

    @Override
    public void buildFace() {
        this.Face="漂亮";

    }

    @Override
    public void buildCostume() {
        this.Costume ="大天使之翼";

    }

    @Override
    public void buildHairStyle()
    {
        this.HairStyle="光环";

    }
    @Override
    public Actor getActor() {
        return this;
    }
}
