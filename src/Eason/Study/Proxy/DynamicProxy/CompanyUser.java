package Eason.Study.Proxy.DynamicProxy;

public class CompanyUser implements IUser {

    @Override
    public void SubmitWork()
    {
        System.out.println("I finish my work");
    }
}
