package Eason.Study.Adapter;

/**
 * @author eyi
 */
public class ChinesePlayer extends CBAPlayer {
    @Override
    public void gongji() {
        System.out.println("攻击");
    }

    @Override
    public void fangshou() {
        System.out.println("防守");

    }
}
