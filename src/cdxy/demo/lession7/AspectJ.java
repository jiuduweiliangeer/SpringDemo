package cdxy.demo.lession7;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AspectJ {
    @Pointcut(value = "execution(public int cdxy.demo.lession7.AspectJImp.*(int,int))")
    public void PointCut(){}
    @Before("PointCut()")
    public void beforAdvice(JoinPoint joinPoint){
        System.out.println("Method="+joinPoint.getSignature().getName());
    }
    @After("execution(public int cdxy.demo.lession7.AspectJImp.*(int,int))")
    public void AfterAdvice(JoinPoint joinPoint){
        System.out.println("name");
    }
    @AfterReturning(value = "execution(public int cdxy.demo.lession7.AspectJImp.*(int,int))",returning = "result")
    public void AfterReturning(JoinPoint joinPoint,Object result){
        System.out.println(result);
    }
    @AfterThrowing(value ="execution(public int cdxy.demo.lession7.AspectJImp.*(int,int))",throwing = "ex")
    public void AfterThrowing(JoinPoint joinPoint,Exception ex){
        System.out.println(ex);
    }
}
