package cdxy.demo.lession4;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Date;

//后置处理器
public class MyBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("5.自己的init方法执行前");
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if (beanName.equals("pet4")){
            Object proxy = Proxy.newProxyInstance(bean.getClass().getClassLoader(),
                    bean.getClass().getInterfaces(), new InvocationHandler() {
                        @Override
                        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                            if (method.getName().equals("eat")){
                                long start = new Date().getTime();
                                Object result = method.invoke(bean,args);
                                long end = new Date().getTime();
                                System.out.println("业务方法执行时间:"+(end-start));
                                return result;
                            }
                            return method.invoke(bean,args);
                        }
                    });
            return proxy;
        }
        System.out.println("8.自己的init方法执行后");
        return bean;
    }
}
