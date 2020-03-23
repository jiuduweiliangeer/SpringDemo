package cdxy.demo.lession7;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AspectJ {
    @Before("execution(public * *(..))")
    public void beforAdvice(JoinPoint joinPoint){
        System.out.println("name");
    }

}
