package aop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.util.Calendar;
import java.util.GregorianCalendar;

@Component
@Aspect
public class NewLoggingAspect {

    @Around("execution(public String returnBook())")
    public Object aroundReturnBookLoggingAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("aroundReturnBookLoggingAdvice: В бибилотеку пытаются вернуть книгу");


        long begin = System.currentTimeMillis();
        Object targetMethodResult = proceedingJoinPoint.proceed();
        long end = System.currentTimeMillis();

        System.out.println("aroundReturnBookLoggingAdvice: В бибилотеку успешно вернули книгу");
        System.out.println("aroundReturnBookLoggingAdvice: метод returnBook " +
                "выполнился за " + (end-begin)+ " миллисекунд");

        return targetMethodResult;
    }
}
