package cdxy.demo.lession4;

import com.sun.media.jfxmediaimpl.MediaDisposer;
import org.omg.PortableServer.THREAD_POLICY_ID;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Pet implements IPet, BeanNameAware , ApplicationContextAware, InitializingBean, DisposableBean {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("2.属性赋值");
        this.name = name;
    }

    public Pet() {
        System.out.println("1.实例化");
    }

    public Pet(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("3.实例id："+s);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("4.注入上下文");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("6.属性赋值完成");
    }

    public void init(){
        System.out.println("7.自己的初始化方法，对应着<bean id='pet4' init-method='init'>");
    }

    @Override
    public void eat(){
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("9.可以执行业务逻辑");
    }
    public void run(){
        System.out.println("9.可以执行业务逻辑");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("10.执行Disposiable的destroy()方法");
    }

    public void end(){
        System.out.println("11.执行自己的end(),对应<bean id='pet4' destory-method='end'>");
    }
}
