package cdxy.demo.lession8;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AspectJ {

    public void PointCut(){}

    public void beforAdvice(JoinPoint joinPoint){
        System.out.println("Method="+joinPoint.getSignature().getName());
    }

    public void AfterAdvice(JoinPoint joinPoint){
        System.out.println("name");
    }

    public void AfterReturning(JoinPoint joinPoint,Object result){
        System.out.println(result);
    }

    public void AfterThrowing(JoinPoint joinPoint,Exception ex){
        System.out.println(ex);
    }
}
