package Eason.Study.Decorator;

public class Decorator extends Component {

    protected Component component;

    public  void SetInComponent(Component component)
    {
        this.component =component;
    }

    @Override
    public void showPower() {
       this.component.showPower();
    }
}
