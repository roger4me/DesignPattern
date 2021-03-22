package Eason.Study.Proxy.DynamicProxy;

public class DynamicProxyTest {
    public static void main(String[] args) {
        IUser c= new CompanyUser();
        UserProxyInvocationHanlder u =new UserProxyInvocationHanlder(c);
        IUser x = (IUser)u.getProxy();
        x.SubmitWork();
        System.out.println("------------------------------------------");
        IUser doctor=new DoctorUser();
        UserProxyInvocationHanlder p=new UserProxyInvocationHanlder(doctor);
        x=(IUser)p.getProxy();
        x.SubmitWork();

    }
}
