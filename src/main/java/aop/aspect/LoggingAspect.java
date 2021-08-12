package aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;


@Component
@Aspect
@Order(10)
public class LoggingAspect {

    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RESET = "\u001B[0m";


//    @Pointcut("execution(* aop.UniLibrary.*(..))")
//    private void allMethodsFromUniLibrary() {}
//
//    @Pointcut("execution(public void aop.UniLibrary.returnMagazine())")
//    private void returnMagazineFromUniLibrary() {}
//
//    @Pointcut("allMethodsFromUniLibrary() && !returnMagazineFromUniLibrary()")
//    private void allMethodsExceptReturnMagazineFromUniLibrary() {}
//
//    @Before("allMethodsExceptReturnMagazineFromUniLibrary()")
//    public void beforeAllMethodsExceptReturnMagazineAdvice() {
//        System.out.print(ANSI_GREEN);
//        System.out.println("beforeAllMethodsExceptReturnMagazineAdvice: writing log #1");
//        System.out.print(ANSI_RESET);
//    }


//    @Pointcut("execution(* aop.UniLibrary.get*())")
//    private void allGetMethodsFromUniLibrary() {
//    }
//
//
//    @Pointcut("execution(* aop.UniLibrary.return*())")
//    private void allReturnMethodsFromUniLibrary() {
//    }
//
//    @Pointcut("allReturnMethodsFromUniLibrary() || allGetMethodsFromUniLibrary()")
//    private void allGetAndReturnMethodsFromUniLibrary() {}
//
//
//    @Before("allGetMethodsFromUniLibrary()")
//    public void beforeGetLoggingAdvice() {
//        System.out.print(ANSI_GREEN);
//        System.out.println("beforeGetLoggingAdvice: writing log #1");
//        System.out.print(ANSI_RESET);
//    }
//
//    @Before("allReturnMethodsFromUniLibrary()")
//    public void beforeReturnLoggingAdvice() {
//        System.out.print(ANSI_GREEN);
//        System.out.println("beforeReturnLoggingAdvice: writing log #2");
//        System.out.print(ANSI_RESET);
//    }
//
//    @Before("allGetAndReturnMethodsFromUniLibrary()")
//    public void beforeGetAndReturnLoggingAdvice() {
//        System.out.print(ANSI_GREEN);
//        System.out.println("beforeGetAndReturnLoggingAdvice: writing log #3");
//        System.out.print(ANSI_RESET);
//    }


    // выполняет перед методом
    @Before("aop.aspect.MyPointcuts.allGetMethods()") // пойнткат
    public void beforeGetLoggingAdvice() {
        System.out.print(ANSI_GREEN);
        System.out.println("beforeGetLoggingAdvice: логирование попытки получить книгу/журнал");
        System.out.print(ANSI_RESET);
    }




}
