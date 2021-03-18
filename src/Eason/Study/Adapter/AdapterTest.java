package Eason.Study.Adapter;

public class AdapterTest {
    public static void main(String[] args) {
        NBAPlayer a =new USAPlayer();
        a.Attrack();
        a.Defense();

        NBAPlayer b =new Translator(new ChinesePlayer());
        b.Defense();
        b.Attrack();
    }
}

