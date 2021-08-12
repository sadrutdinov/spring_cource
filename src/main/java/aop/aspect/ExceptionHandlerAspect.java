package aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(30)
public class ExceptionHandlerAspect {
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RESET = "\u001B[0m";

    @Before("aop.aspect.MyPointcuts.allGetMethods()")
    public void beforeGetExceptionHandlingAdvice() {
        System.out.print(ANSI_GREEN);
        System.out.println("beforeGetExceptionHandlingAdvice: ловим обрабатываем исключения при попытке получения книги/журнала");
        System.out.print(ANSI_RESET);
    }
}
