package aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;


@Component
@Aspect
public class LoggingAndSecurityAspect {

    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RESET = "\u001B[0m";

    @Pointcut("execution( * get*())")
    private void allGetMethods() {}

    // выполняет перед методом
    @Before("allGetMethods()") // пойнткат
    public void beforeGetLoggingAdvice() {
        System.out.print(ANSI_GREEN);
        System.out.println("beforeGetLoggingAdvice: попытка получить книгу/журнал");
        System.out.print(ANSI_RESET);
    }

    @Before("allGetMethods()")
    public void beforeGetSecurityAdvice() {
        System.out.print(ANSI_GREEN);
        System.out.println("beforeGetSecurityAdvice: проверка прав на получение книги/журнала");
        System.out.print(ANSI_RESET);
    }


}
