package Eason.Study.Builder;

public class Director {
    private ActorBuilder builder;
    public Director(ActorBuilder builder)
    {
        this.builder = builder;
    }
    public Actor createActor()
    {
        this.builder.buildCostume();
        this.builder.buildFace();
        this.builder.buildHairStyle();
        this.builder.buildSex();
        this.builder.buildType();
        return this.builder.getActor();
    }
}
