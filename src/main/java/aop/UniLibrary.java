package aop;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary{

    @Override
    public void getBook() {
        System.out.println("берем книгу из UniLibrary");
    }

    public String returnBook() {
        System.out.println("мы возвращаем книгу в UniLibrary");
        return "OK";
    }

    public void getMagazine() {
        System.out.println("берем журнал из UniLibrary");
    }

}
