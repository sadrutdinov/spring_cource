package aop.aspect;

import aop.Book;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
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
    @Before("aop.aspect.MyPointcuts.allAddMethods()") // пойнткат
    public void beforeAddLoggingAdvice(JoinPoint joinPoint) {

        System.out.print(ANSI_GREEN);
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        System.out.println("methodSignature = " + methodSignature);
        System.out.println("methodSignature.getMethod() = " + methodSignature.getMethod());
        System.out.println("methodSignature.getReturnType() = " + methodSignature.getReturnType());
        System.out.println("methodSignature..getName() = " + methodSignature.getName());

        if (methodSignature.getName().equals("addBook")) {
            Object[] args = joinPoint.getArgs();
            for (Object obj: args
                 ) {
                if (obj instanceof Book) {
                    Book myBook = (Book) obj;
                    System.out.println("Информация о книге: " +
                            "Название - " + myBook.getName() +
                            ", Автор - " + myBook.getAuthor() +
                            ", Год публикации - " + myBook.getYearOfPublication());
                }
                else if (obj instanceof String) {
                    System.out.println("Книгу в библиотеку добавляет " + obj);
                }
            }
        }

        System.out.println("beforeGetLoggingAdvice: логирование попытки получить книгу/журнал");
        System.out.println("---------------------------------------");
        System.out.print(ANSI_RESET);
    }




}
