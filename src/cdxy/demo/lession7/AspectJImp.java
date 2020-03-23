package cdxy.demo.lession7;

import org.springframework.stereotype.Component;

@Component
public class AspectJImp implements Aspectjinterfacetest{
    @Override
    public int test(int i, int j) {
        int result=i+j;
        return result;
    }
}
