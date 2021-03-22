package Eason.Study.Proxy.DynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class UserProxyInvocationHanlder implements InvocationHandler {

    private IUser cu;

    public UserProxyInvocationHanlder(IUser user)
    {
        cu = user;
    }
    public Object getProxy()
    {
       return Proxy.newProxyInstance(this.getClass().getClassLoader(),cu.getClass().getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        meeting();
        return method.invoke(cu, args);
    }

    private void meeting()
    {
        System.out.println("Meeting......");
    }
}
