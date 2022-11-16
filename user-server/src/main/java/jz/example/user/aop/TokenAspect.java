package jz.example.user.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @Author JZ
 * @Date 2022/11/2
 */

@Aspect
@Component
@Order(1)
public class TokenAspect {

    private final Logger log = LoggerFactory.getLogger(this.getClass());


    @Pointcut("execution(* jz.example.user.business..*.*(..))")
    public void tokenOperation() {}

    @After("jz.example.user.aop.TokenAspect.tokenOperation()")
    public void doTokenCheck() {
        //System.out.println("后置通知");
    }

    public TokenAspect() {

    }

}
