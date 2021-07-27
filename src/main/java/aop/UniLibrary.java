package aop;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary{

    public void getBook() {
        System.out.println("берем книгу из UniLibrary ");
    }

    public void returnBook() {
        System.out.println("мы возвращаем книгу в UniLibrary");
    }

    public void getMagazine() {
        System.out.println("берем журнал из UniLibrary");
    }

    public void returnMagazine() {
        System.out.println("мы возвращаем журнал в UniLibrary");
    }

    public void addBook(){
        System.out.println("Мы добавляем книгу в UniLibrary");
    }

    public void addMagazine(){
        System.out.println("Мы добавляем журнал в UniLibrary");
    }

}
