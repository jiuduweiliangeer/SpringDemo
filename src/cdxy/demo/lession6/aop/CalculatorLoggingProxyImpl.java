package cdxy.demo.lession6.aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

public class CalculatorLoggingProxyImpl {
    private ICalculator target;

    public CalculatorLoggingProxyImpl(ICalculator target) {
        this.target = target;
    }

    public Object getProxy(){
        Object proxy = null;
        ClassLoader loader = target.getClass().getClassLoader();
        /*Class[] interfaces = new Class[]{ICalculator.class};*/
        Class[] interfaces = target.getClass().getInterfaces();
        InvocationHandler handler = new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("The method "+method.getName()+" begin with arguments"+ Arrays.asList(args));
                Object result = method.invoke(target,args);
                System.out.println("The method "+method.getName()+" end with result:"+result);
                return result;
            }
        };
        proxy = Proxy.newProxyInstance(loader,interfaces,handler);
        return proxy;
    }
}
