package TestProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyTest {
    TestInterface target;
    public ProxyTest(TestInterface target) {
        this.target = target;
    }
    public Object getProxy(){
        Object proxy=null;
        ClassLoader classLoader=target.getClass().getClassLoader();
        Class[] interfacetest=target.getClass().getInterfaces();
        InvocationHandler handler=new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("执行前");
                method.invoke(target);
                System.out.println("执行后");
                return 0;
            }
        };
        proxy=Proxy.newProxyInstance(classLoader,interfacetest,handler);
        return proxy;
    }
}
