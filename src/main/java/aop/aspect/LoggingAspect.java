package aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;


@Component
@Aspect
public class LoggingAspect {
    // выполняет перед методом
    @Before("execution(public void getBook())") // пойнткат
    public void beforeGetBookAdvice() {
        System.out.println("beforeGetBookAdvice: попытка получить книгу");
    }
}
