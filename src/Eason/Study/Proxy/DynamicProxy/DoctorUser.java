package Eason.Study.Proxy.DynamicProxy;

public class DoctorUser implements  IUser{
    @Override
    public void SubmitWork() {
        System.out.println("the operation is very successful");
    }
}
