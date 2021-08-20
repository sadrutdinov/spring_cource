package aop.aspect;

import aop.Student;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Aspect
public class UniversityLoggingAspect {

    @Before("execution( * getStudents())")
    public void beforeGetStudentsLoggingAdvice() {
        System.out.println("beforeGetStudentsLoggingAdvice: логируем получение списка студентов" +
                " перед методом getStudents()");
    }

    @AfterReturning(pointcut = "execution( * getStudents())", returning = "students")
    public void afterReturningGetStudentsLoggingAdvice(List<Student> students) {
        //students.add(new Student("Zaur", 2, 2.3));

        Student firstStudents = students.get(0);
        String nameSurname = firstStudents.getNameSurname();
        nameSurname = "Mr. " + nameSurname;
        firstStudents.setNameSurname(nameSurname);

        firstStudents.setAvgGrade(firstStudents.getAvgGrade() + 1);



        System.out.println("afterReturningGetStudentsLoggingAdvice: логируем получение списка студентов" +
                " после работы метода getStudents()");
    }


}
