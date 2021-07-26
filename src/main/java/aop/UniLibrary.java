package aop;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary{

    public void getBook(Book book) {
        System.out.println("берем книгу из UniLibrary " + book.getName());
    }

    public String returnBook() {
        System.out.println("мы возвращаем книгу в UniLibrary");
        return "OK";
    }

    public void getMagazine(int a) {
        System.out.println("берем журнал из UniLibrary");
    }

}
