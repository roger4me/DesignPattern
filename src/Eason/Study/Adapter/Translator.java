package Eason.Study.Adapter;

public class Translator extends NBAPlayer {

    private  CBAPlayer p;

    public Translator(CBAPlayer pp)
    {
        p = pp;
    }

    @Override
    public void Attrack() {
        p.gongji();
    }

    @Override
    public void Defense() {
      p.fangshou();
    }
}
