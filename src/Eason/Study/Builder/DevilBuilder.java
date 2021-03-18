package Eason.Study.Builder;


public class DevilBuilder extends ActorBuilder {
    @Override
    public void buildType() {
        this.Type ="恶魔";
    }

    @Override
    public void buildSex() {
        this.Sex ="爷们儿";

    }

    @Override
    public void buildFace() {
        this.Face="丑逼";

    }

    @Override
    public void buildCostume() {
        this.Costume ="垃圾装";

    }

    @Override
    public void buildHairStyle()
    {
        this.HairStyle="擦";

    }
    @Override
    public Actor getActor() {
        return this;
    }
}
